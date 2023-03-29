package sk.stuba.fei.uim.oop;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class Okno extends JFrame implements ChangeListener {
    public Okno() throws HeadlessException {
        super();
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSlider slider = new JSlider(JSlider.VERTICAL, 0, 50, 22);
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        this.add(slider);
        slider.addChangeListener(this);


        this.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        System.out.println(((JSlider) e.getSource()).getValue());
    }
}
