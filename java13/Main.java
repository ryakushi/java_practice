package java13;

public class Main {

  public static void main(String[] args) {
    String data = "kamenoaruru";
    int C = 64;
    //公開鍵
    int K1 = 23;
    int N = 221;

    //ダイジェスト１ 暗号文の復号
    int digest1 = decrypt(C, K1, N);
    //ダイジェスト2 dataのハッシュ化
    int digest2 = hashing(data);
    // ダイジェスト 1 とダイジェスト 2 が等しいか判定
    if (digest1 == digest2) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  // 文字列dataをハッシュ化する関数
  private static int hashing(String data) {
    int hash = 0;
    for (char c : data.toCharArray()) {
      hash += (int) (c - 'a' + 1);
      hash %= 100;
    }
    hash += 1;
    return hash;
  }

  // 暗号文 C を、公開鍵 (K1, N) を用いて復号する関数
  private static int decrypt(int c, int k1, int n) {
    // C の K1 乗を N で割った余りを求める
    int decryption = 1;
    for (int i = 0; i < k1; i++) {


        decryption = (decryption * c) % n;
    }
    return decryption;
  }
}
