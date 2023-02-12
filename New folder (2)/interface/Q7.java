
interface Writeable {
   public void writes();
}

interface Readable {
   public void reads();
}

class student implements Readable, Writeable {
   public void reads() {
      System.out.println("student reads ");
   }

   public void writes() {
      System.out.println("student writes ");
   }
}

public class Q7 {
   public static void main(String[] args) {
      student s = new student();
      s.reads();
      s.writes();

   }

}
