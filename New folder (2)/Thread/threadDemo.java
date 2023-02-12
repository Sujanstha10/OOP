
class HI extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hello there");
            try {
                Thread.sleep(1000);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class threadDemo {
    public static void main(String[] args) {
        HI obj = new HI();
        obj.start();
    }
}
