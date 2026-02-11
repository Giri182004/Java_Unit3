public class ArithmeticExample {
    public static void main(String[] args) {
        int a = 25;
        int b = 5;

        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}