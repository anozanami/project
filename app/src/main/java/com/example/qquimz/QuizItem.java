package com.example.qquimz;

public class QuizItem {
    public String date;
    public int imageResourceId;
    public String name;
    public String content;
    public String result;
    public String category;

    public QuizItem(String date, int imageResourceId, String name, String content, String result, String category) {
        this.date = date;
        this.imageResourceId = imageResourceId;
        this.name = name;
        this.content = content;
        this.result = result;
        this.category = category;
    }
}
