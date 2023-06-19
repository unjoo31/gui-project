package gui.project.ex02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Enent04 extends JFrame {
    private JButton button;
    private JLabel label;
    int counter = 0;

    public Enent04() {
        this.setSize(400, 150);
        this.setTitle("이벤트 예제");

        JPanel panel = new JPanel();
        button = new JButton("증가");
        label = new JLabel("현재의 카운터 값:" + counter);
        // 익명 클래스 안에서 actionPerformed()메소드를 정의한다
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter++;
                label.setText("현재의 카운터 값: " + counter);
            }
        });
        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Enent04 f = new Enent04();
    }
}
