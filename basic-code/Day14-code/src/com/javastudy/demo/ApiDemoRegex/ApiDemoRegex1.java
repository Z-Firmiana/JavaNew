package com.javastudy.demo.ApiDemoRegex;

public class ApiDemoRegex1 {
    public static void main(String[] args) {
        /*
        正则表达式验证QQ号是否正确
        1.6到20位之间
        2.0不能在开头
        3.必须全部是数字
         */
        String qq = "1234567890";

        System.out.println(qq.matches("[1-9]\\d{5,19}"));


        //在一段文本中查找满足要求的内容
        System.out.println("-----------1-------------");
        System.out.println("a".matches("[abc]")); // true
        System.out.println("z".matches("[abc]")); // false
        System.out.println("ab".matches("[abc]")); // false
        System.out.println("ab".matches("[abc][abc]")); // true

        // 不能出现a b c
        System.out.println("-----------2-------------");
        System.out.println("a".matches("[^abc]")); // false
        System.out.println("z".matches("[^abc]")); // true
        System.out.println("zz".matches("[^abc]")); //false
        System.out.println("zz".matches("[^abc][^abc]")); //true

        // a到zA到Z(包括头尾的范围)
        System.out.println("-----------3-------------");
        System.out.println("a".matches("[a-zA-z]")); // true
        System.out.println("z".matches("[a-zA-z]")); // true
        System.out.println("aa".matches("[a-zA-z]"));//false
        System.out.println("zz".matches("[a-zA-Z]")); //false
        System.out.println("zz".matches("[a-zA-Z][a-zA-Z]")); //true
        System.out.println("0".matches("[a-zA-Z]"));//false
        System.out.println("0".matches("[a-zA-Z0-9]"));//true


        // [a-d[m-p]] a到d，或m到p
        System.out.println("-----------4-------------");
        System.out.println("a".matches("[a-d[m-p]]"));//true
        System.out.println("d".matches("[a-d[m-p]]")); //true
        System.out.println("m".matches("[a-d[m-p]]")); //true
        System.out.println("p".matches("[a-d[m-p]]")); //true
        System.out.println("e".matches("[a-d[m-p]]")); //false
        System.out.println("0".matches("[a-d[m-p]]")); //false

        // [a-z&&[def]] a-z和def的交集。为:d，e，f
        // 不能写为&
        System.out.println("----------5------------");
        System.out.println("a".matches("[a-z&[def]]")); //false
        System.out.println("d".matches("[a-z&&def]")); //true
        System.out.println("0".matches("[a-z&&[def]]")); //false
        System.out.println("&".matches("[a-z&def]"));

        // [a-z&&[^bc]] a-z和非bc的交集。(等同于[ad-z])
        System.out.println("-----------6------------_");
        System.out.println("a".matches("[a-z&&[^bc]]"));//true
        System.out.println("b".matches("[a-z&&[^bc]]")); //false
        System.out.println("0".matches("[a-z&&[^bc]]")); //false

        // [a-z&&[^m-p]] a到z和除了m到p的交集。(等同于[a-1q-z])
        System.out.println("-----------7-------------");
        System.out.println("a".matches("[a-z&&[^m-p]]")); //true
        System.out.println("m".matches("[a-z&&[^m-p]]")); //false
        System.out.println("0".matches("[a-z&&[^m-p]]")); //false

        /*
        \ 转义字符 改变后面那个字符原本的含义
        练习:以字符串的形式打印一个双引号
        "在Java中表示字符串的开头或者结尾

        此时\表示转义字符，改变了后面那个双引号原本的含义
        把他变成了一个普普通通的双引号而已。
         */
        System.out.println("\"");

        /*
        \表示转义字符
        两个\的理解方式：前面的\是一个转义字符，改变了后面\原本的含义，把他变成一个普普通通的\而已。
         */
        System.out.println("c:Users\\moon\\IdeaProjects\\basic-code\\myapi\\src\\com\\itheima\\a08regexdemo\\RegexDemo1.java");


        // .表示任意一个字符
        System.out.println("你".matches("..")); //false
        System.out.println("你".matches(".")); //true
        System.out.println("你a".matches(".."));//true

        /*
        \\d 表示任意的一个数字
        \\d只能是任意的一位数字
        简单来记:两个\表示一个\
         */
        System.out.println("a".matches("\\d")); // false
        System.out.println("3".matches("\\d")); // true
        System.out.println("333".matches("\\d")); // false

        // \\w只能是一位单词字符[a-zA-Z_0-9]
        System.out.println("z".matches("\\w")); // true
        System.out.println("2".matches("\\w")); // true
        System.out.println("21".matches("\\w")); // false
        System.out.println("你".matches("\\w"));//false
        System.out.println("_".matches("\\w"));//true

        // 非单词字符
        System.out.println("你".matches("\\W")); // true
        System.out.println("---------------------------------------------");
        // 以上正则匹配只能校验单个字符。


        // 必须是数字 字母 下划线 至少 6位
        System.out.println("2442fsfsf".matches("\\w{6,}"));//true
        System.out.println("244f".matches("\\w{6,}"));//false

        // 必须是数字和字符 必须是4位
        System.out.println("23dF".matches("[a-zA-Z0-9]{4}"));//true
        System.out.println("23 F".matches("[a-zA-Z0-9]{4}"));//false
        System.out.println("23dF".matches("[\\w&&[^_]]{4}"));//true
        System.out.println("23_F".matches("[\\w&&[^_]]{4}"));//false

        /*
        座机电话号码
        020-2324242 02122442 027-42424 0712-3242434
        思路:
        在书写座机号正则的时候需要把正确的数据分为三部分
        一:区号@\\d{2,3}
              0:表示区号一定是以0开头的
              \\d{2,3}:表示区号从第二位开始可以是任意的数字，可以出现2到3次。
        二:- ?表示次数，0次或一次
        三:号码 号码的第一位也不能以0开头，从第二位开始可以是任意的数字，号码的总长度:5-10位
         */
        System.out.println("----------------------------座机号码----------------------------");
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regex2));
        System.out.println("02122442".matches(regex2));
        System.out.println("027-42424".matches(regex2));
        System.out.println("0712-3242434".matches(regex2));

    }
}
