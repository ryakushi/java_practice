package java12;

public class Main {

  public static void main(String[] args) {
    String crypt = "wajwnsglkajoglrwaxwnjoin"; // �Í�������O�̕����� crypt
    int K1 = 12, K2 = 17;

    //crypt �𕜍�
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
      String block = crypt.substring(i * 4, (i + 1) * 4); // 4�������Ƃɕ���
      char[] chars = block.toCharArray();

      // �����̓���ւ��i�y�A���Ɓj
      for (int j = 0; j < 5; j++) {
        // 1 �����ڂ� 3 �����ځA2 �����ڂ� 4 �����ڂ����ꂼ�����ւ���
        char tmp = chars[0];
        chars[0] = chars[2];
        chars[2] = tmp;

        tmp = chars[1];
        chars[1] = chars[3];
        chars[3] = tmp;

        // 3 �����ڂ� K1 ��A4 �����ڂ� K2 �񍶂ɃV�t�g����
        chars[2] = leftShift(chars[2], k1);
        chars[3] = leftShift(chars[3], k2);

        // 3 �����ڂ� x1 ��A4 �����ڂ� x2 �񍶂ɃV�t�g����
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
