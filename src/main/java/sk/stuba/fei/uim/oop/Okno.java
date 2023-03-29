package sk.stuba.fei.uim.oop;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class Okno extends JFrame implements ChangeListener, ActionListener {
    private int hodnotaSlidera;
    private JLabel label;
    private int stlaceneTlacidlo;

    public Okno() throws HeadlessException {
        super();
        this.hodnotaSlidera = 20;
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        JPanel menu = new JPanel();
        menu.setBackground(Color.GREEN);
        menu.setLayout(new GridLayout(1,2));

        label = new JLabel();
        this.updateText();
        menu.add(label);

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, this.hodnotaSlidera);
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        menu.add(slider);
        slider.addChangeListener(this);
        slider.setBackground(Color.GREEN);

        this.add(menu, BorderLayout.PAGE_START);

        JPanel klavesnica = new JPanel();
        klavesnica.setLayout(new GridLayout(3,3));

        for (int i = 1; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            klavesnica.add(button);
            button.addActionListener(this);
        }
        this.add(klavesnica, BorderLayout.CENTER);

        this.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        System.out.println(((JSlider) e.getSource()).getValue());
        this.hodnotaSlidera = ((JSlider) e.getSource()).getValue();
        this.updateText();
    }

    private void updateText() {
        label.setText("Hodnota slidera:" + this.hodnotaSlidera + ", Tlacidlo:" + this.stlaceneTlacidlo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.stlaceneTlacidlo = Integer.parseInt(e.getActionCommand());
        this.updateText();
    }
}
