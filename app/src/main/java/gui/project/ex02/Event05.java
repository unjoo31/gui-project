package gui.project.ex02;

import java.awt.*;
import javax.swing.*;

public class Event05 extends JFrame {
    private JButton button, button2;
    private JLabel label;
    int counter = 0;

    public Event05() {
        this.setSize(400, 150);
        this.setTitle("이벤트 예제");

        JPanel panel = new JPanel();
        button = new JButton("증가");
        button2 = new JButton("감소");
        label = new JLabel("현재의 카운터 값:" + counter);
        // 람다식을 이용하여 이벤트 처리
        // 변수 e는 이벤트를 나타낸다.
        // 람다식은 함수를 객체로 만들어서 메소드에 전달할 수 있다.
        button.addActionListener(e -> {
            counter++;
            label.setText("현재의 카운터 값: " + counter);
        });

        button2.addActionListener(e -> {
            counter--;
            label.setText("현재의 카운터 값: " + counter);
        });

        panel.add(label);
        panel.add(button);
        panel.add(button2);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Event05 t = new Event05();
    }
}
