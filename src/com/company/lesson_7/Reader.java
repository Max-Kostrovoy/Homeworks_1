package com.company.lesson_7;

public class Reader {
    private String fullName;
    private int accountNumber;
    private String faculty;
    private int Phone;
    //private Birthdate birthdate;

    public Reader(String fullName, int accountNumber, String faculty, int phone) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.faculty = faculty;
        Phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    /*public Birthdate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Birthdate birthdate) {
        this.birthdate = birthdate;
    }*/

}
