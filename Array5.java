public class Array5 {
    public static void main(String[] args) {
        int[] dna = new int[10]; //空の配列（１０）を作成

        for(int i =0; i < dna.length; i++) {
            dna[i] = new java.util.Random().nextInt(4); //ランダムな数値を生成（0~3）
        }
        for(int i = 0; i < dna.length; i++) {
            char[] base = {'A', 'T', 'G' , 'C'};//DNA表記をリストアップ（0~3)
            System.out.print(base[dna[i]] + " "); //上のForで生成した10個のランダムな数値(0-3)に対応するDNA表記を出力
        }
    }
}
