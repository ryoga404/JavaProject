public class Succession {
    public static void main(String[] args) {
        Cat myCat = new Cat(); //Catクラスのインスタンスを生成（インスタンス名:myCat）それをCat()で初期化
        Dog myDog = new Dog(); //Dogクラスのインスタンスを生成（インスタンス名:myDog) それをDog()で初期化
        myCat.makeSound(); //myCatインスタンスを使ってmakeSoundメソッドを呼び出し
        myDog.makeSound();
    }
}

class Animal { //親クラス（スーパークラス）継承される側
    String name;
    void makeSound() {
        System.out.println("This is Animal Sound");
    }
}

class Dog extends Animal { //子クラス（サブクラス）継承する側

}

class Cat extends Animal { //子クラス（サブクラス）継承する側

}

//継承のソースコード