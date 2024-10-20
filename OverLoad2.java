public class OverLoad2 {
    public static void main(String[] args) {
        System.out.println(add(2,4,5));
        System.out.println(add(2,3));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }
}

/*
 * 引数の数が違う
 */