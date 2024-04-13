package edu.ntudp.fit.chursyna.lab4.Controller;
import edu.ntudp.fit.chursyna.lab4.Model.*;
import java.util.ArrayList;

public class FaculityCreator {
    public Faculity createFaculity (String title, Human head, ArrayList<Departament> departamentArrayList, University university) {
        Faculity faculity = new Faculity(title, head, departamentArrayList, university);
        return faculity;
    }
}
