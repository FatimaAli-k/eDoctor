package com.example.fatima.electronicdoctor.model;

public class Category {
    private Integer id;
    private String title;

    public Category(Integer id, String title){
        this.id=id;
        this.title=title;
    }

    public Category(){}

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


}
