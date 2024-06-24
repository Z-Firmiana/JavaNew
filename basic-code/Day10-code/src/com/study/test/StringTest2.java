package com.study.test;

public class StringTest2 {
    public static void main(String[] args) {
        // 手机号屏蔽
        String phoneNumber = "13112349268";
        String blockNumber = phoneNumberBlock(phoneNumber);
        System.out.println("blocked number is " + blockNumber);

        // 身份证信息查看
        String id = "360124200105261223";
        idCardInfoShow(id);
        
        // 敏感词替换
        String talk = "你TMD打得太好了！CNM,MLGB,SB";
        String newTalk = wordReplace(talk);
        System.out.println("new talk is " + newTalk);
    }

    // 手机号屏蔽方法
    public static String phoneNumberBlock(String phoneNumber) {
        String frontNumber = phoneNumber.substring(0, 3);
        String backNumber = phoneNumber.substring(7);
        String blockNumber = frontNumber + "****" + backNumber;
        return blockNumber;
    }

    // 身份证信息查看 
    public static void idCardInfoShow(String idCardNum) {
        String year = idCardNum.substring(6, 10);
        String month = idCardNum.substring(10, 12);
        String day = idCardNum.substring(12, 14);
        char gender = idCardNum.charAt(16);
        int genderNum = gender - 48;
        if (genderNum % 2 == 0) {
            gender = '女';
        } else {
            gender = '男';
        }
        System.out.println("人物信息为：");
        System.out.printf("出生年月日：%s年%s月%s日", year, month, day);
        System.out.println();
        System.out.println("性别为：" + gender);
    }

    // 敏感词替换
    public static String wordReplace(String str) {
        String[] arr = {"TMD", "CNM", "MLGB", "SB"};
        String newStr = str;
        for (int i = 0; i < arr.length; i++) {
            newStr = newStr.replace(arr[i], "***");
        }
        return newStr;
    }
}
