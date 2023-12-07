package com.example.registratorepasti.control.logic;

import com.example.registratorepasti.control.graphic.MealPageGUIController;

public class MealPageLogicController {
    private final String uiType;

    public MealPageLogicController(String uiType) {
        this.uiType = uiType;
    }


    public void showMealPage() {

        MealPageGUIController mealPageGUIController = new MealPageGUIController(this.uiType);
        mealPageGUIController.showPage();
    }
}
