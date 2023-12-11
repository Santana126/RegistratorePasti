package com.example.registratorepasti.view;

import com.example.registratorepasti.model.Meal;

public interface MealRegisterPageView {

    void render();

    String chooseMealType();


    String chooseMealDate();

    float insertCarbs();

    float insertFat();

    float insertProtein();

    void showResume(Meal meal);

    boolean askConfirm();

    Integer insertCalories();

    void showSaveSuccess();

    void showSaveFailed();
}
