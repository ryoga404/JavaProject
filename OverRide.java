public class OverRide {
    public static void main(String[] args) {
        Python python = new Python();
        Java java = new Java();
        python.digest();
        java.digest();
    }
}

class ProgrammingLanguage {
    void digest() {
        System.out.println("This is Programming Language.");
    }
}

class Python extends ProgrammingLanguage {
    void digest() {
        System.out.println("This is Interpreter");
    }
}

class Java extends ProgrammingLanguage {
    void digest() {
        System.out.println("This is Compiler");
    }
}

//オーバーライドと継承
/*
 * オーバーライド
 * オーバーライドは、継承された親クラスのメソッドの処理を子クラスで再定義（上書き）することです。
 * 親クラスのメソッドと同じシグネチャ（メソッド名、引数、戻り値）で再定義します。
 *
 *継承
 *継承は、親クラスの機能をそのまま子クラスに引き継ぐ仕組みです。
 *子クラスは親クラスのフィールドやメソッドを使うことができ、Javaではextendsキーワードを使って親クラスを指定します。
 */