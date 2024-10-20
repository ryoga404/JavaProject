public class Switch_case {
    public static void main(String[] args) {
        System.out.println("CASE文で分岐します");
        int number = new java.util.Random().nextInt(4) + 1;
        switch(number) {
            case 1 -> {
                System.out.println(1);
            }
            case 2 -> {
                System.out.println(2);
            }
            case 3 -> {
                System.out.println(3);
            }
            case 4 -> {
                System.out.println(4);
            }
        }
    }
}
