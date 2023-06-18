package gui.project.ex01.Programming;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Gui05 extends JFrame{
    public Gui05(){
        JPanel panel = new JPanel();
        setBounds(100, 100, 450, 300);
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panel);
        panel.setLayout(null);

        JLabel label1 = new JLabel("나의 BMI 지수는 얼마나 될까?");
        label1.setBounds(27, 24, 258, 21);
        panel.add(label1);

        JLabel label2 = new JLabel("나의 체중(kg):");
        label2.setBounds(27, 61, 104, 15);
        JTextField field2 = new JTextField(10);
        field2.setBounds(143, 55, 116, 21);
        panel.add(label2);
        panel.add(field2);

        JLabel label3 = new JLabel("나의 키(m):");
        label3.setBounds(27, 86, 104, 18);
        JTextField field3 = new JTextField(10);
        field3.setBounds(143, 83, 116, 21);
        panel.add(label3);
        panel.add(field3);

        JButton button = new JButton("BMI 확인하기");
        button.setBounds(27, 120, 140, 23);
        panel.add(button);

        setSize(400, 200);
        setTitle("BMI 계산기");
        setVisible(true);
    }
    public static void main(String[] args) {
        Gui05 g = new Gui05();
    }
}
