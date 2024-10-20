public class Method2 {
    public static void main(String[] args) {
        System.out.println("This is main Method");
        System.out.println("Call MethodA");
        methodA();
    }

    public static void methodA() {
        System.out.println("This is MethodA");
        System.out.println("Call MethodB");
        methodB();

    }

    public static void methodB() {
        System.out.println("This is MethodB");
    }
}
