package edu.ntudp.fit.chursyna.lab4.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Objects;

public class Student extends Human {
    @JsonBackReference
    private Group group;
    public Student(String name, String surname, String patronymic, Sex sex, Group group) {
        super(name, surname, patronymic, sex);
        this.group = group;
    }

    public Student() {
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

}
