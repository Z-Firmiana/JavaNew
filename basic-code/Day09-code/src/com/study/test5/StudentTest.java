package com.study.test5;

public class StudentTest {
    public static void main(String[] args) {
        Student[] stuarr = new Student[3];
        Student stu1 = new Student(202401, "张三", 18);
        Student stu2 = new Student(202402, "李四", 19);
        Student stu3 = new Student(202403, "六五", 20);
        stuarr[0] = stu1;
        stuarr[1] = stu2;
        stuarr[2] = stu3;

//        Student stu4 = new Student(202404, "王物", 22);
//        boolean contain = contain(stuarr, stu4.getId());
//        if (contain) {
//            System.out.println("当前id重复！");
//        } else {
//            int count = getCount(stuarr);
//            if (count == stuarr.length) {
//                Student[] newArr = creatNewArr(stuarr);
//                newArr[count] = stu4;
//                printArr(newArr);
//            } else {
//                stuarr[count] = stu4;
//                printArr(stuarr);
//            }
//        }

        int index = findIndex(stuarr, 202402);
        if (index >= 0){
            int age = stuarr[index].getAge() + 1;
            stuarr[index].setAge(age);
            int newAge = stuarr[index].getAge();
            System.out.println(newAge);
        } else {
            System.out.println("当前id不存在，删除失败！");
        }

    }

    public static boolean contain(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                int stuid = stu.getId();
                if (stuid == id) {
                    return true;
                }
            }

        }
        return false;
    }

    public static int getCount(Student[] stu) {
        int count = 0;
        for (int i = 0; i < stu.length; i++) {
            if (stu[i] != null) {
                count++;
            }
        }
        return count;
    }

    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < newArr.length - 1; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId() + "，" + stu.getName() + "，" + stu.getAge());
            }
        }
    }

    public static int findIndex(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                if (stu.getId() == id) {
                    return i;
                }
            }
        }
        return -1;
    }
}
