import javax.swing.JFrame;

import java.awt.*;
import javax.swing.*;

public class GUIDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("LoginForm");
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);

        JLabel lheader = new JLabel("Login");
        lheader.setBounds(130, 20, 90, 30);
        f.add(lheader);

        JLabel lusername = new JLabel("username:");
        lusername.setBounds(20, 50, 90, 30);
        f.add(lusername);

        JTextField tusername = new JTextField(20);
        tusername.setBounds(90, 50, 90, 30);
        f.add(tusername);

        JLabel lpassword = new JLabel("password:");
        lpassword.setBounds(20, 80, 90, 30);
        f.add(lpassword);

        JPasswordField tpassword = new JPasswordField(20);
        tpassword.setBounds(90, 80, 90, 30);
        f.add(tpassword);

        JButton bsubmit = new JButton("submit");
        bsubmit.setBounds(110, 110, 90, 20);
        f.add(bsubmit);

        JButton bcancel = new JButton("submit");
        bcancel.setBounds(110, 110, 90, 20);
        f.add(bcancel);

    }
}