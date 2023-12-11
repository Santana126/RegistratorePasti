package com.example.registratorepasti.control.logic;

import com.example.registratorepasti.control.graphic.MealRegisterGUIController;
import com.example.registratorepasti.dao.MealDao;
import com.example.registratorepasti.model.Meal;

import java.util.Objects;

public class MealRegisterLogicController {


    private final String uiType;

    private Meal meal;

    public MealRegisterLogicController(String uiType) {
        this.uiType = uiType;
    }


    public void startMealRegisterPage() {

        MealRegisterGUIController mealRegisterGUIController = new MealRegisterGUIController(this.uiType);
        mealRegisterGUIController.showPage();

        String mealType = "Meal";
        while (Objects.equals(mealType, "Meal")){
            mealType = mealRegisterGUIController.chooseMeal();
        }
        createMeal(mealType,mealRegisterGUIController.chooseDate());

        mealRegisterGUIController.selectMacros(meal);

        mealConfirm(mealRegisterGUIController);
    }

    private void mealConfirm(MealRegisterGUIController mealRegisterGUIController) {
        mealRegisterGUIController.mealResume(meal);
        if(mealRegisterGUIController.askMealConfirm()){
            saveMeal(mealRegisterGUIController);
        }
    }

    private void saveMeal(MealRegisterGUIController mealRegisterGUIController) {
        MealDao mealDao = new MealDao();
        if(mealDao.saveMeal(meal)){
            mealRegisterGUIController.saveSuccess();
        }else {
            mealRegisterGUIController.saveFailed();
        }
    }

    public void createMeal(String mealType, String date){
        meal = new Meal(date,mealType);
    }





}
