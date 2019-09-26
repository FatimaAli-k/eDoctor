package com.example.fatima.electronicdoctor.model;

import android.content.Context;

import com.example.fatima.electronicdoctor.database.DatabaseAdapter;
import com.example.fatima.electronicdoctor.database.Table;

public class Question {
    private Integer id;
    private String content;
    private String answer;
    private boolean isPublic; //determined by the admin or doctor
    private boolean isPrivate; //determined by the patient
    private Integer category_id;
    private String dateTimePosted;
    private String dateTimeAnswered;
    private Integer doctor_id;

    public Question(){}

    public Question(Integer id, String content, boolean isPrivate, Integer category_id,Integer doctor_id, String dateTimePosted){
        this.id=id;
        this.content=content;
        this.isPrivate=isPrivate;
        this.category_id=category_id;
        this.doctor_id=doctor_id; //if the question is sent to a specific doctor
        this.dateTimePosted=dateTimePosted;
    }

    public void answerQuestion(Integer id, Integer doctor_id, String answer, boolean isPublic, String dateTimeAnswered){
        this.id=id;
        this.doctor_id=doctor_id;
        this.answer=answer;
        setPublic(isPublic); //to check if patient made it private or not
        this.dateTimeAnswered=dateTimeAnswered;

    }

    public Table getAllQuestions(Context context){

        Table table;
        String sql ="SELECT * FROM Questions";
        DatabaseAdapter db = new DatabaseAdapter(context) ;
        db.open();
        table = db.select(sql);
        db.close();
        return table;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
     if(isPrivate()==false)
         isPublic=false;
     else
        isPublic = aPublic;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getDateTimePosted() {
        return dateTimePosted;
    }

    public String getDateTimeAnswered() {
        return dateTimeAnswered;
    }

    public void setDateTimeAnswered(String dateTimeAnswered) {
        this.dateTimeAnswered = dateTimeAnswered;
    }

    public void setDateTimePosted(String dateTime) {
        this.dateTimePosted = dateTime;
    }

    public Integer getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(Integer doctor_id) {
        this.doctor_id = doctor_id;
    }
}
