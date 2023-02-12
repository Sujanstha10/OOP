//Qno.1
/*public class HandelingExpection {

    public static void main(String[] args) {
        try {
            int d, a;
            d = 0;
            a = 34 / d;
        } catch (ArithmeticException ae) {
            System.out.println("divide by zero");
        }

        System.out.println("after catch statement programs flows");
    }
} */

//Qno.2
public class HandelingExpection {
    public static void main(String[] args) {
        try {
            int[] num = { 1, 2, 3, 4 };
            System.out.println(num[5]);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae);
        }
        System.out.println("Statement after exception generating statement");
    }
}
