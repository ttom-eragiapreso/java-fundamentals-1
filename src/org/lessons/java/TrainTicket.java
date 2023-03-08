package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    /*
    * Esercizio 1: Calcolo biglietto del treno
    Consegna: Il programma dovrà chiedere all’utente il numero (intero) di chilometri che vuole percorrere
    * e l’età del passeggero (numero intero). Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio,
    *  secondo queste regole:
    il prezzo del biglietto è definito in base ai km (0.21 € al km)
    va applicato uno sconto del 20% per i minorenni
    va applicato uno sconto del 40% per gli over 65
    Per chiedere informazioni all’utente sarà necessario usare la classe java.util.Scanner, come visto in classe stamattina.
    Bonus: formattare il risultato con un numero limitato di decimali utilizzando la classe DecimalFormat*/

        //Init
        int km;
        int age;
        double rate = 0.21;
        double underAgeDiscount = 20.0;
        double seniorDiscount = 40.0;

        Scanner scan = new Scanner(System.in);
        //Get data from user and store it
        System.out.println("How many kilometers is your journey?");
        km = Integer.parseInt(scan.nextLine());
        System.out.println("How old are you?");
        age = Integer.parseInt(scan.nextLine());

        double totalPrice = rate * km;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");

        if(age < 18){
            totalPrice-= totalPrice * underAgeDiscount / 100;
        }
        else if(age > 65){
            totalPrice-= totalPrice * seniorDiscount / 100;
        }

        //Final output
        System.out.println("You are " + age + " years old and you want to travel " + km + " Km. The price of your " +
                "ticket is " +
                 decimalFormat.format(totalPrice) + " Euros");
    }
}