package com.example.registratorepasti.view;

import java.time.LocalDate;

public interface MealRegisterPageView {

    void render();

    String chooseMealType();


    LocalDate chooseMealDate();

    float insertCarbs();

    float insrtFat();

    float insertProtein();
}
