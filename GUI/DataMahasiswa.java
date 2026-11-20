
import javax.swing.*;
import java.awt.*;

public class DataMahasiswa extends JFrame {

    public DataMahasiswa() {
        setTitle("Data Mahasiswa");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel judul = new JLabel("FORM DATA MAHASISWA");
        JTextField nama = new JTextField();
        JPasswordField password = new JPasswordField();
        JCheckBox setuju = new JCheckBox("Saya setuju");
        JComboBox<String> jurusan = new JComboBox<>(new String[]{"Informatika", "Elektro", "Sipil"});
        JButton simpan = new JButton("Simpan");

        judul.setFont(new Font("Arial", Font.BOLD, 18));
        judul.setHorizontalAlignment(JLabel.CENTER);

        JPanel panel = new JPanel(new GridLayout(4, 2, 5, 5));
        panel.add(new JLabel("Nama:"));
        panel.add(nama);
        panel.add(new JLabel("Password:"));
        panel.add(password);
        panel.add(new JLabel("Jurusan:"));
        panel.add(jurusan);
        panel.add(setuju);
        panel.add(simpan);

        add(judul, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        simpan.addActionListener(e -> {
            if (setuju.isSelected()) {
                JOptionPane.showMessageDialog(this,
                    "Halo, " + nama.getText());
            } else {
                JOptionPane.showMessageDialog(this,
                    "Silakan setujui pendaftaran!");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DataMahasiswa().setVisible(true);
        });
    }
}
