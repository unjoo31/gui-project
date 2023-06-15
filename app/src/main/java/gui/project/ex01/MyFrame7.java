package gui.project.ex01;

import java.awt.*;
import javax.swing.*;

public class MyFrame7 extends JFrame {

    JButton b1, b2, b3;
    Container cPane;
    CardLayout layoutm;

    public MyFrame7() {
        setTitle("BoarderLayoutTest");
        setSize(300, 150);
        cPane = getContentPane();
        layoutm = new CardLayout();
        setLayout(layoutm);

        JButton b1 = new JButton("Card #1");
        JButton b2 = new JButton("Card #2");
        JButton b3 = new JButton("Card #3");

        add(b1);
        add(b2);
        add(b3);
        // 람다식을 사용하여서 버튼이 눌리면 다음 컴포넌트를 보이게 한다.
        b1.addActionListener(e -> layoutm.next(cPane));
        b2.addActionListener(e -> layoutm.next(cPane));
        b3.addActionListener(e -> layoutm.next(cPane));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame7 f = new MyFrame7();
    }
}
