package db_pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class board {

    public JFrame frame;
    public JPanel panel;
    public JLabel header, clock, player;
    public JButton start;
    public JTextField team;

    public board() {

        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(2000, 1050);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
        panel.setLayout(null);
        panel.setBackground(Color.DARK_GRAY);
        frame.add(panel);

        header = new JLabel("Header");
        header.setBounds(355, 5, 500, 65);
        header.setBackground(Color.LIGHT_GRAY);
        header.setFont(new Font("Verdana", Font.BOLD, 20));
        header.setBorder(BorderFactory.createBevelBorder(0));
        header.setOpaque(true);
        header.setHorizontalAlignment(JTextField.CENTER);
        panel.add(header);



    }
}
