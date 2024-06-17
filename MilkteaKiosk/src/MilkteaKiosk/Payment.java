package MilkteaKiosk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame {
    private JLabel priceLabel, paymentLabel, changeLabel, background;
    private JTextField paymentField;
    private JButton payButton, backButton;
    private double price;

    public Payment(double price) {
        //call the super if the constructor overriding
        super("Payment");
        this.price = price;

        setLayout(null);

        //Display total price.
        priceLabel = new JLabel("Total Price: PHP " + String.format("%.2f", price));
        priceLabel.setBounds(30, 30, 200, 30);
        add(priceLabel);

        paymentLabel = new JLabel("Enter Payment: ");
        paymentLabel.setBounds(30, 70, 100, 30);
        add(paymentLabel);

        paymentField = new JTextField();
        paymentField.setBounds(150, 70, 100, 30);
        add(paymentField);

        changeLabel = new JLabel("Change: PHP 0.00");
        changeLabel.setBounds(30, 170, 200, 30);
        add(changeLabel);

        payButton = new JButton("Pay Now");
        payButton.setBounds(150, 130, 100, 30);
        add(payButton);

        backButton = new JButton("Back");
        backButton.setBounds(30, 130, 100, 30);
        add(backButton);

        //set background
        background = new JLabel("", new ImageIcon("paymentbg.png"), JLabel.CENTER);
        background.setBounds(0, 0, 300, 300);
        add(background);

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Customization();
            }
        });

        //User Payment.
        payButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double payment = Double.parseDouble(paymentField.getText());
                    if (payment >= price) {
                        double change = payment - price;
                        changeLabel.setText("Change: PHP " + String.format("%.2f", change));
                        JOptionPane.showMessageDialog(null, "Payment Successful! Your change is PHP " + String.format("%.2f", change));
                        dispose();
                        new Product();
                    } else {
                        JOptionPane.showMessageDialog(null, "Insufficient payment. Please enter a valid amount.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });




        setSize(300, 250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
