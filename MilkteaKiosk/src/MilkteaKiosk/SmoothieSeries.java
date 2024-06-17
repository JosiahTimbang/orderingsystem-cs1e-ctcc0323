package MilkteaKiosk;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SmoothieSeries extends JFrame{

    private JButton chocolate = new JButton("Chocolate Smoothie");
    private JButton matcha = new JButton("Matcha Smoothie");
    private JButton strawberry = new JButton("Strawberry Smoothie");

    private JButton cancel = new JButton("Cancel");


    JLabel chocopic, matchapic, strawberrypic, background;

    public SmoothieSeries() {
        //call the super if the constructor overriding
        super ("Smoothie Series");
        setLayout(null);

        chocolate.setBounds(15, 25, 155, 40 );
        add(chocolate);

        matcha.setBounds(190, 25, 140, 40 );
        add(matcha);

        strawberry.setBounds(350, 25, 155, 40 );
        add(strawberry);

        cancel.setBounds(195,240,125,30);
        add(cancel);

        //Set product visuals
        chocopic = new JLabel("", new ImageIcon("chocopr.png"), JLabel.CENTER);
        chocopic.setBounds(0, 50, 170, 200);
        add(chocopic);

        matchapic = new JLabel("", new ImageIcon("matchapr.png"), JLabel.CENTER);
        matchapic.setBounds(167, 50, 170, 200);
        add(matchapic);

        strawberrypic = new JLabel("", new ImageIcon("strawberrypr.png"), JLabel.CENTER);
        strawberrypic.setBounds(325, 50, 170, 200);
        add(strawberrypic);

        background = new JLabel("", new ImageIcon("background.png"), JLabel.CENTER);
        background.setBounds(0, 0, 640, 330);
        add(background);

        chocolate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Customization(); // make the Customization frame visible
                dispose();
            }
        });

        matcha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Customization(); // make the Customization frame visible
                dispose();
            }
        });

        strawberry.addActionListener(new ActionListener() {
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

        setSize(530,325);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
