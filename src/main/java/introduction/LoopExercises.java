package introduction;

import java.util.Scanner;

public class LoopExercises {
    public static void printMultiplicationTable(int number) {
        System.out.printf("Number %d multiplication number: \n", number);

        for (int skaicius = 1; skaicius <= 10; skaicius++) {
            System.out.println((number * skaicius) + " ");
        }
    }

    public static void printEvenNumbers(int riba) {
        System.out.printf("Even numbers up to %d: ", riba);

        for (int skaicius = 1; skaicius <= riba; skaicius++) {
            if (skaicius % 2 == 0) {
                //jeigu lieka lygi nuliui, vadinasi skaicius lyginis
                System.out.println(skaicius + " ");

            }

        }
    }

    public static void printFactorial(int givenNumber) {
        int factorial = 1;

        for (int i = 1; i <= givenNumber; i++) {
            factorial = factorial * i;
        }
        System.out.printf("Factorial of %d is : %d \n", givenNumber, factorial);


    }

    // **************** 12/13/2020 ***************

    // jei dalinasi is 5 - fizz
    // jei dalinasi is 7 - buzz
    // jei dalinasi is 7 ir 5 - fizbuzz
    // jei nesidalina - atspausdina skaiciu

    public static void fizzBuzz(int number) {

        // sukurti cikla, begti per visus skaicius

        for (int skaicius = 1; skaicius <= number; skaicius++) {


            // sukurti salyga ar skaicius dalinasi is 5

            if (skaicius % 5 == 0 && skaicius % 7 ==0) {
                System.out.println("FizzBuzz " + skaicius);

            } else if (skaicius % 7 == 0) {
                System.out.println("buzz " + skaicius);
            } else if (skaicius % 5 == 0) {
                System.out.println("fizz " + skaicius);
            } else {
                System.out.println(skaicius + " nesidalina nei is 5 nei is 7");
            }

            // sukurti salyga ar skaicius dalinasi 7

            // sukurti salyga ar skaicius dalinasi is 5 ir 7

            // atspausdinti skaiciu, jei salyga yra false

        }
    }

    public static void scannerLoopTest() {
        Scanner scanner = new Scanner(System.in);


        String temp = "";

//        while (!temp.equalsIgnoreCase("stop")) {
//            System.out.println("Iveskite teksta: ");
//            String userInput = scanner.nextLine();
//            System.out.println("Jus ivedete teksta - " + userInput);
//            System.out.println("Noredami baigti programa, iveskite stop");
//            temp = scanner.nextLine();
//
//
//        }
//
//        System.out.println("Pabaiga");


    }
}

