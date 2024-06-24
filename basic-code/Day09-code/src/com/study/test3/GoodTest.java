package com.study.test3;

public class GoodTest {
    public static void main(String[] args) {
        Good[] arr = new Good[3];
        Good good1 = new Good("001", "华为", 6999.99, 200);
        Good good2 = new Good("002", "苹果", 7999.99, 150);
        Good good3 = new Good("003", "小米", 3999.99, 300);
        arr[0] = good1;
        arr[1] = good2;
        arr[2] = good3;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getId() + "，" + arr[i].getName() + "，" + arr[i].getPrice()
            + "，" + arr[i].getCount());
        }

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getPrice();
        }
        double avg = sum / arr.length;
        System.out.println("平均价格为：" + avg);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPrice() < avg) {
                count++;
                System.out.println(arr[i].getId() + "，" + arr[i].getName() + "，" + arr[i].getPrice()
                        + "，" + arr[i].getCount());
            }
        }
        System.out.println("有" + count + "个品牌价格比平均值低");
    }
}
