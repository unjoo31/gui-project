package gui.project.ex01.Programming;

import java.awt.*;
import javax.swing.*;

public class Gui07 extends JFrame{
    private JPanel panel;
	private JButton[] buttons;

    public Gui07(){
        panel = new JPanel();
		panel.setLayout(new GridLayout(0, 5));
		buttons = new JButton[20];

		for (int index = 0; index < buttons.length; index++) {
				buttons[index] = new JButton(""+index);
				int R = (int)(Math.random()*256);
				int G = (int)(Math.random()*256);
				int B= (int)(Math.random()*256);
				Color color = new Color(R, G, B); 
				buttons[index].setBackground(color);
				panel.add(buttons[index]);
		}
		add(panel, BorderLayout.CENTER);
		setSize(400, 150);
		setTitle("My Frame");
		setVisible(true);
    }
    public static void main(String[] args) {
        Gui07 g = new Gui07();
    }
}
