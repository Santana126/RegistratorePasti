package com.example.registratorepasti.control.graphic;

import com.example.registratorepasti.view.MealRegisterPageView;
import com.example.registratorepasti.view.cli.MealRegisterPageViewCLI;
import com.example.registratorepasti.view.desktop.MealRegisterPageViewDesktop;

import java.time.LocalDate;
import java.util.List;

public class MealRegisterGUIController {

    private MealRegisterPageView mealRegisterPageView;
    private final String uiType;

    private String mealType;

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public MealRegisterGUIController(String uiType) {
        this.uiType = uiType;
    }
    public void showPage(){
        //MealRegisterPageView mealRegisterPageView;
        if (uiType.equals("CLI")){
            mealRegisterPageView = new MealRegisterPageViewCLI();
        }else {
            mealRegisterPageView = new MealRegisterPageViewDesktop();
        }
        mealRegisterPageView.render();

    }

    public String  chooseMeal() {
        return mealRegisterPageView.chooseMealType();
    }

    public LocalDate chooseDate() {
        return mealRegisterPageView.chooseMealDate();
    }

    public List<float> selectMacros() {
        List<float> macros = null;
        macros.add(mealRegisterPageView.insertCarbs());
        macros.add(mealRegisterPageView.insrtFat());
        macros.add(mealRegisterPageView.insertProtein());
        return macros;
    }
}