package com.company;

public class TestStudent {
    public static void test(){
        int n = 20;
        Student [] iDNumber = new Student[n];
        for (int i = 0; i < n; i++) {
            iDNumber[i] = new Student();
        }
        sort(iDNumber);
        for (Student st:
                iDNumber) {
            System.out.println(st);
        }
    }
    private static void sort(Student[] students){
        int n = students.length;
        Student cur_student = students[0];
        for (int i = 1; i < n; i++){
            cur_student = students[i];
            int j = i - 1;
            while (j >= 0 && cur_student.getAverage_mark() < students[j].getAverage_mark()){
                students[j + 1] = students[j];
                j--;
            }
            students[j+1] = cur_student;
        }
    }
}
