package work6_1;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame{
    public MyJFrame(){
        super("框架示例");
        this.setBounds(100,100,200,100);
        this.getContentPane().setBackground(Color.RED);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
