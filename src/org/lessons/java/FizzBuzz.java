package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
    /*
    * Esercizio 2: FizzBuzz
    Consegna: Scrivi un programma che stampi i numeri da 1 a 100, ma per i multipli di 3 stampi “Fizz”
    * al posto del numero e per i multipli di 5 stampi “Buzz”.
    * Per i numeri che sono sia multipli di 3 che di 5 stampi “FizzBuzz”.
    Esempio: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz……
    Bonus: invece che 100, chiedere all’utente quanti numeri vuole stampare
    * (il valore inserito dall’utente deve essere maggiore di 0 e minore di 1000)*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a number between 1 and 1000");
        int userNumber = Integer.parseInt(scan.nextLine());

     /*   if(userNumber < 1 || userNumber > 1000){
            System.out.println("Please choose a number between 1 and 1000");
            userNumber = Integer.parseInt(scan.nextLine());
        }*/

        while(userNumber < 1 || userNumber > 1000){
            System.out.println("Inserted number invalid. Please choose a number between 1 and 1000");
            userNumber = Integer.parseInt(scan.nextLine());
        }

        System.out.println("Here is your spectacular FizzBuzz");
        for (int i = 1; i <= userNumber; i++) {
            String message = Integer.toString(i);

            if(i % 15 == 0){
                message = "FizzBuzz";
            }
            else if(i % 5 == 0){
                message = "Buzz";
            }
            else if(i % 3 == 0){
                message = "Fizz";
            }
            System.out.println(message);
        }
    }
}
