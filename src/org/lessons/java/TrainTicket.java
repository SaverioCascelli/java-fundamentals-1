package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
//        Consegna: Il programma dovrà chiedere all’utente il numero (intero) di chilometri che vuole percorrere e l’età del passeggero (numero intero). Sulla base di queste
//        informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole: il prezzo del biglietto è definito in base ai km (0.21 € al km)
//        va applicato uno sconto del 20% per i minorenni
//        va applicato uno sconto del 40% per gli over 65
//        Per chiedere informazioni all’utente sarà necessario usare la classe java.util.Scanner, come visto in classe stamattina.
//        Bonus: formattare il risultato con un numero limitato di decimali utilizzando la classe DecimalFormat

         double pricePerKm = .21;
         int totalKm = 12;
         int age = 65;
         double underAgeDiscount = 20;
         double seniorDiscount = 40;

         Scanner scan = new Scanner(System.in);

        System.out.println("Inserire età passeggero");
        age = scan.nextInt();

        System.out.println("Inserire chilometri da percorrere ");
        totalKm = scan.nextInt();

        double result;
        double underAgeResult;
        double seniorResult;

        DecimalFormat twoDecimal = new DecimalFormat("#.##");

         result = pricePerKm * totalKm;
         if (age < 18){
             underAgeResult = result - (result *(underAgeDiscount / 100));
             String formattedUnderAge = twoDecimal.format(underAgeResult);
             System.out.println("Biglietto Minorenni: " + formattedUnderAge);
         } else if (age >= 65) {

             seniorResult = result - (result *(seniorDiscount / 100));
             String formattedSenior = twoDecimal.format(seniorResult);
             System.out.println("Biglietto Senior: " +formattedSenior);
         }else{

             String formattedResult = twoDecimal.format(result);
             System.out.println("Biglietto Nomale: " + formattedResult);
         }




    }
}
