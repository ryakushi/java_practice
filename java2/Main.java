public class Main {

  public static void main(String[] args) {
    System.out.println(fee(-1));
  }

  static int fee(int age) {
    int ret;
    if (age <= 3) {
      return 100;
    } else if (age <= 9) {
      return 300;
    } else {
      return 500;
    }
    return ret;
  }
}
