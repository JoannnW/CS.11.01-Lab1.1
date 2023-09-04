import java.util.Scanner;

public class Dateable {
    public static void main(String[] args) {
        Scanner ageScanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age =-1;
        while (age < 0) {
            try {
                age = Integer.parseInt(ageScanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        age=10;
        while (age < 11) {
            try {
                age = Integer.parseInt(ageScanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("You're too young to date");
            }
        }
        System.out.println("Age: " + age);
        int ageHalved = age / 2;
        int ageHalvedPlusSeven = ageHalved + 7;
                System.out.println("You should date someone who's at least");
                System.out.println(ageHalvedPlusSeven);
                System.out.println("years old");
            }

    }





