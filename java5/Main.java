/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    int[] arrayNum = { 30, 60, 70, 90, 20 };
    System.out.println(
      "探している数字は [ " + search(arrayNum, 90) + " ] 番目にあります"
    );
  }

  public static int search(int[] data, int target) {
    int ret = -1;
    for (int i = 0; i < data.length; i++) {
      if (target == data[i]) {
        return ret = i + 1;
      }
    }
    return ret;
  }
}
