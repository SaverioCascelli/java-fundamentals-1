package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        int numbers = 100;
        Scanner scan = new Scanner(System.in);

        boolean isInputValid = false;

        while (!isInputValid){
            System.out.println("inserire quanti numeri usare per FizzBuzz da 1 a 999");
            numbers = scan.nextInt();
            if (numbers > 0 && numbers < 1000){
                isInputValid = true;
            }
        }
        scan.close();

        for (int i = 1; i <= numbers; i++) {
            String toPrint = "";
            if(i % 3 == 0){
                toPrint += "Fizz";
            }
            if (i % 5 == 0) {
                toPrint += "Buzz";
            }
            if (toPrint.equals("")){

                toPrint = String.valueOf(i);
            }
            System.out.print(toPrint + " ");

            if(i % 10 == 0){
                System.out.println("");
            }

        }
    }
}
