public class ApiSort {
    public static void main(String[] args) {
        int[] array = {165, 145, 170, 160};
        java.util.Arrays.sort(array); //API呼び出し（ソート）
        for (int n : array) {
            System.out.println(n);
        }
    }
}
