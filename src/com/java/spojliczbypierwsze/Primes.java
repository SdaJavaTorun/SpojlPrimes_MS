package com.java.spojliczbypierwsze;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-03-08.
 */
public class Primes {

    public static void primes(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę testów: ");
        int n = input.nextInt();
        Random r = new Random();

        for (int i = 0; i < n ; i++) {
            int dzielniki = 0;
            int a = r.nextInt(50);

            //System.out.println("Podaj liczbę: ");  <-- jeśli chcemy sprawdzić konkretną liczbę
            //int b = input.nextInt();  <-- w pętli i warunku zamiana a na b
            for (int j = 2; j < a; j++) {
                if (a % j == 0)
                    dzielniki++;
            }
            if (dzielniki == 0) {
                System.out.format("%2d%s",a ," TAK\n");
            } else {
                System.out.format("%2d%s",a , " NIE\n");
            }
        }
    }
}
