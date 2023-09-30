package work6_6;

import java.awt.*;
import javax.swing.*;

public class MenuDemo extends JFrame {
    public MenuDemo() {
        super("菜单示例");
        this.setBounds(100, 100, 200, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menubar = new JMenuBar();
        this.setJMenuBar(menubar);
        JMenu menu_file = new JMenu("文件");
        JMenu menu_help = new JMenu("帮助");
        menubar.add(menu_file);
        menubar.add(menu_help);
        JMenuItem mi1 = new JMenuItem("打开");
        JMenuItem mi2 = new JMenuItem("保存");
        JMenuItem mi3 = new JMenuItem("关闭");
        JCheckBoxMenuItem mi4 = new JCheckBoxMenuItem("工具1");
        JCheckBoxMenuItem mi5 = new JCheckBoxMenuItem("工具2");
        JRadioButtonMenuItem mi6 = new JRadioButtonMenuItem("格式1");
        JRadioButtonMenuItem mi7 = new JRadioButtonMenuItem("格式2");
        ButtonGroup bg = new ButtonGroup();
        bg.add(mi6);
        bg.add(mi7);
        menu_file.add(mi1);
        menu_file.add(mi2);
        menu_file.add(mi3);
        menu_file.addSeparator();
        menu_file.add(mi4);
        menu_file.add(mi5);
        menu_file.addSeparator();
        menu_file.add(mi6);
        menu_file.add(mi7);
        this.setVisible(true);
    }
}
