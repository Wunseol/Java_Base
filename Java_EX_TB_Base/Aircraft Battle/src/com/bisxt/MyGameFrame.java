package com.bisxt;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

import static com.bisxt.GameUtil.*;

public class MyGameFrame extends Frame {

    Image bgImg = GameUtil.getImage("images/bg.png");
    Image planeImg = GameUtil.getImage("images/plane.png");

    Plane plane = new Plane(planeImg,200,200,3,30,30);
    Shell[] shells = new Shell[50];

    Explode explode;

    Date starTime = new Date();
    Date endTime;

    //玩了多久
    int period;


    public void launchFrame(){
        this.setTitle("飞机大战");
        this.setVisible(true);      //窗口默认不可见。需要让他可见
        this.setSize(FRAME_WIDTH,FRAME_HIGHT);
        this.setLocation(300,300);
        //增加关闭窗口的动作
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //启动窗口绘制线程
        new PaintThread().start();
        //启动键盘监听
        this.addKeyListener(new KeyMonitor());
        //初始化50发炮弹
        for(int i = 0;i<shells.length;i++){
            shells[i] = new Shell();
        }
    }

    public void printInfo(Graphics g,String str,int size,int x,int y,Color color){
        Font oldFont = g.getFont();
        Color oldcolor = g.getColor();

        Font f = new Font("宋体",Font.BOLD,size);
        g.setFont(f);
        g.setColor(color);
        g.drawString(str,x,y);

        g.setFont(oldFont);
        g.setColor(oldcolor);


    }

    @Override
    public void paint(Graphics g) {
//        System.out.println("创建窗口");
        g.drawImage(bgImg,0,0,FRAME_WIDTH,FRAME_HIGHT,null);
//        g.drawImage(planeImg,x,y,30,30,null);
        plane.drawMySelf(g);

        for(int i = 0;i<shells.length;i++){
            if(shells[i]!=null){
                shells[i].drawMySelf(g);
                boolean peng = shells[i].getRec().intersects(plane.getRec());
                if(peng){
                    System.out.println("飞机死力!!!!");
                    plane.live=false;

                    endTime = new Date();

                    period = (int)((endTime.getTime()-starTime.getTime())/1000);

                    if(explode == null){
                        explode = new Explode(plane.x,plane.y);
                    }
                    explode.draw(g);



                }
            }
        }

        if(!plane.live){

            printInfo(g,"游戏时间:"+period+"秒",
                    20,200,200,Color.white);
        }




//        x++;
//        Color old = g.getColor();
//        //g就是一支画笔S
//        g.setColor(Color.BLUE);

//        g.drawLine(100,50,400,400);
//        g.drawRect(100,50,400,400);
//        g.drawOval(100,50,400,400);
//        g.drawString("S",100,100);
//
//        g.setColor(old);

    }

    //键盘监听内部类
    class KeyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            plane.addDtrection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            plane.minusDtrection(e);
        }
    }

    //重画线程
    class PaintThread extends Thread{
        @Override
        public void run() {
            while(true){
                repaint();
                try{
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        MyGameFrame frame = new MyGameFrame();
        frame.launchFrame();
    }

    private Image offScreenImage = null;

    @Override
    public void update(Graphics g) {
        if(offScreenImage == null){
            offScreenImage = this.createImage(FRAME_WIDTH,FRAME_HIGHT);
        }
        Graphics goff = offScreenImage.getGraphics();
        paint(goff);
        g.drawImage(offScreenImage,0,0,null);
    }
}
