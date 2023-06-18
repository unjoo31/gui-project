package gui.project.ex01.Programming;

import java.awt.*;
import javax.swing.*;

public class Gui02 extends JFrame{
    public Gui02(){
        JPanel panel = new JPanel();
        add(panel);

        JLabel label = new JLabel("카운터 값");
        JTextField field = new JTextField("0");
        JButton button = new JButton("증가");

        panel.add(label);
        panel.add(field);
        panel.add(button);

        setSize(300, 150);
        setTitle("My Frame");
        setVisible(true);
    }

    public static void main(String[] args) {
        Gui02 g = new Gui02();
    }
}
