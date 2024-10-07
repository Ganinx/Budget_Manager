package org.example.business;

import java.time.LocalDate;

public class Expense {

    private String nom;
    private int montant;
    private LocalDate date;


    public Expense(String nom, int montant, LocalDate date) {
        this();
        this.nom = nom;
        this.montant = montant;
        this.date = date;
    }

    public Expense() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "nom='" + nom + '\'' +
                ", montant=" + montant +
                ", date=" + date +
                '}';
    }
}
