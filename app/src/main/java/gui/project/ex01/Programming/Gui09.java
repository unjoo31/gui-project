package gui.project.ex01.Programming;

import java.awt.*;
import javax.swing.*;

public class Gui09 extends JFrame{

    JPanel panel = new JPanel();
    JLabel[] labels = new JLabel[30];

    public Gui09(){
        add(panel);
        panel.setLayout(null);

        for(int i = 0; i < 30; i++){
            labels[i] = new JLabel("" + i);
            int x = (int)(Math.random()*500);
            int y = (int)(Math.random()*200);
            labels[i].setBackground(Color.MAGENTA);
            labels[i].setLocation(x, y);
            labels[i].setSize(20, 20);
            panel.add(labels[i]);
        }        
        setSize(500, 200);
        setTitle("My Frame");
        setVisible(true);
    }

    public static void main(String[] args) {
        Gui09 g = new Gui09();
    }
}
