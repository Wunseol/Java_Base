package work6_8;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MyMouseListener2 extends MouseAdapter {
    Container c;

    public MyMouseListener2(Container c) {
        this.c = c;
    }

    public void mouseEntered(MouseEvent e) {
        c.setBackground(Color.RED);
    }

    public void mouseExited(MouseEvent e) {
        c.setBackground(Color.WHITE);
    }
}
