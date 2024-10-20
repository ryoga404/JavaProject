public class Array {
    public static void main(String[] args) {
        int[] scores; //空の配列を宣言
        scores = new int[5]; //配列を作成。（要素数5）
        int num = scores.length; //配列の要素数を調べる
        System.out.println(num);

        scores[0] = 10;
        System.out.println(scores[0]);
    }
}
