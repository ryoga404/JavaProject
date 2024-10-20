public class Array4 {
    public static void main(String[] args) {
        int array[] = {80,89,90,98,97,95,91};
        int count = 0;
        for(int i=0; i < array.length; i++) {
            if(array[i] >= 90) {
                count++;
            }
        }
        System.out.println("90点以上は" + count + "科目です");
    }
}
