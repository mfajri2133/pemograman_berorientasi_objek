package pertemuan15.kasus2_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Penjumlahan extends JFrame {
    private JTextField inputField1;
    private JTextField inputField2;
    private JButton btnJumlah;

    public Penjumlahan() {
        setTitle("Penjumlahan");
        setSize(200, 200);
        setLayout(new GridLayout(3,1));

        inputField1 = new JTextField();
        add(inputField1);

        inputField2 = new JTextField();
        add(inputField2);

        btnJumlah = new JButton("Jumlah");
        add(btnJumlah);

        btnJumlah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int angka1 = Integer.parseInt(inputField1.getText());
                    int angka2 = Integer.parseInt(inputField2.getText());
                    int hasil = angka1 + angka2;

                    JOptionPane.showMessageDialog(null, "Jumlah: " + hasil,
                            "Message", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        Penjumlahan p = new Penjumlahan();
        p.setVisible(true);
    }
}
