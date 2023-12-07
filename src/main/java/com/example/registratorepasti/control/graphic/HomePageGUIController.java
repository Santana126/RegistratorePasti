package com.example.registratorepasti.control.graphic;

import com.example.registratorepasti.view.MenuView;
import com.example.registratorepasti.view.cli.MenuViewCLI;
import com.example.registratorepasti.view.desktop.MenuViewDesktop;

import java.util.Objects;

public class HomePageGUIController {

    private final String uiType;
    private MenuView menuView;

    public HomePageGUIController(String uiType) {
        this.uiType = uiType;
    }

    public int showMenu() {

        if (Objects.equals(this.uiType, "CLI")){
            menuView = new MenuViewCLI();
        }else {
            menuView = new MenuViewDesktop();
        }

        int operation = menuView.askOperation();

        return operation;
    }
}
