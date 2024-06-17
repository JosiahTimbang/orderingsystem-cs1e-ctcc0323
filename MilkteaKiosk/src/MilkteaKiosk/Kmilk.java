package MilkteaKiosk;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kmilk extends JFrame{

    private JButton melon = new JButton("Melon Milk");
    private JButton banana = new JButton("Banana Milk");
    private JButton blueberry = new JButton("Blueberry Milk");

    private JButton cancel = new JButton("Cancel");

    JLabel melonpic, bananapic, blueberrypic, background;

    public Kmilk() {
        //call the super if the constructor overriding
        super ("K-Milk Series");
        setLayout(null);

        melon.setBounds(15, 25, 155, 40 );
        add(melon);

        banana.setBounds(190, 25, 140, 40 );
        add(banana);

        blueberry.setBounds(350, 25, 155, 40 );
        add(blueberry);

        cancel.setBounds(190,240,125,30);
        add(cancel);

        //Set product visuals
        melonpic = new JLabel("", new ImageIcon("melonpr.png"), JLabel.CENTER);
        melonpic.setBounds(5, 34, 170, 200);
        add(melonpic);

        bananapic = new JLabel("", new ImageIcon("bananapr.png"), JLabel.CENTER);
        bananapic.setBounds(170, 27, 170, 200);
        add(bananapic);

        blueberrypic = new JLabel("", new ImageIcon("bluepr.png"), JLabel.CENTER);
        blueberrypic.setBounds(335, 30, 170, 200);
        add(blueberrypic);

        background = new JLabel("", new ImageIcon("background.png"), JLabel.CENTER);
        background.setBounds(0, 0, 640, 330);
        add(background);

        melon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Customization(); // make the Customization frame visible
                dispose();
            }
        });

        banana.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Customization(); // make the Customization frame visible
                dispose();
            }
        });

        blueberry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Customization(); // make the Customization frame visible
                dispose();
            }
        });


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