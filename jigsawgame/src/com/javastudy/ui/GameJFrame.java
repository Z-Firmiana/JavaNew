package com.javastudy.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    // 主界面
    JMenuItem beauty_jmi = new JMenuItem("美女");
    JMenuItem animal_jmi = new JMenuItem("动物");
    JMenuItem sport_jmi = new JMenuItem("运动");

    JMenuItem replay_jmi = new JMenuItem("重新游戏");
    JMenuItem relogin_jmi = new JMenuItem("重新登录");
    JMenuItem close_jmi = new JMenuItem("关闭游戏");

    JMenuItem account_jmi = new JMenuItem("公众号");
    int[][] data = new int[4][4];
    int[][] win = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //统计步数
    int step = 0;

    //定义路径
    String path = "image/animal/animal3/";

    //记录空白方块位置
    int x = 0;
    int y = 0;

    public GameJFrame() {
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
            if (arr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = arr[i];
        }


    }

    private void initImage() {

        //清除图片
        this.getContentPane().removeAll();
        //判断胜利
        if (victory()) {
            //显示胜利图标
            JLabel winJl = new JLabel(new ImageIcon("image/win.png"));
            winJl.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJl);
        }

        //设置步数显示
        JLabel stepCount = new JLabel("步数：" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);
        //先加载的图片在上方，后加载的在下方
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                JLabel jl = new JLabel(
                        new ImageIcon(path + data[j][i] + ".jpg")
                );
                jl.setBounds(105 * i + 83, 105 * j + 134, 105, 105);
                //图片添加边框
                jl.setBorder(new BevelBorder(BevelBorder.LOWERED));
                this.getContentPane().add(jl);
            }
        }
//        JLabel jlbg = new JLabel(new ImageIcon("../jigsawgame/image/background.png"));
        JLabel jlbg = new JLabel(new ImageIcon("image/background.png"));
        jlbg.setBounds(38, 40, 508, 560);
        this.getContentPane().add(jlbg);
        //刷新
        this.getContentPane().repaint();

    }


    private void initJMenuBar() {
        JMenuBar jmb = new JMenuBar();
        //两个选项
        JMenu function_jm = new JMenu("功能");
        JMenu about_jm = new JMenu("关于我们");
        //条目对象


        //将Item组合
        JMenu replace_jmi = new JMenu("更换图片");
        replace_jmi.add(beauty_jmi);
        replace_jmi.add(animal_jmi);
        replace_jmi.add(sport_jmi);

        function_jm.add(replace_jmi);
        function_jm.add(replay_jmi);
        function_jm.add(relogin_jmi);
        function_jm.add(close_jmi);

        about_jm.add(account_jmi);

        //给条目绑定事件
        replay_jmi.addActionListener(this);
        relogin_jmi.addActionListener(this);
        close_jmi.addActionListener(this);
        account_jmi.addActionListener(this);
        beauty_jmi.addActionListener(this);
        animal_jmi.addActionListener(this);
        sport_jmi.addActionListener(this);

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

        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
//        System.out.println(keyCode);
        if (keyCode == 65) {
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            JLabel jlbg = new JLabel(new ImageIcon("image/background.png"));
            jlbg.setBounds(38, 40, 508, 560);
            this.getContentPane().add(jlbg);
            //刷新
            this.getContentPane().repaint();


        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (victory()) {
            return;
        }
        //左：37；上：38；右：39；下：40
        int keyCode = e.getKeyCode();
        System.out.println(keyCode);
        switch (keyCode) {
            case 37 -> {
                //向左移动
                if (y == 3) {
                    return;
                }
                data[x][y] = data[x][y + 1];
                data[x][y + 1] = 0;
                y++;
                step++;
                //调用方法加载图片
                initImage();
            }
            case 38 -> {
                //向上移动
                if (x == 3) {
                    return;
                }
                data[x][y] = data[x + 1][y];
                data[x + 1][y] = 0;
                x++;
                step++;
                //调用方法加载图片
                initImage();
            }
            case 39 -> {
                //向右移动
                if (y == 0) {
                    return;
                }
                data[x][y] = data[x][y - 1];
                data[x][y - 1] = 0;
                y--;
                step++;
                //调用方法加载图片
                initImage();
            }
            case 40 -> {
                //向下移动
                if (x == 0) {
                    return;
                }
                data[x][y] = data[x - 1][y];
                data[x - 1][y] = 0;
                x--;
                step++;
                //调用方法加载图片
                initImage();
            }
            case 65 -> initImage();
            case 87 -> {
                data = new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 0}
                };
                initImage();
            }

            default -> {
            }
        }
    }

    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random r = new Random();
        //获取当前点击条目
        Object obj = e.getSource();
        if (obj == replay_jmi) {
            //计数器清零
            step = 0;
            //打乱数据
            initdata();
            //重新加载图片
            initImage();
        } else if (obj == relogin_jmi) {
            //关闭当前游戏界面
            this.setVisible(false);
            new LoginJFrame();
        } else if (obj == close_jmi) {
            System.exit(0);
        } else if (obj == account_jmi) {
            System.out.println("公众号");
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("image/about.png"));
            jLabel.setBounds(0, 0, 258, 258);

            //弹窗设置
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(344, 344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);
        } else if (obj == beauty_jmi) {
            path = "image/girl/girl" + + (r.nextInt(13) + 1) + "/";;
            initdata();
            initImage();
        } else if (obj == animal_jmi) {
            path = "image/animal/animal" + + (r.nextInt(8) + 1) + "/";;
            initdata();
            initImage();
        } else if (obj == sport_jmi) {
            path = "image/sport/sport" + + (r.nextInt(10) + 1) + "/";;
            initdata();
            initImage();
        }
    }
}
