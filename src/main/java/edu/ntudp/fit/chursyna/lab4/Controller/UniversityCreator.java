package edu.ntudp.fit.chursyna.lab4.Controller;
import edu.ntudp.fit.chursyna.lab4.Model.*;
import java.util.ArrayList;
public class UniversityCreator {
    public University createUniversity (String title, Human head, ArrayList<Faculity> faculityArrayList) {
        University university = new University(title, head, faculityArrayList);
        return university;
    }
}