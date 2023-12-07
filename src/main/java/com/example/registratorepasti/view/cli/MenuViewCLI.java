package com.example.registratorepasti.view.cli;

import com.example.registratorepasti.view.MenuView;

import java.util.Scanner;

public class MenuViewCLI implements MenuView {

    @Override
    public int askOperation() {
        render();
        Scanner scanner = new Scanner(System.in);
        int op = Integer.parseInt(scanner.nextLine());
        scanner.close();
        return op;
    }

    @Override
    public void render() {
            System.out.println("Operazioni disponibili:\n1)Salva Pasto\n2)Saluta\n3)Caga nel puzzo\n4)DEH\n");
    }
}
