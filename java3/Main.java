import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] array = { 0, 1, 2, 3, 4, 5 }; // Java配列が0始まりのためダミーの0を追加
    int right, left;
    int tmp;

    for (left = 1; left < (array.length / 2); left += 1) {
      right = array.length - left;
      tmp = array[right];
      array[right] = array[left];
      array[left] = tmp;
    }
    System.out.println(Arrays.toString(array));
  }
}
