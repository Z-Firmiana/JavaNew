package com.study.test;

import java.util.Random;

public class Role {
    private String name;
    private int HP;

    public Role() {
    }

    public Role(String name, int HP) {
        this.name = name;
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void attack(Role role){
        //计算伤害
        Random r = new Random();
        int damage = r.nextInt(20) + 1;
        role.setHP(role.getHP() - damage);
        if (role.getHP() < 0) {
            role.setHP(0);
        }
        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，造成了"
        + damage + "点伤害，" + role.getName() + "还剩下" + role.getHP() + "点血。");
    }
}
