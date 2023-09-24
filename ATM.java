import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ATM_GUI {
    private static int balance = 5000;

    public static void main(String[] args) {
        JFrame frame = new JFrame("ATM Machine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(2, 2));

        JLabel balanceLabel = new JLabel("Balance: $" + balance);
        JTextField amountField = new JTextField();
        JButton withdrawButton = new JButton("Withdraw");
        JButton depositButton = new JButton("Deposit");

        frame.add(balanceLabel);
        frame.add(amountField);
        frame.add(withdrawButton);
        frame.add(depositButton);

        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int amount = Integer.parseInt(amountField.getText());
                if (amount <= balance) {
                    balance -= amount;
                    balanceLabel.setText("Balance: $" + balance);
                    JOptionPane.showMessageDialog(null, "Please collect your money");
                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                }
                amountField.setText("");
            }
        });

        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int amount = Integer.parseInt(amountField.getText());
                balance += amount;
                balanceLabel.setText("Balance: $" + balance);
                JOptionPane.showMessageDialog(null, "Your Money has been successfully deposited");
                amountField.setText("");
            }
        });

        frame.setVisible(true);
    }
}
