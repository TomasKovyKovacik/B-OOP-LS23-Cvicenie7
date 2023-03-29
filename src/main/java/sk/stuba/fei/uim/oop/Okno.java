package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Okno extends UniversalAdapter {
    private JPanel panel;
    public Okno() throws HeadlessException {
        super();
        this.setSize(700, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));
        panel.add(new MojPanel());
        panel.add(new MojPanel());
        panel.add(new MojPanel());
        panel.add(new MojPanel());
        this.add(panel);
        this.addMouseMotionListener(this);
        this.setVisible(true);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        Component current = this.panel.getComponentAt(e.getPoint());
        if ((current instanceof MojPanel)) {
            ((MojPanel) current).setHighlight(true);
        }
    }
}
