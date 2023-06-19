package gui.project.ex02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

// 1.이벤트 소스
public class Event06 extends MyFrame {

    private JButton btn1, btn2;

    // 1.컴포넌트 생성
    public Event06() {
        btn1 = new JButton("버튼1");
        btn2 = new JButton("버튼2");

        // 2.컴포넌트를 컨테이너에 배치
        add(btn1, BorderLayout.NORTH);
        add(btn2, BorderLayout.SOUTH);

        // 3.리스너 생성
        Callback call = new Callback(); // 콜백될 타겟 메서드
        btn1.addActionListener(call);
        btn2.addActionListener(call);

        // 4.그림그리기
        setVisible(true);
    }

    class Callback implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // e.getSource() -> 뭐가 클릭되었는지 알기 위해서 받는다
            // 어떤 타입인지 모르니까 Object로 받는다
            Object target = e.getSource();
            // 다운캐스팅
            JButton btn = (JButton) target;

            // 위에 다운캐스팅을 해야 가능함
            System.out.println(btn.getText());
            System.out.println(btn.getX());
            System.out.println(btn.getY());
            System.out.println(btn.getHeight());
            System.out.println(btn.getWidth());

            if (btn.getText().equals("버튼1")) {
                System.out.println("버튼1이 클릭되었습니다");
            } else if (btn.getText().equals("버튼2")) {
                System.out.println("버튼2가 클릭되었습니다");
            }
        }
    }

    public static void main(String[] args) {
        new Event06();
    }
}
