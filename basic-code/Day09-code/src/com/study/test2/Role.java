package com.study.test2;

import java.util.Random;

public class Role {
    private String name;
    private int HP;
    private char gender;
    private String face;

    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };
    public Role() {
    }

    public Role(String name, int HP, char gender) {
        this.name = name;
        this.HP = HP;
        this.gender = gender;
        setFace(gender);
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        if (gender == '男') {
            this.face = boyfaces[r.nextInt(boyfaces.length)];
        } else if (gender == '女') {
            this.face = girlfaces[r.nextInt(girlfaces.length)];
        } else {
            this.face = "惨不忍睹";
        }
    }

    public void attack(Role role) {
        //计算伤害
        Random r = new Random();
        int damage = r.nextInt(20) + 1;
        role.setHP(role.getHP() - damage);
        if (role.getHP() < 0) {
            role.setHP(0);
        }
//        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "一下，造成了"
//                + damage + "点伤害，" + role.getName() + "还剩下" + role.getHP() + "点血。");
        System.out.printf(attacks_desc[r.nextInt(attacks_desc.length)] +
                injureds_desc[r.nextInt(injureds_desc.length)], this.getName(), role.getName(), role.getName());
        System.out.println();
    }

    public void showRoleInfo() {
        System.out.println(getName());
        System.out.println(getHP());
        System.out.println(getGender());
        System.out.println(getFace());
    }
}
