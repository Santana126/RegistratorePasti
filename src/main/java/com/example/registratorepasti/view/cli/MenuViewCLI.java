package com.example.registratorepasti.view.cli;

import com.example.registratorepasti.utils.Printer;
import com.example.registratorepasti.view.MenuView;

import java.util.Scanner;

public class MenuViewCLI implements MenuView {

    private int opNumber;

    public int getOpNumber() {
        return opNumber;
    }

    public void setOpNumber(int opNumber) {
        this.opNumber = opNumber;
    }

    @Override
    public void askOperation() {
        render();
        Scanner scanner = new Scanner(System.in);
        setOpNumber(Integer.parseInt(scanner.nextLine()));
    }

    @Override
    public void render() {
        Printer printer = new Printer();
        printer.printMessage("Operazioni disponibili:\n1)Salva Pasto\n2)Operazione 2\n3)Operazione 3\n4)Operazione 4\n");
    }
}
