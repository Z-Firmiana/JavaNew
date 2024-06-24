package com.javastudy.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {

    }

    public static int getMaxAge(ArrayList<Student> list) {
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i).getAge()) {
                max = list.get(i).getAge();
            }
        }
        return max;
    }
}
