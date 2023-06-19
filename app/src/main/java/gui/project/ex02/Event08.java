package gui.project.ex02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

// 1.이벤트 소스
public class Event08 extends MyFrame {

    private JButton btn1, btn2, btn3;

    public Event08() {
        btn1 = new JButton("버튼1");
        btn2 = new JButton("버튼2");
        btn3 = new JButton("버튼3");

        add(btn1, BorderLayout.NORTH);
        add(btn2, BorderLayout.SOUTH);
        add(btn3, BorderLayout.CENTER);

        // 인터페이스만 new 하는 방법
        // 이벤트만 new해서 추상메서드만 정의한다
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("버튼1이 클릭되었습니다");
            }
        });
        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("버튼2가 클릭되었습니다");
            }
        });
        btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("버튼3이 클릭되었습니다.");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Event08();
    }
}
