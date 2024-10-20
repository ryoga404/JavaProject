public class Array3 {
    public static void main(String[] args) {
        int[] array = {20,30,40,50}; //配列を設定
        int sum = 0; //合計初期化
        for(int i = 0; i < array.length; i++) { //添字を0にリセット。配列数未満まで1ずつ増加
            sum += array[i]; //sum変数に加算していく
        }
        System.out.println("合計:" + sum);
    }
}
