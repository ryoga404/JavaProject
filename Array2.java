import java.util.Arrays; //他のパッケージに含まれているクラスをインポートする
public class Array2 {
    public static void main(String[] args) {
        int[] scores = new int[] {20, 30, 40, 50, 60};
        int[] scores2 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(scores2));
    }
}



/*
 * 配列を直接指定し出力するには、Arrays.toString(配列名)を使用する
 * Array.toStringを使用するにはimport java.util.Arraysを使用！
 */