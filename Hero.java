public class Hero {
  private String name;
  private int hp, mp;

  public String toString() {
    return "勇者(名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setHp(int hp) {
    this.hp = hp;
  }
  public void setMp(int mp) {
    this.mp = mp;
  }
}

// ポイント
// private String name: 勇者の名前を格納するプライベートな文字列型フィールドです。

// private int hp, mp: 勇者の体力ポイントと魔法ポイントを格納するプライベートな整数型フィールドです。

// public String toString(): クラスのオブジェクトを文字列として表現するためのメソッドです。このメソッドは、勇者の情報を文字列として返します。

// public void setName(String name): 勇者の名前を設定するためのメソッドです。引数として名前を受け取り、それを name フィールドに設定します。

// public void setHp(int hp): 勇者の体力ポイントを設定するためのメソッドです。引数として体力ポイントを受け取り、それを hp フィールドに設定します。

// public void setMp(int mp): 勇者の魔法ポイントを設定するためのメソッドです。引数として魔法ポイントを受け取り、それを mp フィールドに設定します。

// 間違えたポイント、不明だった点
// ・クラス名とファイル名は同じにする必要があること
// ・voidは戻り値型で、メソッドが値を戻さないことを示す。今回はMainのデータを引き取り表示するだけなので、戻り値が必要ない。
// ・Javaのソースコードはコンパイルされてバイトコードに変換され、それをJava仮想マシン（JVM）で実行すること