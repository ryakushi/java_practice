package java12;

public class Main {

  public static void main(String[] args) {
    String crypt = "wajwnsglkajoglrwaxwnjoin"; // 暗号化する前の文字列 crypt
    int K1 = 12, K2 = 17;

    //crypt を復号
    String S = decrypt(crypt, K1, K2);
    System.out.println(S);
  }

  private static char leftShift(char c, int x) {
    for (int i = 0; i < x; i++) {
      if (c == 'a') {
        c = 'z';
      } else {
        c -= 1;
      }
    }
    return c;
  }

  private static String decrypt(String crypt, int k1, int k2) {
    StringBuilder s = new StringBuilder();
    int lenCrypt = crypt.length();
    for (int i = 0; i < lenCrypt / 4; i++) {
      String block = crypt.substring(i * 4, (i + 1) * 4); // 4文字ごとに分割
      char[] chars = block.toCharArray();

      // 文字の入れ替え（ペアごと）
      for (int j = 0; j < 5; j++) {
        // 1 文字目と 3 文字目、2 文字目と 4 文字目をそれぞれ入れ替える
        char tmp = chars[0];
        chars[0] = chars[2];
        chars[2] = tmp;

        tmp = chars[1];
        chars[1] = chars[3];
        chars[3] = tmp;

        // 3 文字目を K1 回、4 文字目を K2 回左にシフトする
        chars[2] = leftShift(chars[2], k1);
        chars[3] = leftShift(chars[3], k2);

        // 3 文字目を x1 回、4 文字目を x2 回左にシフトする
        int x1 = chars[0] - 'a' + 1;
        int x2 = chars[1] - 'a' + 1;
        chars[2] = leftShift(chars[2], x1);
        chars[3] = leftShift(chars[3], x2);
      }
      s.append(chars);
    }
    return s.toString();
  }
}
