package introduction;

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
}

