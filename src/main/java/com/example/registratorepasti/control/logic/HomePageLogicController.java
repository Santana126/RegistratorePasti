package com.example.registratorepasti.control.logic;

import com.example.registratorepasti.control.graphic.HomePageGUIController;
import com.example.registratorepasti.utils.Printer;

public class HomePageLogicController {

    private final String uiType;

    public HomePageLogicController(String uiType) {
        this.uiType = uiType;
    }

    public void operation() {

        HomePageGUIController homePageGUIController = new HomePageGUIController(this.uiType);
        homePageGUIController.showMenu();
        int operation = homePageGUIController.getOpNumber();

        Printer printer = new Printer();
        switch (operation) {
            case 1 -> {
                MealPageLogicController mealPageLogicController = new MealPageLogicController(this.uiType);
                mealPageLogicController.showMealPage();
            }
            case 2 -> printer.printMessage("Work on it");
            case 3 -> printer.printMessage("Work on it2");
            default -> printer.printMessage("DEH");
        }
    }
}
