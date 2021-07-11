import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {

        // Example 1
        // Age should be positive number

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        int clockHours = 23;

        // HOW IF CONDITION WORKS!
        if ( age > 0 ) {
            System.out.println("Thank you for information!");
            System.out.println("Another command");

        } else if ( age < 0 ) {
            System.out.println("Your age cannot be negative number!");
        } else if ( age == 0 ) {
            System.out.println("Congratulations! You are just born!");
        } else {
            System.out.println("I don't understand your age");
        }

        if ( ( age >= 18 ) && ( clockHours > 22 ) ) {
            System.out.println("You can get into liquor store now");
            System.out.println("But Liquor store is closed :(");
        }

        boolean isVaccinated = true;
        boolean hasTestedIn24h = false;


        if ( isVaccinated && hasTestedIn24h ) {
            System.out.println("You can travel!");
        } else {
            System.out.println("You cannot travel"); // you have no test
        }

        if ( isVaccinated || hasTestedIn24h ) {
            System.out.println("You can go to a restaurant");
        } else {
            System.out.println("You cannot go to restaurant"); // you have no test
        }

        if( !isVaccinated ) {
            System.out.println(" You are not vaccinated");
        } else {
            System.out.println("You are vaccinated");
        }


        if( isVaccinated ){
            // some actions
            System.out.println("The person is vaccinated");
            if (hasTestedIn24h) {
                System.out.println("1. person is vaccinated AND it has tested in less than 24h");
            }
        }


    }
}
