package com.example.registratorepasti.control.logic;

import com.example.registratorepasti.control.graphic.HomePageGUIController;

public class HomePageLogicController {

    private final String uiType;

    public HomePageLogicController(String uiType) {
        this.uiType = uiType;
    }

    public void operation() {

        HomePageGUIController homePageGUIController = new HomePageGUIController(this.uiType);
        homePageGUIController.showMenu();
        int operation = homePageGUIController.getOpNumber();

        if (operation == 1) {
            MealRegisterLogicController mealRegisterLogicController = new MealRegisterLogicController(this.uiType);
            mealRegisterLogicController.startMealRegisterPage();
        } else {
            homePageGUIController.showNotImplemented();
        }
    }
}
