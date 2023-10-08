package work6_12;

import java.awt.event.*;
import javax.swing.*;

public class MyMouseListener implements MouseListener {
    private JTextArea text;
    private JPopupMenu popmenu;

    public MyMouseListener(JTextArea text, JPopupMenu popmenu) {
        this.text = text;
        this.popmenu = popmenu;
    }

    public void mouseClicked(MouseEvent e) {
        if (e.getModifiers() == MouseEvent.BUTTON3_MASK)
            popmenu.show(text, e.getX(), e.getY());
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

}
