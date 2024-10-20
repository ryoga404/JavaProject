public class OverLoad {
    public static void main(String[] args) {
        System.out.println(add(10, 30)); //addメソッドを呼び出し
        System.out.println(add(23.5,31.7)); //addメソッドを呼び出し
        System.out.println(add("Hello,", "World!")); //addメソッドを呼び出し
    }

    public static int  add(int x, int y) {
        return x + y; //addで呼び出された引数のうち、int型であればこのaddメソッドを使用
    }

    public static  double add(double x, double y) {
        return x + y; //addで呼び出された引数のうち、double型であればこのaddメソッドを使用
    }

    public static  String add(String x, String y) {
        return x + y; //addで呼び出された引数のうち、String型であればこのaddメソッドを使用
    }
}

/*
 * 引数の型が異なる場合のソースコード
 */