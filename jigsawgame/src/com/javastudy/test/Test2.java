package com.javastudy.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(603, 680);
        jf.setTitle("测试—事件");
        jf.setAlwaysOnTop(true);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLayout(null);

        JButton jButton = new JButton("点击此处继续");
        jButton.setBounds(0, 0, 100, 50);
        //添加动作监听（鼠标左键点击，键盘空格）
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("哈哈哈");
            }
        });

        //按钮添加
        jf.getContentPane().add(jButton);

        jf.setVisible(true);
    }
}
