package com.example.registratorepasti.model;

import java.util.Date;

public class Meal {
    private Date date;

    private String type;

    private Integer calories;

    private Integer carbs;

    private Integer fat;

    private Integer protein;


    public void calcolateCalories(){
        if(carbs != null && fat != null && protein != null){
            this.calories = (this.carbs*4)+(this.fat*9)+(this.protein*4);
        }
    }


    public Date getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }
    public Integer getCarbs(){
        return carbs;
    }
    public void setCarbs(Integer carbs) {
        this.carbs = carbs;
    }

    public Integer getFat() {
        return fat;
    }

    public void setFat(Integer fat) {
        this.fat = fat;
    }

    public Integer getProtein() {
        return protein;
    }

    public void setProtein(Integer protein) {
        this.protein = protein;
    }
}
