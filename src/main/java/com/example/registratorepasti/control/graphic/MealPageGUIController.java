package com.example.registratorepasti.control.graphic;

import com.example.registratorepasti.view.MealPageView;
import com.example.registratorepasti.view.MenuView;
import com.example.registratorepasti.view.cli.MealPageViewCLI;
import com.example.registratorepasti.view.desktop.MealPageViewDesktop;

public class MealPageGUIController {
    private final String uiType;

    private MealPageView mealPageView;

    public MealPageGUIController(String uiType) {
        this.uiType = uiType;
    }

    public void showPage(){
        if (uiType.equals("CLI")){
            mealPageView = new MealPageViewCLI();
        }else {
            mealPageView = new MealPageViewDesktop();
        }
        mealPageView.render();
    }
}
