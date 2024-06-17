package MilkteaKiosk;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BlacksugarSeries extends JFrame{

    private JButton blackdragon = new JButton("Black Dragon Milk Tea");
    private JButton reddragon = new JButton("Red Dragon Milk Tea ");
    private JButton tiger = new JButton("Tiger Milk Tea");

    private JButton cancel = new JButton("Cancel");

    JLabel blackdragonpic, reddragonpic, tigerpic, background;

    public BlacksugarSeries() {
        //call the super if the constructor overriding
        super ("Black Sugar Series");
        setLayout(null);

        blackdragon.setBounds(15, 25, 140, 40 );
        add(blackdragon);

        reddragon.setBounds(175, 25, 140, 40 );
        add(reddragon);

        tiger.setBounds(335, 25, 140, 40 );
        add(tiger);

        cancel.setBounds(180,240,125,30);
        add(cancel);

        //Set product visuals
        blackdragonpic = new JLabel("", new ImageIcon("blackpr.png"), JLabel.CENTER);
        blackdragonpic.setBounds(0, 50, 170, 200);
        add(blackdragonpic);

        reddragonpic = new JLabel("", new ImageIcon("redpr.png"), JLabel.CENTER);
        reddragonpic.setBounds(157, 50, 170, 200);
        add(reddragonpic);

        tigerpic = new JLabel("", new ImageIcon("tigerpr.png"), JLabel.CENTER);
        tigerpic.setBounds(320, 50, 170, 200);
        add(tigerpic);

        background = new JLabel("", new ImageIcon("background.png"), JLabel.CENTER);
        background.setBounds(0, 0, 640, 330);
        add(background);

        blackdragon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Customization(); // make the Customization frame visible
                dispose();
            }
        });

        reddragon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Customization(); // make the Customization frame visible
                dispose();
            }
        });

        tiger.addActionListener(new ActionListener() {
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

        setSize(500,325);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
