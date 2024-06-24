package com.study.test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Users> list = new ArrayList<>();
        Users user1 = new Users("001", "user1", "1001");
        Users user2 = new Users("002", "user2", "2002");
        Users user3 = new Users("003", "user3", "3003");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        int result = findByID(list, "003");
        System.out.println(result);
        boolean contain = contain(list,"004");
        System.out.println(contain);
    }

    public static int findByID (ArrayList<Users> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean contain (ArrayList<Users> list, String id) {
        return findByID(list, id) >= 0;
    }
}
