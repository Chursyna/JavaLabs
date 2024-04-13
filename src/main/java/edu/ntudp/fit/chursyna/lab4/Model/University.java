package edu.ntudp.fit.chursyna.lab4.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.ArrayList;
import java.util.Objects;

public class University {
    private String title;
    private Human head;
    @JsonManagedReference
    private ArrayList<Faculity> faculityArrayList;

    public University(String title, Human head, ArrayList<Faculity> faculityArrayList) {
        this.title = title;
        this.head = head;
        this.faculityArrayList = faculityArrayList;
    }
    public University() {
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
    public void addFaculity(Faculity faculity) {
        faculityArrayList.add(faculity);
    }

    public void showFaculties() {
        System.out.println("Факультети університету " + getTitle());
        for (Faculity faculity : faculityArrayList) {
            System.out.println(faculity.getTitle());
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        University that = (University) object;
        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
