public class Constant{
    public static void main(String[] args) {
        final double PI = 3.14;
        int pie = 5;
        System.out.println("半径" + pie + "cmの面積は");
        System.out.println(pie * pie * PI);
    }
}

//finalをつけると上書き変更が禁止される