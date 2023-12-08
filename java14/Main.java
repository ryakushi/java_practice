package java14;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * 先頭への挿入
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayDeque<Integer> numbers = new ArrayDeque<>();
    for (int i = 0; i < N; i++) {
      numbers.addFirst(sc.nextInt());
    }

    //クエリ操作処理
    int queries = sc.nextInt();
    for (int i = 0; i < queries; i++) {
      int queryType = sc.nextInt();
      if (queryType == 0) {
        // pushfront クエリ: 要素を先頭に追加
        int value = sc.nextInt();
        numbers.addLast(value);
      } else if (queryType == 1) {
        // popfront クエリ: 先頭の要素を取り出し、出力
        if (!numbers.isEmpty()) {
          System.out.println(numbers.pollLast());
        } else {
          System.out.println("error");
        }
      }
    }
  }
}
