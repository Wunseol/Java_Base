package work6_11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DialogDemo extends JFrame {
    private JButton btn;
    private MyJDialog dialog;

    public DialogDemo() {
        super("对话框示例");
        this.setBounds(100, 100, 200, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        btn = new JButton("打开对话框");
        this.getContentPane().add(btn);

        dialog = new MyJDialog(this);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btn)
                    dialog.setVisible(true);
            }
        });
        this.setVisible(true);
    }

    class MyJDialog extends JDialog {
        public MyJDialog(JFrame jframe) {
            super(jframe, "我的对话框", true);
            this.setBounds(jframe.getX() + jframe.getWidth() + 10, jframe.getY(), 150, 150);
            this.setDefaultCloseOperation(HIDE_ON_CLOSE);
            this.getContentPane().setLayout(new FlowLayout());
            this.getContentPane().add(new JButton("学习"));
            this.getContentPane().add(new JButton("休息"));
        }
    }
}
