package gui.project.ex01;

import java.awt.*;
import javax.swing.*;

public class MyFrame6 extends JFrame {

    public MyFrame6() {
        setTitle("GridLayoutTest");
        setSize(300, 150);
        // 3개의 열과 2개의 행을 가지는 GridLayout을 생성한다
        // 격자 사이의 간격을 지정하려면 GridLayout(2,3,2,2)와 같이 한다
        setLayout(new GridLayout(2, 3));

        add(new JButton("Button1"));
        add(new JButton("Button2"));
        add(new JButton("Button3"));
        add(new JButton("B4"));
        add(new JButton("Long Button5"));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame6 f = new MyFrame6();
    }
}
