import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double celsius;
        double fahrenheit;
        boolean valid = false;
        String user;
        String again = "N";

        boolean run = true;

        while (run){

                Scanner scan = new Scanner(System.in);
                do {
                    System.out.printf("%-13s", "Please enter your temperature in celsius to be converted to fahrenheit or N to stop");
                    System.out.println();
                    if (scan.hasNextDouble()) {
                        celsius = scan.nextDouble();

                        if (celsius >= -273.15) {
                            valid = true;
                            fahrenheit = (celsius * 1.8) + 32;

                            System.out.printf("%-13s %-6.2f", "Degrees C:", celsius);
                            System.out.printf("\n%-13s %-6.2f", "Degrees F:", fahrenheit);
                            System.out.println();
                        }
                        else {
                            System.out.println("You have entered an incorrect temperature");
                        }
                    }
                    else {
                        user = scan.nextLine();
                        if (user.equals(again)) {
                            run = false;
                        }
                        else {
                            System.out.println("You Must enter a valid temperature");
                        }
                    }
                } while (!valid);



        }
    }
}