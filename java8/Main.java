package java8;

public class Main {

  public static void main(String[] args) {
    int[] data = { 30, 60, 70, 90, 20, 100 };
    for (int i : data) {
      System.out.print(i + " ");
    }
    System.out.println();

    sort(data);

    System.out.println();
    for (int element : data) {
      System.out.print(element + " ");
    }
  }

  public static void sort(int[] data) {
    for (int i = 0; i < data.length; i++) {
      int min = i; //最小の要素を[ i ]の0番目からスタート
      for (int j = i + 1; j < data.length; j++) { // jの初期値はi + 1でとなりの要素からスタート
        //変数minよりも小さい値があればminを更新
        if (data[j] < data[min]) {
          min = j;
        }
      }
      //見つけた新しい最小の数値と既存の数値を入れ替え
      int tmp = data[i];
      data[i] = data[min];
      data[min] = tmp;
    }
  }
}
