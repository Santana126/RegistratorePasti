package com.example.registratorepasti.control.graphic;

import com.example.registratorepasti.view.MenuView;
import com.example.registratorepasti.view.Message;
import com.example.registratorepasti.view.cli.MenuViewCLI;
import com.example.registratorepasti.view.cli.MessageCLI;
import com.example.registratorepasti.view.desktop.MenuViewDesktop;
import com.example.registratorepasti.view.desktop.MessageDesktop;

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

    public void showNotImplemented(){
        Message message;
        if (Objects.equals(this.uiType, "CLI")){
            message = new MessageCLI();
        }else{
            message = new MessageDesktop();
        }

        message.notImplementedYet();
    }
}
