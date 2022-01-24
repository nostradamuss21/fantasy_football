package db_pack;

import javax.swing.*;
import java.awt.*;

public class timer extends board {

    public timer() {

        board db = new timer();


        clock = new JLabel("Clock");
        clock.setBounds(150, 5, 100, 65);
        clock.setBackground(Color.LIGHT_GRAY);
        clock.setFont(new Font("Verdana", Font.BOLD, 20));
        clock.setBorder(BorderFactory.createBevelBorder(0));
        clock.setOpaque(true);
        clock.setHorizontalAlignment(JTextField.CENTER);

        db.panel.add(clock);


    }

}
