package gui.project.ex01;

import javax.swing.JFrame;

public class FrameTest {
    public static void main(String[] args) {
        JFrame f = new JFrame("Frama Test");
        f.setSize(600, 500);
        // 컨테이너를 보여주겠다
        f.setVisible(true);
        // 컨테이너의 x를 누르면 실행도 멈추게 한다
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // (클래스명 .변수)이기 때문에 static 변수이다
    }
}
