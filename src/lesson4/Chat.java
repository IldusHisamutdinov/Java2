package lesson4;

import javax.swing.*;

public class Chat {
    private JTextArea chatText;
    private JButton Button;
    private JTextField messageField;
    private JList<String> userList;
    private JPanel mainPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Чат");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(440, 280);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(new Chat().mainPanel);
        frame.setVisible(true);
    }

    public Chat() {
        addListeners();
    }

    private void addListeners() {
        Button.addActionListener(e -> sendMessage());
        messageField.addActionListener(e -> sendMessage());
    }

    private void sendMessage() {
        String message = messageField.getText();
        if (message.isEmpty()) {
            return;
        }

        String user = userList.getSelectedValue();
        if (user != null) {
            addMessage(user, message);
        }
        messageField.setText(null);
    }

    private void addMessage(String user, String message) {
        String stringMessage = String.format("%s: %s%n", user, message);
        chatText.append(stringMessage);
    }

 }

