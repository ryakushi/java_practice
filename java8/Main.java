package java8;

public class Main {

  public static void main(String[] args) {
    int[] data = { 30, 60, 70, 90, 20, 100 };
    for (int i : data) {
      System.out.print(i + " ");
    }
    System.out.println();

    sort(data);

    System.out.println();
    for (int element : data) {
      System.out.print(element + " ");
    }
  }

  public static void sort(int[] data) {
    for (int i = 0; i < data.length; i++) {
      int min = i; //�ŏ��̗v�f��[ i ]��0�Ԗڂ���X�^�[�g
      for (int j = i + 1; j < data.length; j++) { // j�̏����l��i + 1�łƂȂ�̗v�f����X�^�[�g
        //�ϐ�min�����������l�������min���X�V
        if (data[j] < data[min]) {
          min = j;
        }
      }
      //�������V�����ŏ��̐��l�Ɗ����̐��l�����ւ�
      int tmp = data[i];
      data[i] = data[min];
      data[min] = tmp;
    }
  }
}
