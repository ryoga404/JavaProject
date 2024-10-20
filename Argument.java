public class Argument {
    public static void main(String[] args) {
        int[] array = {1,2,3}; //配列をセット
        printArray(array); //printArrayメソッド呼び出し
    }

    public static void printArray(int[] array) { //整数型配列arrayを引数にセット
        for (int i : array) { //iにarrayの要素を1つずつ格納
            System.out.println(i);
        }
    }
}
