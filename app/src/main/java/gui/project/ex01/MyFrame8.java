package gui.project.ex01;

import java.awt.*;
import javax.swing.*;

public class MyFrame8 extends JFrame {
    private JButton b1, b2;

    public MyFrame8() {
        setTitle("Absolute Position Test");
        setSize(300, 150);
        // 5-1)
        // 패널의 배치 관리자를 지정하지 않는다. 절대 위치를 사용하겠다는 의미이다.
        setLayout(null);

        // 5-2)
        b1 = new JButton("Button #1");
        add(b1);
        // 5-3)
        b1.setLocation(50, 30);
        b1.setSize(90, 50);

        b2 = new JButton("Button #2");
        add(b2);
        b2.setBounds(180, 30, 90, 20);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame8 f = new MyFrame8();
    }
}
