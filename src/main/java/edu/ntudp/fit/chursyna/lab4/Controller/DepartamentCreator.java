package edu.ntudp.fit.chursyna.lab4.Controller;
import edu.ntudp.fit.chursyna.lab4.Model.*;

import java.util.ArrayList;

public class DepartamentCreator {
    public Departament createDepartament(String title, Human head, ArrayList<Group> groupArrayList, Faculity faculity) {
        Departament departament = new Departament(title, head, groupArrayList, faculity);
        return departament;
    }
}
