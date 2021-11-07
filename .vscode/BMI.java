import java.util.Scanner;

public class BMI
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        double height, weight, BMI;



        System.out.println("Written your height in kg;");
        height = keyboard.nextDouble();

        System.out.println(" ");
        System.out.println("Written your weight in m:");
        weight = keyboard.nextDouble();

        BMI = weight / (height * height);
        System.out.println();
        System.out.println("Your BMI is " + BMI);


        // Bonus #1 - Imperial Measurements
        // Scanner keyboard = new Scanner(System.in);
        // double height, weight, BMI;
        // System.out.print("Your height in inches: ");
        // height = keyboard.nextDouble();
        // System.out.print("Your weight in pounds: ");
        // weight = keyboard.nextDouble();
        // BMI = weight * (703 / (height * height));
        // System.out.println();
        // System.out.println("Your BMI is " + BMI);

        keyboard.close();
    }
}