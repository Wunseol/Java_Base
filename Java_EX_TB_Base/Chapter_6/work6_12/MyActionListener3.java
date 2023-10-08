package work6_12;

import java.awt.event.*;
import javax.swing.*;

public class MyActionListener3 implements ActionListener {
    private JTextArea text;

    public MyActionListener3(JTextArea text) {

        this.text = text;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "复制") {
            text.copy();
        }
        if (e.getActionCommand() == "粘贴") {
            text.paste();
        }
        if (e.getActionCommand() == "剪切") {
            text.cut();
        }
    }
}
