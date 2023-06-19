package gui.project.ex02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// JFrame과 ActionLister를 구현한다. (따라서 프레임이 버튼에서 발생하는 이벤트도 처리할 수 있다)
public class Event03 extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label;
    int counter = 0;

    // Event03 클래스 안에 actionPerformed()가 정의되어 있어야 한다
    public void actionPerformed(ActionEvent e) {
        counter++;
        label.setText("현재의 카운터값: " + counter);
    }

    public Event03() {
        this.setSize(400, 150);
        this.setTitle("이벤트 예제");

        JPanel panel = new JPanel();
        button = new JButton("증가");
        label = new JLabel("현재의 카운터값:" + counter);
        // 현재 객체를 이벤트 리스너로 버튼에 등록한다.(즉 자기 자신이 이벤트를 처리한다고 등록한다)
        button.addActionListener(this);
        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Event03 t = new Event03();
    }
}
