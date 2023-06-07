package com.seroja.main.entities;

public class Meal {

    private String coldAppetizer;
    private String hotAppetizer;
    private String firstCourse;
    private String mainCourse;
    private String dessert;
    private String drink;

    public Meal() {
    }

    public Meal(String coldAppetizer, String hotAppetizer, String firstCourse, String mainCourse, String dessert, String drink) {
        this.coldAppetizer = coldAppetizer;
        this.hotAppetizer = hotAppetizer;
        this.firstCourse = firstCourse;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
        this.drink = drink;
    }

    public String getColdAppetizer() {
        return coldAppetizer;
    }

    public void setColdAppetizer(String coldAppetizer) {
        this.coldAppetizer = coldAppetizer;
    }

    public String getHotAppetizer() {
        return hotAppetizer;
    }

    public void setHotAppetizer(String hotAppetizer) {
        this.hotAppetizer = hotAppetizer;
    }

    public String getFirstCourse() {
        return firstCourse;
    }

    public void setFirstCourse(String firstCourse) {
        this.firstCourse = firstCourse;
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
