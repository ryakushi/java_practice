/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    int[] arrayNum = { 30, 50, 20, 60, 80, 90, 20 };
    System.out.println(max(arrayNum));
  }

  static int max(int[] data) {
    int max = data[0]; //�ő�l�̏����l��z��̍ŏ��̒l����X�^�[�g����
    for (int i = 1; i < data.length; i++) { //�ϐ�max�Ɣ�r���邽�� i �̃C���f�b�N�X�ԍ���1����X�^�[�g
      if (max < data[i]) {
        // �ϐ�max���data[i]���傫����΍X�V
        max = data[i];
      }
    }

    return max;
  }
}
