package com.example.registratorepasti.control.graphic;

import com.example.registratorepasti.model.Meal;
import com.example.registratorepasti.view.MealRegisterPageView;
import com.example.registratorepasti.view.cli.MealRegisterPageViewCLI;
import com.example.registratorepasti.view.desktop.MealRegisterPageViewDesktop;

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
        if (uiType.equals("CLI")){
            mealRegisterPageView = new MealRegisterPageViewCLI();
        }else {
            mealRegisterPageView = new MealRegisterPageViewDesktop();
        }
        mealRegisterPageView.render();
    }

    public String  chooseMeal() {

        String choice = "";
        while (choice.equals("")){
            choice = mealRegisterPageView.chooseMealType();
        }
        return choice;
    }

    public String chooseDate() {
        return mealRegisterPageView.chooseMealDate();
    }

    public void selectMacros(Meal meal) {
        meal.setCalories(mealRegisterPageView.insertCalories());
        meal.setCarbs(mealRegisterPageView.insertCarbs());
        meal.setProtein(mealRegisterPageView.insertProtein());
        meal.setFat(mealRegisterPageView.insertFat());

    }

    public void mealResume(Meal meal) {
        mealRegisterPageView.showResume(meal);
    }

    public boolean askMealConfirm() {
        return mealRegisterPageView.askConfirm();
    }

    public void saveSuccess() {
        mealRegisterPageView.showSaveSuccess();
    }

    public void saveFailed() {
        mealRegisterPageView.showSaveFailed();
    }
}