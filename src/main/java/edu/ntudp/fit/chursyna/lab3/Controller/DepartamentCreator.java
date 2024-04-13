package edu.ntudp.fit.chursyna.lab3.Controller;

import edu.ntudp.fit.chursyna.lab3.Model.*;
import java.util.ArrayList;

public class DepartamentCreator {
    public Departament createDepartament(String title, Human head, ArrayList<Group> groupArrayList) {
        Departament department = new Departament(title, head, groupArrayList);
        return department;
    }
}
