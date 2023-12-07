package java10;

public class Main {

  public static void main(String[] args) {
    int N = 10;
    int[] data = { 1, 5, 2, 2, 6, 4, 9, 3, 4, 9 };
    int[] count = new int[9];

    for (int i = 0; i < N; i++) {
      count[data[i] - 1]++;
    }

    int max = count[0];
    for (int i = 1; i < count.length; i++) {
      if (count[max] < count[i]) {
        max = i;
      }
    }
    int ans = max + 1;
    System.out.println(ans);
  }
}
