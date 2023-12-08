package java13;

public class Main {

  public static void main(String[] args) {
    String data = "kamenoaruru";
    int C = 64;
    //���J��
    int K1 = 23;
    int N = 221;

    //�_�C�W�F�X�g�P �Í����̕���
    int digest1 = decrypt(C, K1, N);
    //�_�C�W�F�X�g2 data�̃n�b�V����
    int digest2 = hashing(data);
    // �_�C�W�F�X�g 1 �ƃ_�C�W�F�X�g 2 ��������������
    if (digest1 == digest2) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  // ������data���n�b�V��������֐�
  private static int hashing(String data) {
    int hash = 0;
    for (char c : data.toCharArray()) {
      hash += (int) (c - 'a' + 1);
      hash %= 100;
    }
    hash += 1;
    return hash;
  }

  // �Í��� C ���A���J�� (K1, N) ��p���ĕ�������֐�
  private static int decrypt(int c, int k1, int n) {
    // C �� K1 ��� N �Ŋ������]������߂�
    int decryption = 1;
    for (int i = 0; i < k1; i++) {


        decryption = (decryption * c) % n;
    }
    return decryption;
  }
}
