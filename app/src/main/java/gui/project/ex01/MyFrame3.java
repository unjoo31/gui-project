package gui.project.ex01;

import java.awt.*;
import javax.swing.*;

public class MyFrame3 extends JFrame {

    public MyFrame3() {
        JPanel panel = new JPanel(); // 패널을 생성
        panel.setBackground(Color.green); // 패널의 배경색을 변경

        JButton b1 = new JButton("Button 1"); // 버튼을 생성
        b1.setBackground(Color.GRAY); // 버튼의 배경색을 변경

        JButton b2 = new JButton("Button 1");
        b2.setBackground(Color.DARK_GRAY);

        panel.add(b1); // 버튼을 패널에 추가
        panel.add(b2); // 버튼을 패널에 추가
        add(panel); // 패널을 프레임에 추가
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame3 f = new MyFrame3();
    }
}
