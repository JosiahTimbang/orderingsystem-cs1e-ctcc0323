package MilkteaKiosk;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Customization extends JFrame {
    private static JLabel size = new JLabel("Size:");
    private static JLabel addons = new JLabel("Add-ons:");
    private JComboBox<String> sizeComboBox, addonsComboBox;
    private JButton cancel, proceedButton;
    JLabel background;

    public Customization() {
        //call the super if the constructor overriding
        super("Customization");
        setLayout(null);

        //set a bounds and calling a add method in the overriding constructor
        size.setBounds(10, 30, 140, 40);
        add(size);
        addons.setBounds(10, 80, 140, 40);
        add(addons);

        //Size customization options
        String[] sizes = {"Medium", "Large"};
        sizeComboBox = new JComboBox<>(sizes);
        sizeComboBox.setBounds(100, 30, 140, 40);
        add(sizeComboBox);

        //Topping customization options
        String[] addonsOptions = {"None", "Boba", "Pudding", "Sago", "Cream Cheese"};
        addonsComboBox = new JComboBox<>(addonsOptions);
        addonsComboBox.setBounds(100, 80, 140, 40);
        add(addonsComboBox);

        cancel = new JButton("Cancel");
        cancel.setBounds(10, 130, 140, 40);
        add(cancel);

        proceedButton = new JButton("Proceed to Order");
        proceedButton.setBounds(170, 130, 140, 40);
        add(proceedButton);

        //Set background
        background = new JLabel("", new ImageIcon("customizationbg.png"), JLabel.CENTER);
        background.setBounds(0, 0, 350, 250);
        add(background);

        //close current frame
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // close the current frame
                new Product(); // make the original Menu frame visible again
            }
        });

        //proceed to payment
        proceedButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedSize = (String) sizeComboBox.getSelectedItem();
                String selectedAddons = (String) addonsComboBox.getSelectedItem();
                double totalPrice = calculatePrice(selectedSize, selectedAddons);
                dispose();
                new Payment(totalPrice);
            }
        });


        setSize(340, 225);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    // Method to calculate price based on size and addons preference
    private double calculatePrice(String size, String addons) {
        double basePrice = 0.0;

        // Assign prices based on size and add-ons preference
        if (size.equals("Medium")) {
            basePrice += 80.0; // price for Medium size
        } else if (size.equals("Large")) {
            basePrice += 100.0; // price for Large size
        }

        if (addons.equals("None")) {
            //No additional cost
        } else if (addons.equals("Boba")) {
            basePrice += 15.0; // Additional cost for boba
        } else if (addons.equals("Pudding")) {
            basePrice += 15.0; // Additional cost for pudding
            return basePrice;
        } else if (addons.equals("Sago")) {
            basePrice += 15.0; // Additional cost for sago
            return basePrice;
        } else if (addons.equals("Cream Cheese")) {
            basePrice += 15.0; // Additional cost for cream cheese
            return basePrice;
        }
        return basePrice;
    }

    // Method to save the transaction details to a file
    private void saveTransactionToFile(String size, String addons, double totalPrice) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("history.txt", true))) {
            writer.write("Size: " + size);
            writer.newLine();
            writer.write("Add-ons: " + addons);
            writer.newLine();
            writer.write("Total Price: PHP " + totalPrice);
            writer.newLine();
            writer.write("-------------");
            writer.newLine();
        }
    }

    // Inner class to display price in a new frame
    private class PriceDisplay extends JFrame {

        double totalPrice;
        double change;

        public PriceDisplay(double price) {
            super("Total Price");
            this.totalPrice = price;
            setSize(300, 100);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLocationRelativeTo(null); // Center the frame on screen

            JLabel priceLabel = new JLabel("Total Price: PHP" + totalPrice);
            priceLabel.setHorizontalAlignment(SwingConstants.CENTER);
            add(priceLabel, BorderLayout.NORTH);


            setVisible(true);


        }

    }
}