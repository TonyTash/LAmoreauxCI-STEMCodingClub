
// Advent of Code 2015 Day 1 Challenge 1

import java.util.Scanner;

public class AOC15D1C1 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Input the instruction list");

        String instructions = scanner.nextLine();

        int floor = 0;

        // sort out string into an array of chars

        char[] instChars = instructions.toCharArray();

        for (int i = 0; i < instChars.length; i++) {

            if (instChars[i] == '(') {

                floor++;

            }

            else if (instChars[i] == ')') {

                floor--;

            }

        }

        System.out.println(floor);

    }

}
