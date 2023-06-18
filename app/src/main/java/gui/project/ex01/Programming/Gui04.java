package gui.project.ex01.Programming;

import java.awt.*;
import javax.swing.*;

public class Gui04{
    public JPanel createContentPane (){

        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        JPanel textPanel = new JPanel();
        textPanel.setLayout(null);
        textPanel.setLocation(10, 0);
        textPanel.setSize(260, 30);
        totalGUI.add(textPanel);

        JLabel redLabel = new JLabel("Red");
        redLabel.setLocation(0, 0);
        redLabel.setSize(50, 40);
        redLabel.setHorizontalAlignment(0);
        textPanel.add(redLabel);

        JLabel yellowLabel = new JLabel("Yellow");
        yellowLabel.setLocation(70, 0);
        yellowLabel.setSize(50, 40);
        yellowLabel.setHorizontalAlignment(0);
        textPanel.add(yellowLabel);

        JLabel greenLabel = new JLabel("Green");
        greenLabel.setLocation(140, 0);
        greenLabel.setSize(50, 40);
        greenLabel.setHorizontalAlignment(0);
        textPanel.add(greenLabel);

        JLabel blueLabel = new JLabel("Blue");
        blueLabel.setLocation(210, 0);
        blueLabel.setSize(50, 40);
        blueLabel.setHorizontalAlignment(0);
        textPanel.add(blueLabel);

        JPanel panelForPanels = new JPanel();
        panelForPanels.setLayout(null);
        panelForPanels.setLocation(10, 40);
        panelForPanels.setSize(260, 50);
        totalGUI.add(panelForPanels);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setLocation(0, 0);
        redPanel.setSize(50, 50);
        panelForPanels.add(redPanel);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.yellow);
        yellowPanel.setLocation(70, 0);
        yellowPanel.setSize(50, 50);
        panelForPanels.add(yellowPanel);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setLocation(140, 0);
        greenPanel.setSize(50, 50);
        panelForPanels.add(greenPanel);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setLocation(210, 0);
        bluePanel.setSize(50, 50);
        panelForPanels.add(bluePanel);
        
        totalGUI.setOpaque(true);
        return totalGUI;
    }

    private static void createGUI() {

        JFrame frame = new JFrame("JLabel Test");

        Gui04 demo = new Gui04();
        frame.setContentPane(demo.createContentPane());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(290, 130);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        createGUI();
    }
}