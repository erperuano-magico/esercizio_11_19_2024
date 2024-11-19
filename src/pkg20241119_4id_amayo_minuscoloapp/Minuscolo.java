/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241119_4id_amayo_minuscoloapp;

import java.util.Scanner;

/**
 *
 * @israel amayo 4infd 2024-11-19
 *
 * la classe Minuscolo si occupa di chiedere una parola all'utente, trasformare
 * la stringa in un arrey di caratteri, trasformare la parola in minuscolo,
 * visualizzare la parola carattere per carattere e in fine trasformare da un
 * array di caratteri a una stringa
 *
 */
public class Minuscolo {

    // inizializzo gli attributi tanti e MAISCOLO
    static final int TANTI = 30;
    char[] MINUSCOLO = new char[TANTI];
    //dichiaro l'attributo parola
    private String parola;

    /**
     *
     */
    public void scannner() {
        //creazione dell'ogetto per lo scan
        Scanner in = new Scanner(System.in);

        //stampa la richiesta di una parola all'utente 
        System.out.print("\nInserisci una parola :");

        //inizializzo l'attributo parola tramite l'imput dell'utente 
        parola = in.next();
    }

    public void arr_char() {
        //ciclo for per trasformare la stringa in un arrey di caratteri
        for (int x = 0; x < parola.length(); x++) {

            MINUSCOLO[x] = parola.charAt(x);
        }
    }

    public void minuscolo() {
        //ciclo for per trasformare la parola in minuscolo
        for (int x = 0; x < parola.length(); x++) {
            MINUSCOLO[x] = Character.toLowerCase(MINUSCOLO[x]);
        }
    }

    public void charxchar() {
        System.out.print("La parola in minuscolo (array):");

        //visualizza la parola carattere per carattere 
        for (int x = 0; x < MINUSCOLO.length; x++) {

            System.out.print("" + MINUSCOLO[x]);
        }
    }

    public void arr_to_string() {
        String parolaMinu = new String(MINUSCOLO);
        System.out.print("\nLa parola in minuscolo (oggetto:");
        System.out.println(parolaMinu);
    }
}
