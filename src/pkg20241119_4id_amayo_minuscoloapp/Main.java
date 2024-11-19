/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20241119_4id_amayo_minuscoloapp;

/**
 *
 * @israel amayo 4infd 2024-11-19 consegna modificare la classe Minuscolo
 * aggiungendo attributi e metodi necessari per trasformare l' applicazione
 * _20241119_4id_Cognome_MinuscoloApp.java in sola forma a oggetti; nel main non
 * dovrà comparire alcuna logica.
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Minuscolo minu = new Minuscolo();
        minu.scannner();

        minu.arr_char();

        minu.minuscolo();

        minu.charxchar();
        // trasforma da array di caratteri a stringa
        minu.arr_to_string();

    }

}
