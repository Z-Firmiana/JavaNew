package com.javastudy.demo.ApiDemoRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApiDemoRegex2 {
    public static void main(String[] args) {
        /*
        有如下文本，请按照要求爬取数据。
        Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
        要求:找出里面所有的JavaXX
         */
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //获取正则表达式的对象
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //获取文本匹配器的对象，m要在str中找符合规则p的小字符串
        Matcher m = p.matcher(str);
        //找到了返回true，并在底层记录子串的起始索引和结束索引+1
        boolean isFind = m.find();
        //根据find方法记录的索引进行字符串的截取，subString(起始索引, 结束索引)；包头不包尾
        String s1 = m.group();
        System.out.println(s1);
        //第二次调用时，会继续读取str后面的内容，因此用循环进行抓取
        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }
    }
}
