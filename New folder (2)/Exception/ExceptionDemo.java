/* public class ExceptionDemo {
    static void calculateage(int age) {
        try {
            if (age < 18)
                throw new ArithmeticException("Invalid age");
            else
                System.out.print("Welcome to vote");
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }
    }

    public static void main(String[] args) {
        calculateage(12);
        System.out.print("program goes on");
    }

} */

// Throws
/* public class ExceptionDemo {
    static int division(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            division(10, 0);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }
        System.out.println("program flows");
    }
} */

class xception{
    void division(int a,int b)throws ArithmeticException{
        return a/b;
    }
}