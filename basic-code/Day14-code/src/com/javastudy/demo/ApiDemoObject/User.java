package com.javastudy.demo.ApiDemoObject;

import java.util.StringJoiner;
/*
Cloneable
接口没用抽象方法，表示当前的接口是一个标记性接口
Cloneable表示一旦实现，当前类的对象就可以被克隆
如果没有实现，则无法克隆
 */
public class User implements Cloneable{
    private int id;// 游戏角色
    private String username;
    private String password;
    private String path;// 游戏图片
    private int[] data;// 游戏进度

    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "角色编号为：" + id + "，用户名：" + username + "，密码：" + password + "，游戏图片：" + path + "，进度：" + attToString();
    }

    private String attToString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }
        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类的clone方法并返回
        //深克隆
        //可使用Gson进行深克隆
        int[] data = this.data;
        int[] newData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        User u = (User) super.clone();
        u.data = newData;
        return u;
    }
}
