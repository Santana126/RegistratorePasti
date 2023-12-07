package com.example.registratorepasti.view.cli;

import com.example.registratorepasti.utils.Printer;
import com.example.registratorepasti.view.MealPageView;

public class MealPageViewCLI implements MealPageView {
    @Override
    public void render() {
        Printer printer = new Printer();
        printer.printMessage("Menù di inserimento Pasto");
    }
}
