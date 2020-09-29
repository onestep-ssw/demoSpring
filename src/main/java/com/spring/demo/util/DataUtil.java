package com.spring.demo.util;

public class DataUtil {


    public DataUtil(int age, String name, int score, String clazz, String photo, String httpUrl) {
        this.age = age;
        this.name = name;
        this.score = score;
        this.clazz = clazz;
        this.photo = photo;
        this.httpUrl = httpUrl;
    }

    private int age;
    private String name;
    private int score;
    private String clazz;
    private String photo;
    private String httpUrl;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getHttpUrl() {
        return httpUrl;
    }

    public void setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
    }
}
