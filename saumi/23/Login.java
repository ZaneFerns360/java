import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class UserInformationGUI extends JFrame {
    private JTextField nameField, emailField, phoneField;

    public UserInformationGUI() {
        setTitle("User Information");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 2));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        JLabel emailLabel = new JLabel("Email ID:");
        emailField = new JTextField();

        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneField = new JTextField();

        JButton submitButton = new JButton("Submit");

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(submitButton);

        add(panel);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();

                if (isValidData(name, email, phone)) {
                    JOptionPane.showMessageDialog(UserInformationGUI.this, "User Information is Valid!");
                } else {
                    JOptionPane.showMessageDialog(UserInformationGUI.this, "Invalid User Information");
                }
            }
        });
    }

    private boolean isValidData(String name, String email, String phone) {
        return ((name.equals("name"))&&(email.equals("email"))&&phone.equals("phone"));
    }
    public static void main(String[] args) {
        UserInformationGUI userInformationGUI = new UserInformationGUI();
        userInformationGUI.setVisible(true);
    }
}
