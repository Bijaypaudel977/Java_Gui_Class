package arithmatics;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Arithmatics {

    public static void main(String[] args) {
        // Initialize the main frame
        JFrame frame = new JFrame("Addition and Multiplication Calculator");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main panel with padding (margin)
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 2, 10, 10)); // 4 rows, 2 columns with spacing
        mainPanel.setBorder(new EmptyBorder(15, 15, 15, 15)); // Top, Left, Bottom, Right padding

        // Input fields and labels
        JLabel label1 = new JLabel("Enter First Number:");
        JTextField textField1 = new JTextField();

        JLabel label2 = new JLabel("Enter Second Number:");
        JTextField textField2 = new JTextField();

        // Buttons for addition and multiplication
        JButton addButton = new JButton("Add");
        JButton multiplyButton = new JButton("Multiply");

        // Result field and label
        JLabel resultLabel = new JLabel("Results:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false);

        // Mutable string to store results
        StringBuilder results = new StringBuilder();

        // Add action listener for the addition button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    double sum = num1 + num2;
                    if (results.length() > 0) {
                        results.append(", ");
                    }
                    results.append("Addition: ").append(sum);
                    resultField.setText(results.toString());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add action listener for the multiplication button
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    double product = num1 * num2;
                    if (results.length() > 0) {
                        results.append(", ");
                    }
                    results.append("Multiplication: ").append(product);
                    resultField.setText(results.toString());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Add components to the main panel
        mainPanel.add(label1);
        mainPanel.add(textField1);
        mainPanel.add(label2);
        mainPanel.add(textField2);
        mainPanel.add(addButton);
        mainPanel.add(multiplyButton);
        mainPanel.add(resultLabel);
        mainPanel.add(resultField);

        // Add the main panel to the frame
        frame.add(mainPanel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
