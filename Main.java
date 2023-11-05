public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    h1.setName("ミナト");
    h1.setHp(100);
    h1.setMp(50);

    System.out.println(h1.toString());
  }
}


// public class Main: Main クラスを定義しています。このクラスはプログラムのエントリーポイントとして使用されます。

// public static void main(String[] args): Javaプログラムのエントリーポイントである main メソッドです。プログラムの実行がここから始まります。

// Hero h1 = new Hero();: Hero クラスから新しい Hero オブジェクト h1 を生成しています。このオブジェクトは初期状態で名前、体力ポイント、魔法ポイントが設定されていません。

// h1.setName("ミナト");: h1 オブジェクトの setName メソッドを呼び出して、勇者の名前を設定しています。

// h1.setHp(100);: h1 オブジェクトの setHp メソッドを呼び出して、勇者の体力ポイントを設定しています。

// h1.setMp(50);: h1 オブジェクトの setMp メソッドを呼び出して、勇者の魔法ポイントを設定しています。

// System.out.println(h1.toString());: h1 オブジェクトの toString メソッドを呼び出し、勇者の情報を文字列として表示しています。この行はコンソールに勇者の情報を表示します。