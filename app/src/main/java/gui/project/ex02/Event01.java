package gui.project.ex02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event01 extends JFrame {

    private JButton button;
    private JButton button2;
    private JLabel label;
    int counter = 0;

    public Event01() {
        setSize(600, 200);
        setLayout(new FlowLayout());

        button = new JButton("증가");
        button2 = new JButton("2 증가");
        label = new JLabel("현재의 카운터값:" + counter);
        // button.addActionListener(행위);
        // 행위는 메서드이기 때문에 메서드를 넣어야 하지만 자바특성상 무조건 클래스 내부에 메서드가 있기 때문에 클래스를 new 해야한다
        button.addActionListener(new Inner());
        button2.addActionListener(new Inner2());

        add(button);
        add(button2);
        add(label);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    // class 안에 class를 넣는다 : 무조건 내부에서만 사용하는 클래스일 경우 사용
    // inner class로 만드는 것이 좋다
    class Inner implements ActionListener {

        // 이벤트 행위를 정한다
        // 콜백 메서드 : 인터페이스를 사용하는게 가장 효율적이다
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            System.out.println("버튼 클릭됨 : ");
            System.out.println(btn.getText());

            counter++;
            System.out.println(counter);

            // 이벤트 행위에 의해 변경된 그림을 다시 그릴때는 setText
            label.setText("현재의 카운터값:" + counter);
        }
    }

    class Inner2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            System.out.println("버튼 클릭됨 : ");
            System.out.println(btn.getText());

            counter = counter + 2;
            System.out.println(counter);

            // 이벤트 행위에 의해 변경된 그림을 다시 그릴때는 setText
            label.setText("현재의 카운터값:" + counter);
        }
    }

    public static void main(String[] args) {
        new Event01();
    }
}
