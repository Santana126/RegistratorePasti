package com.example.registratorepasti.view.cli;

import com.example.registratorepasti.utils.Printer;
import com.example.registratorepasti.view.MealRegisterPageView;

import java.time.LocalDate;
import java.util.Scanner;

public class MealRegisterPageViewCLI implements MealRegisterPageView {
    @Override
    public void render() {
        Printer printer = new Printer();
        printer.printMessage("Menù di inserimento Pasto");

    }

    @Override
    public String chooseMealType() {
        Printer printer = new Printer();
        printer.printMessage("Seleziona pasto:\n1)Colazione\n2)Pranzo\n3)Cena\n4)Spuntino");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    @Override
    public LocalDate chooseMealDate() {
        Printer printer = new Printer();
        printer.printMessage("Inserire la data del pasto (DD/MM/YYYY)");
        Scanner scanner = new Scanner(System.in);

        return LocalDate.parse(scanner.nextLine());
    }

    @Override
    public float insertCarbs() {
        Printer printer = new Printer();
        printer.printMessage("Inserisci i carboidrati");
        Scanner scanner = new Scanner(System.in);
        return Float.parseFloat(scanner.nextLine());
    }

    @Override
    public float insrtFat() {
        Printer printer = new Printer();
        printer.printMessage("Inserisci i grassi");
        Scanner scanner = new Scanner(System.in);
        return Float.parseFloat(scanner.nextLine());
    }

    @Override
    public float insertProtein() {
        Printer printer = new Printer();
        printer.printMessage("Inserisci le proteine");
        Scanner scanner = new Scanner(System.in);
        return Float.parseFloat(scanner.nextLine());
    }
}
