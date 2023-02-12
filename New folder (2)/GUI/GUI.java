import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener {
    JButton b;
    JTextField tf;

    GUI() {
        b = new JButton("click me");
        tf = new JTextField(20);
        b.setBounds(20, 20, 100, 20);
        tf.setBounds(40, 60, 70, 20);
        add(b);
        add(tf);
        b.addActionListener(this);
        setLayout(null);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        tf.setText("Welcome");
    }

    public static void main(String[] args) {
        GUI gd = new GUI();
    }
}
