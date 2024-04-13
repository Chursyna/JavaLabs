package edu.ntudp.fit.chursyna.lab4.Model;

import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private String patronymic;
    private Sex sex;

    public Human(String name, String surname, String patronymic, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.sex = sex;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Human human = (Human) object;
        return Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(patronymic, human.patronymic) && sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, sex);
    }
}
