package MilkteaKiosk;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MilkTeaSeries extends JFrame {

    private JButton classic = new JButton("Classic Milk Tea");
    private JButton wintermelon = new JButton("Wintermelon Milk Tea ");
    private JButton taro = new JButton("Taro Milk Tea");
    private JButton cancel = new JButton("Cancel");

    JLabel classicpic, winterpic, taropic, background;


    public MilkTeaSeries() {
        //call the super if the constructor overriding
        super("Milktea Series");
        setLayout(null);

        classic.setBounds(15, 25, 140, 40);
        add(classic);

        wintermelon.setBounds(175, 25, 140, 40);
        add(wintermelon);

        taro.setBounds(335, 25, 140, 40);
        add(taro);

        cancel.setBounds(180, 240, 125, 30);
        add(cancel);

        //Set product visuals
        classicpic = new JLabel("", new ImageIcon("classicpr.png"), JLabel.CENTER);
        classicpic.setBounds(0, 50, 170, 200);
        add(classicpic);

        winterpic = new JLabel("", new ImageIcon("winterpr.png"), JLabel.CENTER);
        winterpic.setBounds(157, 50, 170, 200);
        add(winterpic);

        taropic = new JLabel("", new ImageIcon("taropr.png"), JLabel.CENTER);
        taropic.setBounds(320, 50, 170, 200);
        add(taropic);

        background = new JLabel("", new ImageIcon("background.png"), JLabel.CENTER);
        background.setBounds(0, 0, 640, 380);
        add(background);


        classic.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Customization(); // make the Customization frame visible
                dispose();
            }
        });

        wintermelon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Customization(); // make the Customization frame visible
                dispose();
            }
        });

        taro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Customization(); // make the Customization frame visible
                dispose();
            }
        });

        //Cancel Button
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // close the current frame
                new Product(); // make the original Menu frame visible again
            }
        });

        setSize(500, 325);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}


