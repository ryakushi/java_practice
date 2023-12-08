package java14;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * �擪�ւ̑}��
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayDeque<Integer> numbers = new ArrayDeque<>();
    for (int i = 0; i < N; i++) {
      numbers.addFirst(sc.nextInt());
    }

    //�N�G�����쏈��
    int queries = sc.nextInt();
    for (int i = 0; i < queries; i++) {
      int queryType = sc.nextInt();
      if (queryType == 0) {
        // pushfront �N�G��: �v�f��擪�ɒǉ�
        int value = sc.nextInt();
        numbers.addLast(value);
      } else if (queryType == 1) {
        // popfront �N�G��: �擪�̗v�f�����o���A�o��
        if (!numbers.isEmpty()) {
          System.out.println(numbers.pollLast());
        } else {
          System.out.println("error");
        }
      }
    }
  }
}
