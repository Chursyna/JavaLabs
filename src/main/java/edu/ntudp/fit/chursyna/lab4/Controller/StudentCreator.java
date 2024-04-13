package edu.ntudp.fit.chursyna.lab4.Controller;
import edu.ntudp.fit.chursyna.lab4.Model.*;

public class StudentCreator {
    public Student createStudent (String name, String surname, String patronymic, Sex sex, Group group){
        Student student = new Student(name, surname, patronymic, sex, group);
        return student;
    }
}
