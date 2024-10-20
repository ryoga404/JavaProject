public class String_to_int {
    public static void main(String[] args) {
        String age = "19";
        int n = Integer.parseInt(age); //文字列を整数型に変換
        System.out.println("あなたは来年"+(n + 1)+"歳になりますね"); //()の中で演算
    }
}
