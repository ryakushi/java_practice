package java7;

public class Main {

  public static void main(String[] args) {
    int[] data = { 30, 60, 70, 50, 20 };
    for (int element : data) {
      System.out.print(element + " ");
    }
    System.out.println();
    sort(data);
    System.out.println();
    for (int sortEl : data) {
      System.out.print(sortEl + " ");
    }
  }

  public static void sort(int[] data) {
    for (int i = data.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (data[j] > data[j + 1]) {
          int tmp = data[j + 1];
          data[j + 1] = data[j];
          data[j] = tmp;
        }
      }
    }
  }
}
