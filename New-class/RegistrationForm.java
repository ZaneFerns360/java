import javax.swing.*;
import java.awt.event.*;

public class RegistrationForm {
    JFrame frame;
    JTextField nameField, emailField, phoneField, userIdField;
    JPasswordField passwordField;

    public static void main(String[] args) {
        new RegistrationForm();
    }

    RegistrationForm() {
        prepareGUI();
    }

    private void prepareGUI() {
        frame = new JFrame("Registration Form");
        frame.setSize(400, 400);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        nameField = new JTextField();
        nameField.setBounds(150, 50, 200, 30);

        JLabel emailLabel = new JLabel("Email ID:");
        emailLabel.setBounds(50, 100, 100, 30);
        emailField = new JTextField();
        emailField.setBounds(150, 100, 200, 30);

        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setBounds(50, 150, 100, 30);
        phoneField = new JTextField();
        phoneField.setBounds(150, 150, 200, 30);

        JLabel userIdLabel = new JLabel("User ID:");
        userIdLabel.setBounds(50, 200, 100, 30);
        userIdField = new JTextField();
        userIdField.setBounds(150, 200, 200, 30);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 250, 100, 30);
        passwordField = new JPasswordField();
        passwordField.setBounds(150, 250, 200, 30);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 300, 100, 30);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userId = userIdField.getText();
                String password = new String(passwordField.getPassword());

                if (userId.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Invalid User ID or Password", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Registration Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(phoneLabel);
        frame.add(phoneField);
        frame.add(userIdLabel);
        frame.add(userIdField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(submitButton);

        frame.setVisible(true);
    }
}
