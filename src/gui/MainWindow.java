package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class MainWindow extends JFrame {
    private JButton confirmButton;
    private JTextField num1Field;
    private JTextField num2Field;

    public MainWindow() throws HeadlessException {
        setTitle("Main window");
        setSize(600, 600);

        this.confirmButton = new JButton("Calculate sum");
        confirmButton.setBounds(300, 300, 200, 60);
        confirmButton.setVisible(true);
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onConfirm();
            }
        });

        num1Field = new JTextField();
        num1Field.setBounds(20, 20, 200, 50);

        num2Field = new JTextField();
        num2Field.setBounds(20, 100, 200, 50);

        add(num1Field);
        add(num2Field);
        add(confirmButton);
        setLayout(null);
    }

    private void onConfirm() {
        System.out.println("Calculate sum");
        try {
            int val1 = Integer.parseInt(num1Field.getText());
            int val2 = Integer.parseInt(num2Field.getText());

            JOptionPane.showMessageDialog(this, "The sum of the 2 numbers is: " + (val1 + val2));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input");
        }
    }
}
