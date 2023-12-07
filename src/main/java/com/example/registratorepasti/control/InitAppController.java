package com.example.registratorepasti.control;

import java.util.Scanner;

public class InitAppController {

    public String chooseGUI() {
        int uiTypeInt = 0;
        String uiType = null;
        Scanner scanner = new Scanner(System.in);
        while(uiTypeInt == 0){
            System.out.println("Scegli GUI:\n1) CLI\n2)Desktop");
            uiTypeInt = Integer.parseInt(scanner.nextLine());
            if (uiTypeInt == 1) {
                uiType = "CLI";
            }else if(uiTypeInt == 2){
                uiType = "Desktop";
            }else {
                System.out.println("Scegli un opzione valida");
            }
        }
        return uiType;
    }

}
