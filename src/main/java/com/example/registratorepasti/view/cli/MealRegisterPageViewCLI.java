package com.example.registratorepasti.view.cli;

import com.example.registratorepasti.model.Meal;
import com.example.registratorepasti.utils.Printer;
import com.example.registratorepasti.view.MealRegisterPageView;

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
        String choice = scanner.nextLine();
        switch (choice){
            case "1" -> {
                return "Colazione";
            }
            case "2" -> {
                return "Pranzo";
            }
            case "3" -> {
                return "Cena";
            }
            case "4" -> {
                return "Spuntino";
            }
            default -> {
                return "";
            }
        }

    }

    @Override
    public String chooseMealDate() {
        Printer printer = new Printer();
        printer.printMessage("Inserire la data del pasto (Day/Month)");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    @Override
    public float insertCarbs() {
        Printer printer = new Printer();
        printer.printMessage("Inserisci i carboidrati");
        Scanner scanner = new Scanner(System.in);
        return Float.parseFloat(scanner.nextLine());
    }

    @Override
    public float insertFat() {
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

    @Override
    public void showResume(Meal meal) {
        Printer printer = new Printer();
        printer.printMessage("Meal Resume\n");
        printer.printMessage("Calories: " + meal.getCalories());
        printer.printMessage("Carbs: " + meal.getCarbs());
        printer.printMessage("Fat: " + meal.getFat());
        printer.printMessage("Protein: " + meal.getProtein());
    }

    @Override
    public boolean askConfirm() {
        Printer printer = new Printer();
        printer.printMessage("Confirm Meal?");
        printer.printMessage("[Y/N]");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().equalsIgnoreCase("Y");
    }

    @Override
    public Integer insertCalories() {
        Printer printer = new Printer();
        printer.printMessage("Inserisci le calorie");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
