package gui.project.ex01.Programming;

import java.awt.*;
import javax.swing.*;

public class Gui01 extends JFrame{
    public Gui01(){
        JPanel panel = new JPanel();
        add(panel);

        JLabel label = new JLabel("자바는 재미있나요?");
        JButton button1 = new JButton("Yes");
        JButton button2 = new JButton("No");

        panel.add(label);
        panel.add(button1);
        panel.add(button2);

        setSize(300, 150);
        setTitle("My Frame");
        setVisible(true);
    }


    public static void main(String[] args) {
        Gui01 g = new Gui01();
    }
}
