package com.bisxt;

import java.awt.*;

public class Shell extends GameObject{
    double degree;


    @Override
    public void drawMySelf(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.ORANGE);
        g.fillOval(x,y,width,height);
        //炮弹沿着任意角度飞
//        System.out.println("kkkkk"+Math.cos(degree));
        x += speed*Math.cos(degree);
        y += speed*Math.sin(degree);
//        System.out.println("xxxx"+x);
//        System.out.println("YYYY"+y);
        //实现边界碰撞回弹
        if(y>GameUtil.FRAME_HIGHT-10||y<30){
            degree = -degree;
        }
        if(x>GameUtil.FRAME_WIDTH-10||x<0){
            degree = Math.PI-degree;
        }
        g.setColor(c);

    }

    public Shell(){

        //子弹随机弧度
        degree = Math.random()*Math.PI*2;
        System.out.println(degree);
        x = 100;
        y = 100;
        width = 10;
        height = 10;
        speed = 3;

    }
}
