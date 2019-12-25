package com.example.fatima.electronicdoctor.model;


import android.content.Context;

import com.example.fatima.electronicdoctor.database.DatabaseAdapter;
import com.example.fatima.electronicdoctor.database.Table;

public class Post {
    private Integer id;
    private String title;
    private String description;
    private String image;
    private String link;
    private Integer category_id;
    private String user_id;
    private Integer useful;
    private Integer unclear;
    private String dateTime;
    private Integer viewCount;


    public Post(){}

    public Post(Integer id, String title, String description,String image, String link, Integer category_id, String user_id, String dateTime){
        this.id=id;
        this.title=title;
        this.description=description;
        this.image=image;
        this.link=link;
        this.category_id=category_id;
        this.user_id=user_id;
        this.dateTime=dateTime; //use calculateDateTime from Utill class to get the date
    }

    //constructor without link or image incase they're not available
    public Post(Integer id, String title, String description, Integer category_id, String user_id, String dateTime){
        this.id=id;
        this.title=title;
        this.description=description;
        this.category_id=category_id;
        this.user_id=user_id;
        this.dateTime=dateTime; //use calculateDateTime from Utill class to get the date
    }


    public Table getAllPosts(Context context){

        Table table;
        String sql ="SELECT * FROM posts";
        DatabaseAdapter db = new DatabaseAdapter(context) ;
        db.open();
        table = db.select(sql);
        db.close();
        return table;
    }

    public Table getAllPostsBy(Context context, String condition){

        Table table;
        String sql ="SELECT * FROM book WHERE"+condition;
        DatabaseAdapter db = new DatabaseAdapter(context) ;
        db.open();
        table = db.select(sql);
        db.close();
        return table;
    }



    public void rate(int value){
        switch (value) {

            case 1: //useful
                this.useful++;

            case 2: //unclear
               this.unclear++;

            case 3: //cancel useful rate
                this.useful--;

            case 4: //cancel unclear rate
                this.unclear--;

        }
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Integer getUseful() {
        return useful;
    }

    public void setUseful(Integer useful) {
        this.useful = useful;
    }

    public Integer getUnclear() {
        return unclear;
    }

    public void setUnclear(Integer unclear) {
        this.unclear = unclear;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

}
