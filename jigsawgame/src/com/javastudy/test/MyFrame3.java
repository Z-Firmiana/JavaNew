package com.javastudy.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame3 extends JFrame implements KeyListener {
    //键盘监听
    public MyFrame3() {
        this.setSize(603, 680);
        this.setTitle("测试—事件");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

        //给整个窗体界面添加键盘监听
        this.addKeyListener(this);

        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println("按住不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println("松开");
        int keyCode = e.getKeyCode();
        System.out.println(keyCode);
    }
}
