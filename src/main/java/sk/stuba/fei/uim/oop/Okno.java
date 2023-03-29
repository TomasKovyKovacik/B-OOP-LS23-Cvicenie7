package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Okno extends JFrame  {

    public Okno() throws HeadlessException {
        super();
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.ORANGE);
        this.setVisible(true);
    }

}
