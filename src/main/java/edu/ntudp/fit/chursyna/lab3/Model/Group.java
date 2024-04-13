package edu.ntudp.fit.chursyna.lab3.Model;

import java.util.ArrayList;
public class Group {
    private String title;
    private Human head;
    private ArrayList<Student> studentArrayList;

    public Group(String title, Human head, ArrayList<Student> studentArrayList) {
        this.title = title;
        this.head = head;
        this.studentArrayList = studentArrayList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }
    public void addStudent(Student student) {
        studentArrayList.add(student);
    }
    public void showStudents() {
        System.out.println("Студенти групи " + getTitle());
        for (Student student : studentArrayList) {
            System.out.println(student.getSurname() + student.getName() + student.getPatronymic());
        }
    }
}
