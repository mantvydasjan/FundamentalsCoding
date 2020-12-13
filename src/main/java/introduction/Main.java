package introduction;

import sun.java2d.windows.GDIBlitLoops;

public class Main {

    public static void main(String[] args) {
        System.out.println("-------String exercises-------"); //į ekraną išvedamas tekstas
        StringExercises.printHelloName("Darius", "Darinskas");
        System.out.println("***");
        StringExercises.printStringPattern();
        StringExercises.printLowerCase("LABAS");
        System.out.println("****");
        StringExercises.checkUserName("BlackKnight");
        StringExercises.checkUserName("Ona");
        System.out.println("****");
        StringExercises.printReversedString("labadiena");
        System.out.println("8888");
        StringExercises.printHalfOfTheString("labas kaip sekas?");
        System.out.println("ūūūūū");
        StringExercises.printWordWithoutFirstLetter("Samantele");
        System.out.println("lalallala");
        StringExercises.compareTwoStrings("Labas", "labas");
        StringExercises.compareTwoStrings("Opa", "Viso");
        System.out.println("lalallala");
        StringExercises.printSymbolCount("Stalas turi");
        StringExercises.printSymbolCount("St3las tur7");


        System.out.println();
        System.out.println();
        System.out.println("----------Data type exercises-------");
        DataTypeExercises.printSum(4, 6, 2);
        System.out.println();
        System.out.println(" lalallala");
        DataTypeExercises.printDivision(7, 2);
        System.out.println(" lalallala");
        System.out.println();
        DataTypeExercises.printCircleAreaAndPerimeter(6);
        System.out.println();
        System.out.println("atskiriame :)))");
        DataTypeExercises.printSumDigits(123);
        System.out.println();
        System.out.println("*****");
        DataTypeExercises.convertToMeters(456, 235, 656, 1213);
        System.out.println();
        System.out.println();
        System.out.println("** Loops exercises *");
        LoopExercises.printMultiplicationTable(3);
        System.out.println("** Loops exercises *");
        LoopExercises.printEvenNumbers(40);
        System.out.println("*****");
        System.out.println();
        LoopExercises.printFactorial(5);



    }
}