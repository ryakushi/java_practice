/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    int[] arrayNum = { 30, 50, 20, 60, 80, 90, 20 };
    System.out.println(max(arrayNum));
  }

  static int max(int[] data) {
    int max = data[0]; //最大値の初期値を配列の最初の値からスタートする
    for (int i = 1; i < data.length; i++) { //変数maxと比較するため i のインデックス番号を1からスタート
      if (max < data[i]) {
        // 変数maxよりdata[i]が大きければ更新
        max = data[i];
      }
    }

    return max;
  }
}
