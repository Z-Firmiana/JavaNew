package com.javastudy.ui;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {
    // 主界面

    int[][] data = new int[4][4];
    public GameJFrame(){
        initJFrame();

        //菜单创建
        initJMenuBar();
        
        //初始化数据（打乱）
        initdata();
        //初始化图片
        initImage();

    }

    private void initdata() {
        Random r = new Random();
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            data[i / 4][i % 4] = arr[i];
        }


    }

    private void initImage() {
        for (int j = 0; j < 4; j++){
            for (int i = 0; i < 4; i++) {
                JLabel jl = new JLabel(
                        new ImageIcon("D:\\Develop\\program\\jigsawgame\\image\\animal\\animal3\\" + data[j][i] + ".jpg")
                );
                jl.setBounds(105 * i, 105 * j, 105, 105);
                this.getContentPane().add(jl);
            }
        }

        //创建ImageIcon
        //创建JLabel
        //调整位置

        //添加到JFrame
//        this.add(jl1); // 无法居中

    }


    private void initJMenuBar() {
        JMenuBar jmb = new JMenuBar();
        //两个选项
        JMenu function_jm = new JMenu("功能");
        JMenu about_jm = new JMenu("关于我们");
        //条目对象
        JMenuItem replay_jmi = new JMenuItem("重新游戏");
        JMenuItem relogin_jmi = new JMenuItem("重新登录");
        JMenuItem close_jmi = new JMenuItem("关闭游戏");

        JMenuItem account_jmi = new JMenuItem("公众号");

        //将Item组合
        function_jm.add(replay_jmi);
        function_jm.add(relogin_jmi);
        function_jm.add(close_jmi);

        about_jm.add(account_jmi);

        //添加到总菜单
        jmb.add(function_jm);
        jmb.add(about_jm);

        //界面设置菜单
        this.setJMenuBar(jmb);


        //建议写在最后
        this.setVisible(true);
    }

    private void initJFrame() {
        this.setSize(603, 680);
        this.setTitle("拼图游戏单机版 v1.0");
        //设置置顶
        this.setAlwaysOnTop(true);
        //设置居中
        this.setLocationRelativeTo(null);
        //设置默认关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setLayout(null);
    }
}
