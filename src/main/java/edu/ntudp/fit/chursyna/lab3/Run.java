package edu.ntudp.fit.chursyna.lab3;

import edu.ntudp.fit.chursyna.lab3.Model.*;
import edu.ntudp.fit.chursyna.lab3.Controller.*;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        createTypicalUniversity();
    }

    public static void createTypicalUniversity() {
        UniversityCreator universityCreator = new UniversityCreator();
        Human universityHead = new Human("Олександр ", "Азюковський ", "Олександрович", Sex.MALE);
        University university = universityCreator.createUniversity("НТУ ДП", universityHead, new ArrayList<>());

        FaculityCreator faculityCreator = new FaculityCreator();
        Human faculityHead = new Human("Ірина ", "Удовік ", "Михайлівна", Sex.FEMALE);
        Faculity faculity = faculityCreator.createFaculti("ФІТ", faculityHead, new ArrayList<>());
        university.addFaculity(faculity);

        DepartamentCreator departamentCreator = new DepartamentCreator();
        Human departamentHead = new Human("Валерій ", "Корнієнко ", "Іванович", Sex.MALE);
        Departament departament = departamentCreator.createDepartament("БІТ", departamentHead, new ArrayList<>());
        faculity.addDepartment(departament);

        GroupCreator groupCreator = new GroupCreator();
        Human groupHead = new Human("Ілля ", "Олішевський ", "Генадійович", Sex.MALE);
        Group group = groupCreator.createGroup("125-20-1", groupHead, new ArrayList<>());
        departament.addGroup(group);

        StudentCreator studentCreator = new StudentCreator();
        Student student = studentCreator.createStudent("Марія ", "Чурсина ", "Кирилівна", Sex.FEMALE, group);
        group.addStudent(student);
        //------------------//
        //Виводимо результати дляя перевірки
        System.out.println("Університет - " + university.getTitle());
        System.out.println("Голова університету - " + universityHead.getSurname() + universityHead.getName() + universityHead.getPatronymic() + ", Стать - " + universityHead.getSex());
        System.out.println("Факультет - " + faculity.getTitle());
        System.out.println("Голова факультету - " + faculityHead.getSurname() + faculityHead.getName() + faculityHead.getPatronymic() + ", Стать - " + faculityHead.getSex());
        System.out.println("Кафедра - " + departament.getTitle());
        System.out.println("Голова кафедри - " + departamentHead.getSurname() + departamentHead.getName() + departamentHead.getPatronymic() + ", Стать - " + departamentHead.getSex());
        System.out.println("Група - " + group.getTitle());
        System.out.println("Голова групи - " + groupHead.getSurname() + groupHead.getName() + groupHead.getPatronymic() + ", Стать - " + groupHead.getSex());
        System.out.println("Студент - " + student.getSurname() + student.getName() + student.getPatronymic() + ", Стать - " + student.getSex());
        System.out.println();
        university.showFaculties();
        faculity.showDepartments();
        departament.showGroups();
        group.showStudents();

    }
}
