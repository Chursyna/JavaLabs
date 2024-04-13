package edu.ntudp.fit.chursyna.lab4.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.ArrayList;
import java.util.Objects;

public class Faculity {
    private String title;
    private Human head;
    @JsonManagedReference
    private ArrayList<Departament> departamentArrayList;
    @JsonBackReference
    private University university;

    public Faculity(String title, Human head, ArrayList<Departament> departamentArrayList, University university) {
        this.title = title;
        this.head = head;
        this.departamentArrayList = departamentArrayList;
        this.university = university;
    }

    public Faculity() {
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
    public void addDepartament(Departament departament) {
        departamentArrayList.add(departament);
    }
    public void showDepartments() {
        System.out.println("Кафедри факультету " + getTitle());
        for (Departament departament : departamentArrayList) {
            System.out.println(departament.getTitle());
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Faculity faculity = (Faculity) object;
        return Objects.equals(title, faculity.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
