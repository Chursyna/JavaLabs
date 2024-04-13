package edu.ntudp.fit.chursyna.lab3.Controller;

import edu.ntudp.fit.chursyna.lab3.Model.*;
import java.util.ArrayList;
public class UniversityCreator {
    public University createUniversity (String title, Human head, ArrayList<Faculity> facultyArrayList) {
        University university = new University(title, head, facultyArrayList);
        return university;
    }
}
