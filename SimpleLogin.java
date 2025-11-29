import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleLogin extends JFrame {

    private JTextField userText;
    private JPasswordField passText;
    private JButton loginButton;
    private JLabel statusLabel;

    public SimpleLogin() {
        setTitle("Sistem Login Mahasiswa");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(new GridLayout(4, 2, 10, 10)); 

        add(new JLabel("  Username:"));
        userText = new JTextField();
        add(userText);

        add(new JLabel("  Password:"));
        passText = new JPasswordField(); 
        add(passText);

        add(new JLabel("")); 
        loginButton = new JButton("Login Masuk");
        add(loginButton);

        statusLabel = new JLabel("  Status: Menunggu...");
        add(statusLabel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String pass = new String(passText.getPassword());

                if (user.equalsIgnoreCase("reza") && pass.equals("12345")) {
                    JOptionPane.showMessageDialog(null, "Login Berhasil! Selamat Datang, Reza.");
                    statusLabel.setText("  Status: Sukses");
                    statusLabel.setForeground(Color.BLUE);
                } else {
                    JOptionPane.showMessageDialog(null, "Username/Password Salah!", "Error", JOptionPane.ERROR_MESSAGE);
                    statusLabel.setText("  Status: Gagal");
                    statusLabel.setForeground(Color.RED);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SimpleLogin().setVisible(true);
        });
    }
}