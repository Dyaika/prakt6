package com.company;

public class Student {
    private static int g_id = 0;
    private int id;
    private double average_mark;
    private String name;

    public Student() {
        this.name = "HumanBeing-" + g_id;
        id = g_id;
        average_mark = Math.random() * 3 + 2;
        g_id++;
    }
    /*public Student(Student st) {
        name = st.name;
        id = st.id;
        average_mark = st.average_mark;
    }
    public void setStudent(Student st) {
        name = st.name;
        id = st.id;
        average_mark = st.average_mark;
    }*/
    public double getAverage_mark() {
        return average_mark;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " is a student with ID=" + id + " and average mark " + average_mark;
    }
}
