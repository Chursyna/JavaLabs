package edu.ntudp.fit.chursyna.lab3.Controller;

import edu.ntudp.fit.chursyna.lab3.Model.*;
import java.util.ArrayList;

public class GroupCreator {
    public Group createGroup (String title, Human head, ArrayList<Student> studentArrayList){
        Group group = new Group(title, head, studentArrayList);
        return group;
    }
}
