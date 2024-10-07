package org.example;

import org.example.business.Expense;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BudgetManager {

    static List<Expense> expenses = new ArrayList<>();
    static int montantTotal = 0;

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Bienvenue dans le Gestionnaire de Budget !");
        addExpense(new Expense("macdo",13, LocalDate.parse("2024-12-25")));
        addExpense(new Expense("Satisfactory",35,LocalDate.parse("2024-10-10")));
        System.out.println('\'');
        displayExpenses();
    }

    public static void addExpense(Expense depense){
        expenses.add(depense);
        for (Expense expens : expenses) {
            montantTotal += expens.getMontant();
        }
    }
    public static void displayExpenses(){
        expenses.forEach(System.out::println);
    }
}