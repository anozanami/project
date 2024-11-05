package com.example.qquimz;

public class HistoryItem {
    public String date;
    public String name;
    public String content;
    public String result;
    public String category;

    public HistoryItem(String date, String name, String content, String result, String category) {
        this.date = date;
        this.name = name;
        this.content = content;
        this.result = result;
        this.category = category;
    }
}
