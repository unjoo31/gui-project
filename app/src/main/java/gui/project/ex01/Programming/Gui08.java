package gui.project.ex01.Programming;

import java.awt.*;
import javax.swing.*;

public class Gui08 extends JFrame{
    
    public Gui08(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JTextField field = new JTextField(" ");
        panel.add(field, BorderLayout.NORTH);

        JButton clear = new JButton("clear");
        panel.add(clear, BorderLayout.EAST);

        JPanel key = new JPanel();
        key.setLayout(new GridLayout(5,3));

        key.add(new JButton("1"));
		key.add(new JButton("2"));
		key.add(new JButton("3"));
		key.add(new JButton("4"));
		key.add(new JButton("5"));
		key.add(new JButton("6"));
		key.add(new JButton("7"));
		key.add(new JButton("8"));
		key.add(new JButton("9"));
		key.add(new JButton("*"));
		key.add(new JButton("0"));
		key.add(new JButton("#"));
		key.add(new JButton("send"));
		key.add(new JButton(""));
		key.add(new JButton("end"));
        panel.add(key, BorderLayout.CENTER);

        frame.add(panel);
        frame.setSize(400   , 150);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Gui08 g = new Gui08();
    }
}
