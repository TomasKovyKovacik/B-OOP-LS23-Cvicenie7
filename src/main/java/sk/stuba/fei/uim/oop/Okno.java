package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Okno extends UniversalAdapter {
    public Okno() throws HeadlessException {
        super();
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(this);
        this.setVisible(true);
    }


    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e);
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                System.out.println("dopredu");
                break;
            case KeyEvent.VK_A:
                System.out.println("dolava");
                break;
            case KeyEvent.VK_D:
                System.out.println("doprava");
                break;
            case KeyEvent.VK_S:
                System.out.println("dozadu");
                break;
        }
    }

}
