package com.test.str.test01.class06;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Classname ShowComparator
 * @Description TODO
 * @Date 2021/7/7 12:44
 * @Created by yemingjie
 */
public class ShowComparator {

    public static class Student {
        public String name;
        public int id;
        public int age;

        public Student(String name, int id, int age) {
            this.name = name;
            this.age = age;
            this.id = id;
        }

    }


    public static class IdCompartor implements Comparator<Student> {


        /**
         * 如果返回负数， 认为第一个参数排前面
         * 如果返回正数， 认为第二个参数排前面
         * 如果返回0，认为谁排前面无所谓
         * @param o1
         * @param o2
         * @return
         */
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.id < o2.id) {
                return -1;
            } else if (o1.id > o2.id) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static void printStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + "," + students[i].id + "," + students[i].age);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {8, 1, 4, 1, 6, 8, 4, 1, 5, 8, 2, 3, 0};
        printArray(arr);
        Arrays.sort(arr);
        printArray(arr);
        System.out.println("================");
        Student s1 = new Student("张三", 5, 27);
        Student s2 = new Student("李四", 1, 17);
        Student s3 = new Student("王五", 4, 57);
        Student s4 = new Student("赵六", 2, 17);
        Student s5 = new Student("阿七", 3, 237);
        Student[] students = {s1, s2, s3, s4, s5};
        Arrays.sort(students, new IdCompartor());
        printStudents(students);
    }


}
