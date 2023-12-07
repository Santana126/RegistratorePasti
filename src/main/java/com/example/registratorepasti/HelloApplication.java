package com.example.registratorepasti;

import com.example.registratorepasti.control.InitAppController;
import com.example.registratorepasti.control.logic.MealRegisterLogicController;
import javafx.application.Application;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        InitAppController initAppController = new InitAppController();

        MealRegisterLogicController mealRegisterLogicController = new MealRegisterLogicController();

        mealRegisterLogicController.initClass(initAppController.chooseGUI());
        mealRegisterLogicController.startApp();
    }

    public static void main(String[] args) {
        launch();
    }

}