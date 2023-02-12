import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Event extends JFrame implements ActionListener {
    JButton b;
    JLabel l;
    int count = 0;

    Event() {
        l = new JLabel("0:Count");
        l.setBounds(130, 20, 90, 30);
        b = new JButton("click me");
        b.setBounds(20, 20, 100, 20);
        add(l);
        add(b);
        b.addActionListener(this);
        setLayout(null);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        count++;
        l.setText(count + ":times");
    }

    public static void main(String[] args) {
        Event e = new Event();
    }
}
