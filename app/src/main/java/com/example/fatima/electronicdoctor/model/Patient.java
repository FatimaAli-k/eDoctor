package com.example.fatima.electronicdoctor.model;

public class Patient {
    private String id;
    private String userName;
    private String fullName;
    private Integer dateOfBirth; //yyyymmdd use getAge from utill class to get age
    private boolean gender; // T male, F female

    public Patient(String userName, String fullName, Integer dateOfBirth, boolean gender){
        this.userName=userName;
        this.fullName=fullName;
        this.dateOfBirth=dateOfBirth;
        this.gender=gender;
    }
    public Patient(){}

    public String getId() {
        return id;
    }

    public void setId(String userName, String fullName,Integer dateOfBirth){ //create patient id
        long time= System.currentTimeMillis();
        String id= userName+fullName+dateOfBirth.toString()+time;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Integer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
