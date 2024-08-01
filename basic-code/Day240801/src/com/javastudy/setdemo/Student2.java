package com.javastudy.setdemo;

public class Student2 implements Comparable<Student2> {
    private String name;
    private int age;
    private double chinese;
    private double math;
    private double english;

    public Student2() {
    }

    public Student2(String name, int age, double chinese, double math, double english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return chinese
     */
    public double getChinese() {
        return chinese;
    }

    /**
     * 设置
     *
     * @param chinese
     */
    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     *
     * @return math
     */
    public double getMath() {
        return math;
    }

    /**
     * 设置
     *
     * @param math
     */
    public void setMath(double math) {
        this.math = math;
    }

    /**
     * 获取
     *
     * @return english
     */
    public double getEnglish() {
        return english;
    }

    /**
     * 设置
     *
     * @param english
     */
    public void setEnglish(double english) {
        this.english = english;
    }

    public String toString() {
        return "Student2{name = " + name + ", age = " + age + ", chinese = " + chinese + ", math = " + math + ", " +
                "english = " + english  + "}";
    }

    @Override
    public int compareTo(Student2 o) {
        double sumThis = this.getChinese() + this.getMath() + this.getEnglish();
        double sumO = o.getChinese() + o.getMath() + o.getEnglish();
        double result = sumO - sumThis;
        result = result == 0 ? o.getChinese() - this.getChinese() : result;
        result = result == 0 ? o.getMath() - this.getMath() : result;
        result = result == 0 ? o.getEnglish() - this.getEnglish() : result;
        result = result == 0 ? this.getAge() - o.getAge() : result;
        result = result == 0 ? this.getName().compareTo(o.getName()) : result;
        if (result > 0) {
            return 1;
        } else if (result < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
