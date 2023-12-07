package java6;

/**
 * “ñ•ª’Tõ‚Ì—ûK
 */
public class Main {

  public static void main(String[] args) {
    int[] data = { 10, 30, 40, 60, 80, 90, 110, 140, 170, 190, 210, 260 };

    System.out.println(search(data, 10));
  }

  public static int search(int[] data, int target) {
    int ret = -1;
    int left = 0;
    int right = data.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      System.out.println(mid);
      if (data[mid] == target) {
        return mid + 1;
      } else if (target < data[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return ret;
  }
}
