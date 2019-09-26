package com.example.fatima.electronicdoctor.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class utill {

    public String calculateDateTime(){
        SimpleDateFormat s = new SimpleDateFormat("ddMMyyyyhhmmss");
        return s.format(new Date());
    }

    private String getAge(int year, int month, int day){
        Calendar dob = Calendar.getInstance();
        Calendar today = Calendar.getInstance();

        dob.set(year, month, day);

        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

        if (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)){
            age--;
        }

        Integer ageInt = new Integer(age);
        String ageS = ageInt.toString();

        return ageS;
    }



}
