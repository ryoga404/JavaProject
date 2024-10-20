public class Return_practice {
    public static void main(String[] args) {
        int ans = add(100,20); //addメソッドの引数に100,20を指定
        System.out.println(ans); //addメソッドから返ってきたansを出力
    }

    public static int add(int x, int y) { //mainメソッドで指定した100,20をそれぞれx,yに入れる
        int ans = x + y;
        return ans; //ansを返す
    }
}

//returnの後に処理することはできない。returnはメソッドの終了も行う