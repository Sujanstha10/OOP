import java.io.*;

// class Employee implements Serializable {
//     String name;
//     String address;
//     int EmpId;
//     int phone;

//     Employee(String name, String address, int EmpId, int phone) {
//         this.name = name;
//         this.address = address;
//         this.EmpId = EmpId;
//         this.phone = phone;
//     }
// }

public class deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee e;
        FileInputStream fi = new FileInputStream("emp.ser");
        ObjectInputStream oi = new ObjectInputStream(fi);
        e =  (Employee) oi.readObject();
        oi.close();
        fi.close();
        System.out.println(e.name);
    }

}
