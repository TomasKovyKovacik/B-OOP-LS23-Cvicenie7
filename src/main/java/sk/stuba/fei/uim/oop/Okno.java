package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Okno extends JFrame implements MouseListener, MouseMotionListener, KeyListener {
    public Okno() throws HeadlessException {
        super();
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
        this.addKeyListener(this);
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

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("KLIK : " + e.getPoint().toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("PRESS : " + e.getPoint().toString());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("RELEASED : " + e.getPoint().toString());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("EnTERED : " + e.getPoint().toString());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("EXITED : " + e.getPoint().toString());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("TYPED " + e.getKeyChar());
        System.out.println("TYPED " + e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Presed key " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Released key " + e.getKeyChar());
    }
}
