import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    int[] a = {1, 2, 3, 4, 5};
    int[] b = {1, 2, 3, 4, 5};
    System.out.println("間違った判定" + a.equals(b));
    System.out.println("正しい判定" + Arrays.equals(a, b));
  }
}


// public static void mainはmainの関数である、main関数は他のクラスから呼ばれるものではなく、それ自体を実行するもの
//public　　全てのクラス・パッケージ・サブクラスからアクセスすることが出来る一番公開範囲の広い設定
// インスタンス化（= new）せずに使える必要があるので、staticがついている
// voidは戻り値がなし
// String argsはコマンドライン引数という、引数の最初の文言を出力