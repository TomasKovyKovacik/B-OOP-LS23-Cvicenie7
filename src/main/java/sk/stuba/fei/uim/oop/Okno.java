package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Okno extends JFrame implements MouseMotionListener {
    public Okno() throws HeadlessException {
        super();
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addMouseMotionListener(this);
        this.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("DRAG : " + e.getPoint().toString());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Move : " + e.getPoint().toString());
    }
}
