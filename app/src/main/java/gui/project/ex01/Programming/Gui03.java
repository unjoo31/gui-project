package gui.project.ex01.Programming;

import java.awt.*;
import javax.swing.*;

public class Gui03 extends JFrame{
    public Gui03(){
        JPanel panel = new JPanel();
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();

        JLabel label = new JLabel("자바 호텔에 오신 것을 환영합니다. 숙박일수를 입력하세요.");
        panelA.add(label);

        JButton button1 = new JButton("1일");
        JButton button2 = new JButton("2일");
        JButton button3 = new JButton("3일");
        JButton button4 = new JButton("4일");
        JButton button5 = new JButton("5일");
        panelB.add(button1);
        panelB.add(button2);
        panelB.add(button3);
        panelB.add(button4);
        panelB.add(button5);

        panel.add(panelA);
        panel.add(panelB);
        add(panel);
        setSize(600, 150);
        setTitle("My Frame");
        setVisible(true);
    }
    public static void main(String[] args) {
        Gui03 g = new Gui03();
    }
}
