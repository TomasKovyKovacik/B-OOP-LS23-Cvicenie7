package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class MojPanel extends JPanel {
    public MojPanel() {
        this.setBackground(Color.YELLOW);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("TENTO PREDMET MA NEBAVI", 50,50);
    }
}
