package edu.ntudp.fit.chursyna.lab3.Controller;

import edu.ntudp.fit.chursyna.lab3.Model.*;
import java.util.ArrayList;

public class FaculityCreator {
    public Faculity createFaculti (String title, Human head, ArrayList<Departament> departmentArrayList) {
        Faculity faculty = new Faculity(title, head, departmentArrayList);
        return faculty;
    }
}
