public class Method4 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("計算をします");
        System.out.print("１つ目の数値を入力:");
        int x = new java.util.Scanner(System.in).nextInt();
        System.out.print("２つ目の数値を入力:");
        int y = new java.util.Scanner(System.in).nextInt();
        number(x,y);
    }

    public static void number(int x, int y) {
        int result = x + y;
        System.out.println("加算結果:"  + result);
    }
}
