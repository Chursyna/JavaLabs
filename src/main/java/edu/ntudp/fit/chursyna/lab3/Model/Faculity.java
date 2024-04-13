package edu.ntudp.fit.chursyna.lab3.Model;

import java.util.ArrayList;
public class Faculity {
    private String title;
    private Human head;
    private ArrayList<Departament> departmentArrayList;

    public Faculity(String title, Human head, ArrayList<Departament> departmentArrayList) {
        this.title = title;
        this.head = head;
        this.departmentArrayList = departmentArrayList;
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
    public void addDepartment(Departament department) {
        departmentArrayList.add(department);
    }
    public void showDepartments() {
        System.out.println("Кафедри факультету " + getTitle());
        for (Departament department : departmentArrayList) {
            System.out.println(department.getTitle());
        }
    }
}
