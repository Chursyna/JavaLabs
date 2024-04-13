package edu.ntudp.fit.chursyna.lab3.Model;

public class Student extends Human{
    private Group group;
    public Student(String name, String surname, String patronymic, Sex sex, Group group) {
        super(name, surname, patronymic, sex);
        this.group = group;
    }
    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
