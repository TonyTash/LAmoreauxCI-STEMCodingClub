import java.util.Scanner;

public class CCC17J1 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the x value:");

        int x = scanner.nextInt();

        System.out.println("Enter the y value:");

        int y = scanner.nextInt();



        if (x > 0) {

            if (y > 0) {

                // Quadrant 1
                System.out.println("1");

            }

            else if (y < 0) {

                System.out.println("4");

            }

        }

        else if (x < 0) {

            if (y > 0) {

                // Quadrant 1
                System.out.println("2");

            }

            else if (y < 0) {

                System.out.println("3");

            }

        }

    }

}
