class display implements Runnable {
    public void run() {
        for (i = 0; i < 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(20000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

}

public class runnabledemo {

    public static void main(String[] args){
        display number = new display();
        Thread num = new Thread(number);
        num.start();
    }

}
