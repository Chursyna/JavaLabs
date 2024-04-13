package edu.ntudp.fit.chursyna.lab4;
import edu.ntudp.fit.chursyna.lab4.Controller.*;
import edu.ntudp.fit.chursyna.lab4.Model.*;

import java.util.ArrayList;

public class CreateOldUniversity {

    public static University createOldUniversity() {
        UniversityCreator universityCreator = new UniversityCreator();
        Human universityHead = new Human("Олександр ", "Азюковський ", "Олександрович", Sex.MALE);
        University oldUniversity = universityCreator.createUniversity("НТУ ДП", universityHead, new ArrayList<>());

        FaculityCreator faculityCreator = new FaculityCreator();
        Human faculityHead1 = new Human("Ірина ", "Удовік ", "Михайлівна", Sex.FEMALE);
        Faculity faculity1 = faculityCreator.createFaculity("ФІТ", faculityHead1, new ArrayList<>(), oldUniversity);
        Human faculityHead2 = new Human("Євгеній ", "Кошеленко ", "Валерійович", Sex.MALE);
        Faculity faculity2 = faculityCreator.createFaculity("ЕТФ", faculityHead2, new ArrayList<>(), oldUniversity);
        oldUniversity.addFaculity(faculity1);
        oldUniversity.addFaculity(faculity2);

        DepartamentCreator departamentCreator = new DepartamentCreator();
        Human departamentHead1 = new Human("Валерій ", "Корнієнко ", "Іванович", Sex.MALE);
        Departament departament1 = departamentCreator.createDepartament("БІТ", departamentHead1, new ArrayList<>(), faculity1);
        Human departamentHead2 = new Human("Володимир ", "Гнатушенко ", "Володимирович", Sex.MALE);
        Departament departament2 = departamentCreator.createDepartament("ІТКІ", departamentHead2, new ArrayList<>(), faculity1);
        Human departamentHead3 = new Human("Юрій ", "Папаїка ", "Анатолійович", Sex.MALE);
        Departament department3 = departamentCreator.createDepartament("ЕЕ", departamentHead3, new ArrayList<>(), faculity2);
        Human departamentHead4 = new Human("Андрій ", "Бубліков ", "Вікторович", Sex.MALE);
        Departament department4 = departamentCreator.createDepartament("КІВС", departamentHead4, new ArrayList<>(), faculity2);
        faculity1.addDepartament(departament1);
        faculity1.addDepartament(departament2);
        faculity2.addDepartament(department3);
        faculity2.addDepartament(department4);

        GroupCreator groupCreator = new GroupCreator();
        Human groupHead1 = new Human("Ілля ", "Олішевський ", "Генадійович", Sex.MALE);
        Group group1 = groupCreator.createGroup("125-20-1", groupHead1, new ArrayList<>(), departament1);
        Human groupHead2 = new Human("Вадим ", "Мєшков ", "Ігорович", Sex.MALE);
        Group group2 = groupCreator.createGroup("125-22-3", groupHead2, new ArrayList<>(), departament1);
        Human groupHead3 = new Human("Дмитро ", "Бешта ", "Олександрович", Sex.MALE);
        Group group3 = groupCreator.createGroup("123-21-1", groupHead3, new ArrayList<>(), departament2);
        Human groupHead4 = new Human("Тетяна ", "Булана ", "Михаліївна", Sex.FEMALE);
        Group group4 = groupCreator.createGroup("123-20-2", groupHead4, new ArrayList<>(), departament2);
        Human groupHead5 = new Human("Юрій ", "Степаненко ", "Вікторович", Sex.MALE);
        Group group5 = groupCreator.createGroup("141-21-1", groupHead5, new ArrayList<>(), department3);
        Human groupHead6 = new Human("Наталія ", "Рухлова ", "Юріївна", Sex.FEMALE);
        Group group6 = groupCreator.createGroup("141-23-2", groupHead6, new ArrayList<>(), department3);
        Human groupHead7 = new Human("Олег ", "Бойко ", "Олександрович", Sex.MALE);
        Group group7 = groupCreator.createGroup("174-20-1", groupHead7, new ArrayList<>(), department4);
        Human groupHead8 = new Human("Наталія ", "Глухова ", "Вікторівна", Sex.FEMALE);
        Group group8 = groupCreator.createGroup("175-23-3", groupHead8, new ArrayList<>(), department4);
        departament1.addGroup(group1);
        departament1.addGroup(group2);
        departament2.addGroup(group3);
        departament2.addGroup(group4);
        department3.addGroup(group5);
        department3.addGroup(group6);
        department4.addGroup(group7);
        department4.addGroup(group8);

        StudentCreator studentCreator = new StudentCreator();
        Student student1 = studentCreator.createStudent("Марія ", "Чурсина ", "Кирилівна", Sex.FEMALE, group1);
        Student student2 = studentCreator.createStudent("Віктор ", "Степаненко ", "Петрович", Sex.MALE, group1);
        Student student3 = studentCreator.createStudent("Вікторія ", "Петрова ", "Олександрівна", Sex.FEMALE, group2);
        Student student4 = studentCreator.createStudent("Олег ", "Кожух ", "Степанович", Sex.MALE, group2);
        Student student5 = studentCreator.createStudent("Іван ", "Соболь ", "Вікторович", Sex.MALE, group3);
        Student student6 = studentCreator.createStudent("Олена ", "Стежко ", "Петрівна", Sex.FEMALE, group3);
        Student student7 = studentCreator.createStudent("Андрій ", "Капка ", "Олегович", Sex.MALE, group4);
        Student student8 = studentCreator.createStudent("Ілля ", "Лизенко ", "Володимирович", Sex.MALE, group4);
        Student student9 = studentCreator.createStudent("Вадим ", "Чуб ", "Олександрович", Sex.MALE, group5);
        Student student10 = studentCreator.createStudent("Сергій ", "Павлій ", "В'ячеславович", Sex.MALE, group5);
        Student student11 = studentCreator.createStudent("Дмитро ", "Денисенко ", "Сергійович", Sex.MALE, group6);
        Student student12 = studentCreator.createStudent("Іван ", "Бойко ", "Дмитрович", Sex.MALE, group6);
        Student student13 = studentCreator.createStudent("Катерина ", "Карпенко ", "Дмитрівна", Sex.FEMALE, group7);
        Student student14 = studentCreator.createStudent("Діана ", "Славінська ", "Владиславівна", Sex.FEMALE, group7);
        Student student15 = studentCreator.createStudent("Владислав ", "Точний ", "Іванович", Sex.MALE, group8);
        Student student16 = studentCreator.createStudent("Сергій ", "Зибало ", "Андрійович", Sex.MALE, group8);
        group1.addStudent(student1);
        group1.addStudent(student2);
        group2.addStudent(student3);
        group2.addStudent(student4);
        group3.addStudent(student5);
        group3.addStudent(student6);
        group4.addStudent(student7);
        group4.addStudent(student8);
        group5.addStudent(student9);
        group5.addStudent(student10);
        group6.addStudent(student11);
        group6.addStudent(student12);
        group7.addStudent(student13);
        group7.addStudent(student14);
        group8.addStudent(student15);
        group8.addStudent(student16);

        return oldUniversity;
    }
}
