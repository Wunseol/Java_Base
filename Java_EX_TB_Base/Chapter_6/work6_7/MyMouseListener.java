package work6_7;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MyMouseListener implements MouseListener {
    Container c;

    public MyMouseListener(Container c) {
        this.c = c;
    }

    public void mouseEntered(MouseEvent e) {
        c.setBackground(Color.RED);
    }

    public void mouseExited(MouseEvent e) {
        c.setBackground(Color.WHITE);
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }
}
