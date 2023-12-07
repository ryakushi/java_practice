package java5;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    int[] arrayNum = { 30, 60, 70, 90, 20 };
    System.out.println(
      "’T‚µ‚Ä‚¢‚é”š‚Í [ " + search(arrayNum, 90) + " ] ”Ô–Ú‚É‚ ‚è‚Ü‚·"
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
