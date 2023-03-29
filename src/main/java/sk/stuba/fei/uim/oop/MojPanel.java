package sk.stuba.fei.uim.oop;

import lombok.Setter;

import javax.swing.*;
import java.awt.*;

public class MojPanel extends JPanel {
    @Setter
    private boolean highlight;

    public MojPanel() {
        this.setBackground(Color.YELLOW);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawRect(3,3,this.getWidth() - 3, this.getHeight()-3);
        if (this.highlight) {
            g.setColor(Color.RED);
            ((Graphics2D) g).setStroke(new BasicStroke(3));
            g.drawRect(3,3,this.getWidth() - 3, this.getHeight()-3);
            this.highlight = false;
        }

    }
}
