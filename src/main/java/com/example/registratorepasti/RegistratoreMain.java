package com.example.registratorepasti;

import com.example.registratorepasti.control.InitAppController;
import com.example.registratorepasti.control.logic.HomePageLogicController;
import javafx.application.Application;
import javafx.stage.Stage;

public class RegistratoreMain extends Application {
    @Override
    public void start(Stage stage) {

        InitAppController initAppController = new InitAppController();

        HomePageLogicController homePageLogicController = new HomePageLogicController(initAppController.chooseGUI());
        while (true) homePageLogicController.operation();
    }

    public static void main(String[] args) {
        launch();
    }

}