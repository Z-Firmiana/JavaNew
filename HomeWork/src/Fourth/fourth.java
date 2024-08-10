package Fourth;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class fourth {
    public static void main(String[] args) {
        Liquid water = new Liquid("水", 4, 24);
        Liquid milk = new Liquid("牛奶", 8, 160);
        Liquid wuliangye = new Liquid("五粮液", 2, 4000);
        Liquid cola = new Liquid("可乐", 6, 108);
        Liquid maotai = new Liquid("茅台", 1, 4000);

        List<Liquid> liquidList = new ArrayList<>();
        Collections.addAll(liquidList, water, milk, wuliangye, cola, maotai);
        // for (Liquid liquid : liquidList) {
        // System.out.println(liquid.getName() + "的单价为" + liquid.getOnePrice());
        // }
        System.out.println("---------------------单价列表---------------------");
        liquidList = liquidList.stream().sorted((o1, o2) -> Double.compare(o2.getOnePrice(), o1.getOnePrice()))
                .collect(Collectors.toList());
        for (Liquid liquid : liquidList) {
            System.out.println(liquid.getName() + "的单价为" + liquid.getOnePrice());
        }
        int remain = 10;
        System.out.println("---------------------购买列表---------------------");
        for (Liquid liquid : liquidList) {
            int volume = liquid.getVolume();
            if (remain == 0) {
                System.out.println("---------------------购买完毕---------------------");
                break;
            } else if (remain < volume) {
                System.out.println("购买" + liquid.getName() + remain + "升");
                remain = 0;
            } else {
                System.out.println("购买" + liquid.getName() + volume + "升");
                remain -= volume;
            }
        }
    }
}
