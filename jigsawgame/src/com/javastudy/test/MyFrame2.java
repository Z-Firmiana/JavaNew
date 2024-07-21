package com.javastudy.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class MyFrame2 extends JFrame implements MouseListener {
    //鼠标监听
    JButton jtb1 = new JButton("点击此处1");

    public MyFrame2() {
        this.setSize(603, 680);
        this.setTitle("测试—事件");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

        jtb1.setBounds(0, 0, 100, 50);
        jtb1.addMouseListener(this);

        this.getContentPane().add(jtb1);

        this.setVisible(true);

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按住不动");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
}
