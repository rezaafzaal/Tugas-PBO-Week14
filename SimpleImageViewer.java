import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class SimpleImageViewer extends JFrame {

    private JLabel imageLabel;
    private JButton openButton;

    public SimpleImageViewer() {
        setTitle("Reza Image Viewer");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        imageLabel = new JLabel("Belum ada gambar yang dipilih", SwingConstants.CENTER);
        add(new JScrollPane(imageLabel), BorderLayout.CENTER); // Pakai ScrollPane jika gambar besar

        openButton = new JButton("Buka Gambar");
        add(openButton, BorderLayout.SOUTH);

        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                
                int result = fileChooser.showOpenDialog(null);
                
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());

                    Image img = icon.getImage();
                    Image newImg = img.getScaledInstance(400, 300, Image.SCALE_SMOOTH);
                    imageLabel.setIcon(new ImageIcon(newImg));
                    imageLabel.setText(""); 
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SimpleImageViewer().setVisible(true);
        });
    }
}