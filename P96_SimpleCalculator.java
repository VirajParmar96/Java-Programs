/*
  Program: GUI with Swing (Simple Calculator)
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    Implements a simple calculator GUI using Java Swing
    to perform basic arithmetic operations.
*/

import javax.swing.*;
import java.awt.event.*;

public class P96_SimpleCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(20, 20, 80, 30);
        frame.add(label1);

        JTextField text1 = new JTextField();
        text1.setBounds(100, 20, 150, 30);
        frame.add(text1);

        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(20, 60, 80, 30);
        frame.add(label2);

        JTextField text2 = new JTextField();
        text2.setBounds(100, 60, 150, 30);
        frame.add(text2);

        JButton addButton = new JButton("Add");
        addButton.setBounds(20, 100, 100, 30);
        frame.add(addButton);

        JButton subtractButton = new JButton("Subtract");
        subtractButton.setBounds(150, 100, 100, 30);
        frame.add(subtractButton);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(20, 150, 250, 30);
        frame.add(resultLabel);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(text1.getText());
                int num2 = Integer.parseInt(text2.getText());
                resultLabel.setText("Result: " + (num1 + num2));
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(text1.getText());
                int num2 = Integer.parseInt(text2.getText());
                resultLabel.setText("Result: " + (num1 - num2));
            }
        });

        frame.setVisible(true);
    }
}

/*
  Sample Output:
  - A window titled "Simple Calculator" opens.
  - User enters two numbers and clicks "Add" or "Subtract".
  - The result is displayed below.
*/
