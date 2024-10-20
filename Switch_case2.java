public class Switch_case2 {
    public static void main(String[] args) {
        int number = new java.util.Random().nextInt(4) + 1;
        System.out.println("CASE文で分岐します");
        switch(number) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
        }
    }
}
