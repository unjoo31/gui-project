package gui.project.ex01.Programming;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Gui06 extends JFrame{
    public Gui06(){
        setBounds(100, 100, 450, 237);
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panel);
        panel.setLayout(null);
        add(panel);

        JLabel label1 = new JLabel("회원 등록하기");
        label1.setBounds(152, 10, 151, 25);
        panel.add(label1);

        JLabel label2 = new JLabel("이름");
        JTextField field2 = new JTextField(10);
        label2.setBounds(36, 45, 151, 15);
        field2.setBounds(187, 42, 116, 21);
        panel.add(label2);
        panel.add(field2);

        JLabel label3 = new JLabel("패스워드");
        JTextField field3 = new JTextField(10);
        label3.setBounds(36, 70, 151, 15);
        field3.setBounds(187, 67, 116, 21);
        panel.add(label3);
        panel.add(field3);

        JLabel label4 = new JLabel("이메일 주소");
        JTextField field4 = new JTextField(10);
        label4.setBounds(36, 105, 113, 15);
        field4.setBounds(187, 102, 116, 21);
        panel.add(label4);
        panel.add(field4);

        JLabel label5 = new JLabel("전화번호");
        JTextField field5 = new JTextField(10);
        label5.setBounds(34, 130, 57, 15);
        field5.setBounds(187, 133, 116, 21);
        panel.add(label5);
        panel.add(field5);

        JButton button1 = new JButton("등록하기");
        JButton button2 = new JButton("취소");
        button1.setBounds(90, 165, 97, 23);
        button2.setBounds(206, 164, 97, 23);
        panel.add(button1);
        panel.add(button2);

        setTitle("회원등록하기");
        setVisible(true);
    }
    public static void main(String[] args) {
        Gui06 g = new Gui06();
    }
}
