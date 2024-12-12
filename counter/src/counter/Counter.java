

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Counter Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        // Set frame visibility
        frame.setVisible(true);

        // Create a label to display the count
        JLabel countLabel = new JLabel("0", SwingConstants.CENTER);
        countLabel.setFont(new Font("Arial", Font.BOLD, 48));
        frame.add(countLabel, BorderLayout.CENTER);

        // Create a panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // Create the "Up" button
        JButton upButton = new JButton("Up");
        upButton.setFont(new Font("Arial", Font.PLAIN, 20));
        buttonPanel.add(upButton);

        // Create the "Down" button
        JButton downButton = new JButton("Down");
        downButton.setFont(new Font("Arial", Font.PLAIN, 20));
        buttonPanel.add(downButton);

        // Add the button panel to the frame
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Counter variable
        final int[] count = {0};

        // Add action listeners to the buttons
        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count[0]++;
                countLabel.setText(String.valueOf(count[0]));
            }
        });

        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count[0]--;
                countLabel.setText(String.valueOf(count[0]));
            }
        });

        
        
    }
}

