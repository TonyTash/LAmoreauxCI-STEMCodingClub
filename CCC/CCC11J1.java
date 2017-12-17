package com.company;
import java.util.Scanner;

public class CCC11J1 {

    public static void main(String[] args) {
	// write your code here

        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);

        int eyes;
        int antenna;

        System.out.println("How many antenna?");
        antenna = scanner.nextInt();
        System.out.println("How many eyes?");
        eyes = scanner.nextInt();

        // if TroyMartian: antenna >= 3 and eyes <= 4

        if ((antenna >= 3) && (eyes <= 4) ) {

            System.out.println("TroyMartian");

        }

        // if VladSaturnian: antenna <=6 and eyes >=2
        if ((antenna <= 6) && (eyes >=2)) {

            System.out.println("VladSaturnian");

        }

        // if GraemeMercurian: antenna <=2 and eyes <=3
        if ((antenna <= 2) && (eyes <=3)) {

            System.out.println("GraemeMercurian");

        }


    }
}


