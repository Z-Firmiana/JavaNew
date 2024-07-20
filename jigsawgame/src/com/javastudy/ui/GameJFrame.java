package com.javastudy.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    // 主界面
    public GameJFrame(){
        initJFrame();

        //菜单创建
        initJMenuBar();

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
    }
}
