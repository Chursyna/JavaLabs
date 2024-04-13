package edu.ntudp.fit.chursyna.lab5;

import javax.xml.crypto.Data;
import java.util.Date;

public class Students {
    private int ID;
    private String surname;
    private String name;
    private String patronymic;
    private Date dataBirth;
    private String numberOfTheRecordBook;

    public Students(int ID, String surname, String name, String patronymic, Date dataBirth, String numberOfTheRecordBook) {
        this.ID = ID;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dataBirth = dataBirth;
        this.numberOfTheRecordBook = numberOfTheRecordBook;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public Date getDataBirth() {
        return dataBirth;
    }

    public void setDataBirth(Date dataBirth) {
        this.dataBirth = dataBirth;
    }

    public String getNumberOfTheRecordBook() {
        return numberOfTheRecordBook;
    }

    public void setNumberOfTheRecordBook(String numberOfTheRecordBook) {
        this.numberOfTheRecordBook = numberOfTheRecordBook;
    }

    @Override
    public String toString() {
        return ID + ") ПІБ: " + surname + " " + name + " " + patronymic + ". День народження = " + dataBirth + ". Номер залікової книжки = " + numberOfTheRecordBook;
    }

}
