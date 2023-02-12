import javax.swing.JFrame;

import java.awt.*;
import javax.swing.*;

public class Registration {
    public static void main(String[] args) {
        JFrame f = new JFrame("Registration");

        JLabel lheader = new JLabel("Student Registration");
        lheader.setBounds(90, 20, 150, 30);
        f.add(lheader);

        JLabel Sname = new JLabel("Name:");
        Sname.setBounds(20, 50, 90, 30);
        f.add(Sname);

        JTextField tname = new JTextField(20);
        tname.setBounds(100, 50, 90, 20);
        f.add(tname);

        JLabel Sage = new JLabel("Age:");
        Sage.setBounds(20, 80, 90, 30);
        f.add(Sage);

        String age[] = { "17", "18", "19", "20" };
        JComboBox cage = new JComboBox(age);
        cage.setBounds(100, 80, 90, 20);
        f.add(cage);

        JLabel sGender = new JLabel("Gender:");
        sGender.setBounds(20, 110, 90, 30);
        f.add(sGender);

        JRadioButton rbMale = new JRadioButton("Male");
        rbMale.setBounds(100, 110, 90, 30);
        f.add(rbMale);

        JRadioButton rbFemale = new JRadioButton("Female");
        rbFemale.setBounds(100, 130, 90, 30);
        f.add(rbFemale);

        JRadioButton rbOther = new JRadioButton("Others");
        rbOther.setBounds(100, 150, 90, 30);
        f.add(rbOther);

        JLabel sHobbies = new JLabel("Hobbies:");
        sHobbies.setBounds(20, 170, 90, 30);
        f.add(sHobbies);

        JCheckBox cbplay = new JCheckBox("Playing");
        cbplay.setBounds(100, 170, 80, 30);
        f.add(cbplay);

        JCheckBox cbswim = new JCheckBox("Swimming");
        cbswim.setBounds(180, 170, 90, 30);
        f.add(cbswim);

        JCheckBox cbsing = new JCheckBox("Singing");
        cbsing.setBounds(100, 170, 90, 30);
        f.add(cbsing);

        f.setSize(500, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}