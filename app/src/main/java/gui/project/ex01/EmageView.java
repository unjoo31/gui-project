package gui.project.ex01;

import java.awt.*;
import javax.swing.*;

public class EmageView extends JFrame{

    private JPanel panel, panel2;
	private JLabel label;
	private JButton button1, button2, button3, button4; 

    public EmageView(){
        setTitle("image viewer");
        setSize(500, 300);

        panel = new JPanel();
		panel2 = new JPanel();
		label = new JLabel("");
		ImageIcon icon = new ImageIcon("dog.jpg");
		label.setIcon(icon);
		panel2.add(label);
		button1 = new JButton("<<");
		button2 = new JButton("<");
		button3 = new JButton(">");
		button4 = new JButton(">>");
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		add(panel2, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		setVisible(true);
    }    
    public static void main(String[] args) {
        EmageView e = new EmageView();
    }
}
