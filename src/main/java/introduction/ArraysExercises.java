package introduction;

public class ArraysExercises {

    public static void printSumOfArrayElements(int[] skaiciai, int[] kitiskaiciai){
        int skaiciuSuma = 0;


       for (int skaicius : skaiciai) {  // komanda iškvietimui iter
             skaiciuSuma += skaicius;

        }
        for (int skaicius : kitiskaiciai) {  // komanda iškvietimui iter
            skaiciuSuma += skaicius;

        }

        System.out.println("Masyvo skaiciu suma yra lygi: " + skaiciuSuma);
    }

    public static void printAvarageOfArray(int[] numbers){
        int sumOfNumbers = 0;

        for (int number : numbers) {

            sumOfNumbers += number;
        }

        double average = (double) sumOfNumbers / numbers.length;

        System.out.println("Avarege of arrays elements is " + average);

    }

}
