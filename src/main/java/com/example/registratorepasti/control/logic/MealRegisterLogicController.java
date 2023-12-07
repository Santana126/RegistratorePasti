package com.example.registratorepasti.control.logic;

public class MealRegisterLogicController {

    private String UIType;

    public void initClass(String uiType){
        this.UIType = uiType;
    }

    public void startApp(){
        HomePageLogicController homePageLogicController = new HomePageLogicController(this.UIType);
        homePageLogicController.operation();



    }


}
