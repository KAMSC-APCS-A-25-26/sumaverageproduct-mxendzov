// NAME : Michael Xendzov
// GROUP : APCS - A 6th Hour
// PROBLEM ID : Lewis Arithmetic 2.2 - 2.3
// PROBLEM DESCRIPTION : Prompt the user for some numbers and
// : display the sum, product, and average,
// LAST MODIFIED DATE : September 10th 2025
// SOURCES I USED : Java Book
// PEOPLE I HELPED : Conner Chan, Adam Sagin
// PEOPLE WHO HELPED ME : Conner Chan, Adam Sagin
import java.util.Scanner;
public class SumProductAverage
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Michael Xendzov\nAPCS-A\nLewis Arithmetic 2.2-2.3\n\n");
        System.out.print("Enter the number of runs: ");
        int NumRuns = sc.nextInt();
// for loop for the number of runs
        for (int i = 1; i <= NumRuns; i++)
        {
// prompt the user for the number of runs and store it in a variable
            System.out.print("\n\nEnter 3 numbers: ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double num3 = sc.nextDouble();
// find the sum, product, and average and output it
            double sum = num1 + num2 + num3;
            double product = num1 * num2 * num3;
            double average = sum / 3;
            System.out.println("\nThe sum is " + sum);
            System.out.println("The product is " + product);
            System.out.println("The average is " + average);
        }
        sc.close();
    }
}