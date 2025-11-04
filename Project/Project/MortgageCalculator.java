package Project;

import java.util.Scanner;


public class MortgageCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" === Mortgage Calculator === ");

        System.out.print("Enter loan amount (Principal): ");
        double principal = input.nextDouble();

        System.out.print("Enter annual interestr rate (in %): ");
        double annualRate = input.nextDouble();

        System.out.print("Enter loan amount (in years): ");
        int years = input.nextInt();

        // Converting annual interest rate to monthly and years to months//

        double monthlyRate = annualRate / 100 / 12;
        int numberOfPayment = years * 12;

        //Mortgage Formula//

        double numerator = monthlyRate * Math.pow(1 + monthlyRate, numberOfPayment);
        double denominator = Math.pow(1 + monthlyRate, numberOfPayment) - 1;
        double monthlyPayment = principal * (numerator/denominator);

        System.out.println("Your monthly payment is: $" + String.format("%.2f",monthlyPayment));

        input.close();
    }
}

