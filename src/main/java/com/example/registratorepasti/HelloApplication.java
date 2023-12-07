package com.example.registratorepasti;

import com.example.registratorepasti.control.InitAppController;
import com.example.registratorepasti.control.logic.MealRegisterLogicController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        String uiType = null;

        InitAppController initAppController = new InitAppController();
        while (uiType == null){
            uiType = initAppController.chooseGUI();
        }

        MealRegisterLogicController mealRegisterLogicController = new MealRegisterLogicController();
        mealRegisterLogicController.initClass(uiType);
        mealRegisterLogicController.startApp();
    }

    /*
    public static void main(String[] args) {
        launch();
    }

     */
}