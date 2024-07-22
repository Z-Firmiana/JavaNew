package com.javastudy.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LoginJFrame extends JFrame implements ActionListener {
    String key = initKey();
    JLabel sewCheck = new JLabel(key);

    // 登录界面
    public LoginJFrame(){
        initJFrame();

        initImage();

        //建议写在最后
    }

    private void initImage() {
        this.getContentPane().removeAll();
        //输入界面
        JLabel userName = new JLabel(new ImageIcon("image/login/用户名.png"));
        userName.setBounds(100,150,47,17);
        this.getContentPane().add(userName);
        JLabel password = new JLabel(new ImageIcon("image/login/密码.png"));
        password.setBounds(100,200,32,16);
        this.getContentPane().add(password);
        JLabel checkKey = new JLabel(new ImageIcon("image/login/验证码.png"));
        checkKey.setBounds(100,250,56,21);
        this.getContentPane().add(checkKey);

        JTextField userNameInput = new JTextField();
        userNameInput.setBounds(200,150,200,25);
        this.getContentPane().add(userNameInput);

        JPasswordField passwordInput = new JPasswordField();
        passwordInput.setBounds(200,200,200,25);
        this.getContentPane().add(passwordInput);

        JTextField checkKeyInput = new JTextField();
        checkKeyInput.setBounds(200,250,100,25);
        this.getContentPane().add(checkKeyInput);


        sewCheck.setBounds(330,210,100,100);
        this.getContentPane().add(sewCheck);

        //登录背景
        JLabel backGround = new JLabel(new ImageIcon("image/login/background.png"));
        backGround.setBounds(2,0,470, 390);
        this.getContentPane().add(backGround);

        this.getContentPane().repaint();
    }

    private String initKey() {
        Random r = new Random();
        String code = "";
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) (97 + i);
            }else {
                chs[i] = (char) (65 + i -26);
            }
        }
//        for (int i = 0; i < chs.length; i++) {
//            System.out.print(chs[i]+ " ");
//        }
        for (int i = 0; i < 4; i++) {
            code = code + chs[r.nextInt(chs.length)];
        }
        code = code + r.nextInt(10);
        return code;
    }

    private void initJFrame() {
        this.setSize(488, 433);
        this.setTitle("拼图游戏 v1.0 登录");
        //设置置顶
        this.setAlwaysOnTop(true);
        //设置居中
        this.setLocationRelativeTo(null);
        //设置默认关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setLayout(null);


        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
