package edu.ntudp.fit.chursyna.lab4.Controller;
import edu.ntudp.fit.chursyna.lab4.Model.*;
import java.util.ArrayList;

public class GroupCreator {
    public Group createGroup (String title, Human head, ArrayList<Student> studentArrayList, Departament departament){
        Group group = new Group(title, head, studentArrayList, departament);
        return group;
    }
}
