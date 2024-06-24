package com.study.test2;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("乔峰", 100, '男');
        Role r2 = new Role("鸠摩智", 100, '男');
        while (true) {
            r1.attack(r2);
            if (r2.getHP() == 0) {
                System.out.println(r1.getName() + "K.O.了" + r2.getName());
                break;
            }
            r2.attack(r1);
            if (r1.getHP() == 0) {
                System.out.println(r2.getName() + "KO" + r1.getName());
                break;
            }
        }
//        r1.showRoleInfo();
//        r2.showRoleInfo();

    }
}
