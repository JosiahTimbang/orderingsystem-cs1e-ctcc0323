package MilkteaKiosk;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Product extends JFrame {
    private JButton milktea = new JButton("Milk Tea Series");
    private JButton smoothie = new JButton("Smoothie Series");
    private JButton blacksugar = new JButton("Black Sugar Series");
    private JButton kmilk = new JButton("K-Milk Series");
    private JButton cancel = new JButton("Back");

    JLabel background;

    public Product() {
        //call the super if the constructor overriding
        super("Product Varieties");
        setLayout(null);

        milktea.setBounds(100,15,140,40);
        add(milktea);

        smoothie.setBounds(100,60,140,40);
        add(smoothie);

        kmilk.setBounds(100,105,140,40);
        add(kmilk);

        blacksugar.setBounds(85,151,170,40);
        add(blacksugar);

        cancel.setBounds(100,200,145,30);
        add(cancel);

        background = new JLabel("", new ImageIcon("bglogin.png"),JLabel.LEFT);
        background.setBounds(0, 0, 350, 300);
        add(background);

        //Milktea Series Button
        milktea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            if (true) {setVisible(false);
                new MilkTeaSeries(); // assuming Product is a JFrame or a class that creates a GUI
            } else {
                setVisible(true);
            }
        }
    });

        //Smoothie Series Button
        smoothie.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (true) {setVisible(false);
                    new SmoothieSeries(); // assuming Product is a JFrame or a class that creates a GUI
                } else {
                    setVisible(true);
                }
            }
        });

        //K-Milk Series Button
        kmilk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (true) {setVisible(false);
                    new Kmilk(); // assuming Product is a JFrame or a class that creates a GUI
                } else {
                    setVisible(true);
                }
            }
        });

        //Black Sugar Series Button
        blacksugar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (true) {setVisible(false);
                    new BlacksugarSeries(); // assuming Product is a JFrame or a class that creates a GUI
                } else {
                    setVisible(true);
                }
            }
        });

        //Cancel Button
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // close the current frame
                new Menu(); // make the original Menu frame visible again
            }
        });


        //the setup of the frame class
        setSize(360,300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}