package edu.ntudp.fit.chursyna.lab3.Model;

import java.util.ArrayList;
public class Departament {
    private String title;
    private Human head;
    private ArrayList<Group> groupArrayList;

    public Departament(String title, Human head, ArrayList<Group> groupArrayList) {
        this.title = title;
        this.head = head;
        this.groupArrayList = groupArrayList;
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
}
