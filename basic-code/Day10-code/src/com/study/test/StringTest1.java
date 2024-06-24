package com.study.test;

public class StringTest1 {
    public static void main(String[] args) {
        String str = moneyTransfer(5412);
        System.out.println(str);
    }

    public static String moneyTransfer(int money) {
        String bigMoney = "";
        String[] arr = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
        while (money > 0) {
            int num = money % 10;
            bigMoney = arr[num] + bigMoney;
            money /= 10;
        }
        int length1 = bigMoney.length();
        for (int i = 0; i < 7 - length1; i++) {
            bigMoney = "零" + bigMoney;
        }
        System.out.println(bigMoney);
        String temp = "";
        String[] temp1 = { "佰", "拾", "万", "仟", "佰", "拾", "元" };
        for (int i = 0; i < bigMoney.length(); i++) {
            temp = temp + bigMoney.charAt(i) + temp1[i];
        }
    
        return temp;
    }
}
