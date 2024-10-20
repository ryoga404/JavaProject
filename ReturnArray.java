public class ReturnArray {
    public static void main(String[] args) {
        int[] array = makeArray(4); //返ってきた配列を1つずつ出力
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int[] makeArray(int size) {
        int[] newArray = new int[size]; //mainメソッドで指定された要素数分の空配列を生成
        for (int i=0; i < newArray.length; i++) { //0から要素数-1まで添え字を1ずつ増やす
            newArray[i] = 1; //1を格納
        }
        return newArray; //完成した配列を返す
    }
}
