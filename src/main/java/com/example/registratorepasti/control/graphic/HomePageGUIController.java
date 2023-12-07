package com.example.registratorepasti.control.graphic;

import com.example.registratorepasti.view.MenuView;
import com.example.registratorepasti.view.cli.MenuViewCLI;
import com.example.registratorepasti.view.desktop.MenuViewDesktop;

import java.util.Objects;

public class HomePageGUIController {

    private int opNumber;
    private final String uiType;

    public int getOpNumber() {
        return opNumber;
    }

    public void setOpNumber(int opNumber) {
        this.opNumber = opNumber;
    }

    public HomePageGUIController(String uiType) {
        this.uiType = uiType;
    }

    public void showMenu() {

        MenuView menuView;
        if (Objects.equals(this.uiType, "CLI")){
            menuView = new MenuViewCLI();
        }else {
            menuView = new MenuViewDesktop();
        }

        menuView.askOperation();
        setOpNumber(menuView.getOpNumber());
    }
}
