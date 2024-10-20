public class If_practice2 {
    public static void main(String[] args) {
        System.out.println("あなたのラッキーナンバーは？");
        int number = new java.util.Random().nextInt(4) + 1;
        if(number == 1){
            System.out.println(number);
        } else if(number == 2) {
            System.out.println(number);
        } else if(number == 3) {
            System.out.println(number);
        } else if(number == 4) {
            System.out.println(number);
        }
    }
}

/*
 * Random().nextInt(4)+1で1~4の乱数を発生させる。
 * nextInt(4)だけだと0~3となるので+1を記述
 */