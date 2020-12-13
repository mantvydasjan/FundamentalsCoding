package introduction;

import java.sql.SQLOutput;

public class DataTypeExercises {
    public static void printSum(int firstNumber, int secondNumber, int thirdNumber) {
        int suma = firstNumber + secondNumber + thirdNumber;

// įvedu skaičius 1 5 8, noriu matyti 1 + 5 + 8 = 14
        System.out.printf("%d + %d + %d = %d", firstNumber, secondNumber, thirdNumber, suma);
        //printf nes patogiau
    }

    public static void printDivision(int skaicius, int skaiciusIsKurioDalinam) {
        //bus dalinama ir gaunam sveika dalis, be liekanos; dalinama su /
        int divisionResult = skaicius / skaiciusIsKurioDalinam;

        //gaunama liekana - dalinama su %
        int liekana = skaicius % skaiciusIsKurioDalinam;

        System.out.printf("%d / %d = %d (liekana: %d)", skaicius, skaiciusIsKurioDalinam, divisionResult, liekana);
    }

    public static void printCircleAreaAndPerimeter(double spindulys) {

        //apskritimo plotas pi R kvadratu
        double plotas = spindulys * spindulys * Math.PI;
        double perimetras = Math.PI * spindulys * 2;

        System.out.printf("Apskritimo spindulys %.2f , o plotas = %.2f ", spindulys, plotas);
        System.out.println();
        System.out.printf("Apskritimo perimetras = %.2f", perimetras);

    }

    public static void printNumberAverage(int firstNumber, int secondNumber, int thirdNumber) {
        int average = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.printf("Average (%d, %d, %d) = %d", firstNumber, secondNumber, thirdNumber);
    }

    //TODO implement differently.
    public static void printSumDigits(int givenNumber) {
        //skaiciu paversti i eilute
        //eilutes visus atskirus simbollius i masyva
        //sudeti visus masyvo skaicius
        //gausim suma
        int originalNumber = givenNumber;
        int sumDigits = 0;

        while (givenNumber > 0) {
            sumDigits = sumDigits + givenNumber % 10;
            givenNumber /= 10;
        }
        System.out.printf("Sum of given number %d digit is: %d", originalNumber, sumDigits);
    }

    public static void convertToMeters(double inches, double feet, double miles, double yards) {
        double inchesToMeters = inches * 0.0254;
        double feetToMeters = feet * 0.3048;
        double milesToMeters = miles * 1609;
        double yardsToMeters = yards * 0.914;

        System.out.printf(inches + " inches is %.3f meters \n", inchesToMeters);
        System.out.printf(feet + " feet is %.3f meters \n", inchesToMeters);
        System.out.printf(miles + " miles is %.3f meters \n", milesToMeters);
        System.out.printf(yards + " yards is %.3f meters \n", yardsToMeters);


    }

}