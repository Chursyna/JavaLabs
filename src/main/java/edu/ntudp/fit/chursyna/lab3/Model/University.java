package edu.ntudp.fit.chursyna.lab3.Model;
import java.util.ArrayList;
public class University {
    private String title;
    private Human head;
    private ArrayList<Faculity> facultyArrayList;

    public University(String title, Human head, ArrayList<Faculity> facultyArrayList) {
        this.title = title;
        this.head = head;
        this.facultyArrayList = facultyArrayList;
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
        facultyArrayList.add(faculity);
    }

    public void showFaculties() {
        System.out.println("Факультети університету " + getTitle());
        for (Faculity faculity : facultyArrayList) {
            System.out.println(faculity.getTitle());
        }
    }
}
