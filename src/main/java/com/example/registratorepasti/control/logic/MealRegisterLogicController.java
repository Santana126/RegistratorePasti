package com.example.registratorepasti.control.logic;

import com.example.registratorepasti.control.graphic.MealRegisterGUIController;
import com.example.registratorepasti.model.Meal;
import java.time.LocalDate;
import java.util.List;

public class MealRegisterLogicController {


    private final String uiType;

    private Meal meal;

    public MealRegisterLogicController(String uiType) {
        this.uiType = uiType;
    }


    public void startMealRegisterPage() {

        MealRegisterGUIController mealRegisterGUIController = new MealRegisterGUIController(this.uiType);
        mealRegisterGUIController.showPage();
        createMeal(mealRegisterGUIController.chooseMeal(),mealRegisterGUIController.chooseDate());

        List<float> macros = mealRegisterGUIController.selectMacros();
        insertMacros(macros);
    }

    private void insertMacros(List<float> macros) {
        meal.setCarbs(macros.get(0));
        meal.setFat(macros.get(1));
        meal.setProtein(macros.get(2));
    }

    public void createMeal(String mealType, LocalDate date){
        meal = new Meal(date,mealType);
    }





}
