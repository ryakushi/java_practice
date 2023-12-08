package java11;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Q = 3;
    int[] data = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };

    int k = 0;
    for (int i = 0; i < Q; i++) {
      String[] query = sc.nextLine().split(" ");

      int queryType = Integer.parseInt(query[0]);

      if (queryType == 0) {
        k = Integer.parseInt(query[1]);
        System.out.println(data[k]);
      } else {
        data[k] = Integer.parseInt(query[2]);
      }
    }
  }
}
