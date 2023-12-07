package com.example.registratorepasti.model;

import java.time.LocalDate;

public class Meal {
    private final LocalDate date;

    private final String type;

    public Meal(LocalDate date,String mealType){
        this.date = date;
        this.type = mealType;
    }

    private Integer calories;

    private float carbs = -1;

    private float fat = -1;

    private float protein = -1;


    public void calcolateCalories(){
        if(carbs != -1 && fat != -1 && protein != -1){
            this.calories = (int) ((this.carbs*4)+(this.fat*9)+(this.protein*4));
        }
    }


    public LocalDate getDate() {
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
    public float getCarbs(){
        return carbs;
    }
    public void setCarbs(float carbs) {
        this.carbs = carbs;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public float getProtein() {
        return protein;
    }

    public void setProtein(float protein) {
        this.protein = protein;
    }
}
