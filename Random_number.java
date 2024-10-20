public class Random_number {
    public static void main(String[] args) {
        int r = new java.util.Random().nextInt(90);
        System.out.println("あなたは、多分" + r + "歳ですね？");
    }
}

/*
 * java.util.Random().nextInt(数値)は
 * 0~数値までの乱数を発生させる。
 */