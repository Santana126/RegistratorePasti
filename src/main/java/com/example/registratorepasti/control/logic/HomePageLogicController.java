package com.example.registratorepasti.control.logic;

import com.example.registratorepasti.control.graphic.HomePageGUIController;
import com.example.registratorepasti.view.MealPageView;

public class HomePageLogicController {

    private final String uiType;

    public HomePageLogicController(String uiType) {
        this.uiType = uiType;
    }

    public void operation() {

        HomePageGUIController homePageGUIController = new HomePageGUIController(this.uiType);
        int operation = homePageGUIController.showMenu();

        switch (operation) {
            case 1 -> {
                MealPageLogicController mealPageLogicController = new MealPageLogicController(this.uiType);
                mealPageLogicController.showMealPage();
            }
            case 2 -> System.out.println("Work on it");
            case 3 -> System.out.println("Work on it2");
            default -> System.out.println("Deh");
        }
    }
}
