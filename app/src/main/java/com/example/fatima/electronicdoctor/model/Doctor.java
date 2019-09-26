package com.example.fatima.electronicdoctor.model;

public class Doctor {
    private Integer id;
    private String userName;
    private String password;
    private String fullName;
    private String email;
    private String profilePic;
    private String speciality; //التخصص

    public Doctor(Integer id, String userName, String password, String fullName, String email, String speciality){
        this.id=id;
        this.userName=userName;
        this.password=password;
        this.fullName=fullName;
        this.email=email;
        this.speciality=speciality;
    }

    public Doctor(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
