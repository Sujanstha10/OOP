import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    String name;
    String address;
    int EmpId;
    int phone;

    
}

public class SerializationDemo {
    public static void main(String[] args) {
        Employee E = new Employee("Amrit", "Butwal", 19, 0000000000);
        try {
            FileOutputStream is = new FileOutputStream("emp.ser");
            ObjectOutputStream OS = new ObjectOutputStream(is);
            OS.writeObject(E);
            OS.close();
            is.close();
            System.out.println("serialization successful");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}