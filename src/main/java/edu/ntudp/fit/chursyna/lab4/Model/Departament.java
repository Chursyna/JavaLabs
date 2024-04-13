package edu.ntudp.fit.chursyna.lab4.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.ArrayList;
import java.util.Objects;

public class Departament {
    private String title;
    private Human head;
    @JsonManagedReference
    private ArrayList<Group> groupArrayList;
    @JsonBackReference
    private Faculity faculity;

    public Departament(String title, Human head, ArrayList<Group> groupArrayList, Faculity faculity) {
        this.title = title;
        this.head = head;
        this.groupArrayList = groupArrayList;
        this.faculity = faculity;
    }

    public Departament() {
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
    public void addGroup(Group group) {
        groupArrayList.add(group);
    }

    public void showGroups() {
        System.out.println("Групи кафедри " + getTitle());
        for (Group group : groupArrayList) {
            System.out.println(group.getTitle());
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Departament that = (Departament) object;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
