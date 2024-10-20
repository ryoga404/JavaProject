import java.util.Arrays; //配列を直接出力するのに必要なパッケージ

public class Matrix_array {
    public static void main(String[] args) {
        int matrix[][] = new int[2][3];
        matrix[0][0] = 10;
        matrix[0][1] = 20;
        matrix[0][2] = 30;
        matrix[1][0] = 40;
        matrix[1][1] = 50;
        matrix[1][2] = 60;
        System.out.println(Arrays.deepToString(matrix)); //一次元配列はToString、二次元配列はdeepToStringを使用
    }
}
