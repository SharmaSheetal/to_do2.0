package com.example.todo_list;

import android.graphics.Bitmap;
import android.net.Uri;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Model {

    private String task, description, id, date,image;
    public Model() {
    }

    public Model(String task, String description, String id, String date, String image) {
        this.task = task;
        this.description = description;
        this.id = id;
        this.date = date;
        this.image=image;
    }
    public String getImage(){
        return image;
    }
    public void setImage(){
        this.image=image;
    }
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
//        Date c = Calendar.getInstance().getTime();
//        SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault());
//        String date = df.format(c);
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}