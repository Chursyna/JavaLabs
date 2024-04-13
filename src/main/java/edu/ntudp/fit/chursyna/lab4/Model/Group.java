package edu.ntudp.fit.chursyna.lab4.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.ArrayList;
import java.util.Objects;

public class Group {
    private String title;
    private Human head;
    @JsonManagedReference
    private ArrayList<Student> studentArrayList;
    @JsonBackReference
    private Departament departament;

    public Group(String title, Human head, ArrayList<Student> studentArrayList, Departament departament) {
        this.title = title;
        this.head = head;
        this.studentArrayList = studentArrayList;
        this.departament = departament;
    }

    public Group() {
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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Group group = (Group) object;
        return Objects.equals(title, group.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
