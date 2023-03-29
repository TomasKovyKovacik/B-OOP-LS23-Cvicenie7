package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Okno extends JFrame implements MouseListener{
    public Okno() throws HeadlessException {
        super();
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addMouseListener(this);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("KLIK : " + e.getPoint().toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("PRESSED : " + e.getPoint().toString());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("RELEASED : " + e.getPoint().toString());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("ENTERED : " + e.getPoint().toString());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("EXITED : " + e.getPoint().toString());
    }
}
