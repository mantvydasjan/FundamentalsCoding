package introduction;

public class StringExercises {
    public static void printHelloName(String name, String lastName) {
        String initialText = "Print my name on the screen...";
        System.out.println(initialText + name + " " + lastName);


    }

    public static void printStringPattern() {
        System.out.println("Basic pattern:");

        //Komentaras - isspausdinsime dideli JAVA zodi.
        System.out.println("   J    a   v     v    a ");
        System.out.println("   J   a a   v   v    a a");
        System.out.println("J  J  aaaaa   v v    aaaaa ");
        System.out.println(" JJ  a     a   v    a     a");
    }
    public static void printLowerCase(String eilute) {
        System.out.println("Paverčiame eilutės simbolius mažais: " + eilute.toLowerCase());
        System.out.println("Paverčiamem eilutės simbolius dideliais: " + eilute.toUpperCase());
    }

    public static void checkUserName (String username) {
        if(username.length() > 5) {
            System.out.println("Viskas liuks");
        } else {
            System.out.println("Username per trumpas");
        }
    }

    public static void printReversedString(String eilute){
        System.out.println("Printing reversed string: " + eilute);

        //StringBuilder papildoma klasė, kuri duoda papildomo funkcionalumo
        // dirbant su eilutėmis
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(eilute);
        stringBuilder.reverse();
        System.out.println("Apsukta eilute - " + stringBuilder.toString());
    }

    public static void printHalfOfTheString(String eilute) {
        System.out.println("Printing first half of providing string - " + eilute);
        // pirma nustatykime eilutes ilgi
        int eilutesIlgis = eilute.length();
        int pusesEilutesIlgis = eilutesIlgis / 2;

        String puseEilutes = eilute.substring(0, pusesEilutesIlgis);
        System.out.println("puse eilutes - " + puseEilutes);
    }
    public static void printWordWithoutFirstLetter(String eilute) {
        System.out.println("Pilnas zodis -  " + eilute);
        int eilutesIlgis = eilute.length();
        String nukirptaEilute = eilute.substring(1,eilutesIlgis);
        System.out.println("Nukirpta eilute - " + nukirptaEilute);
    }

    public static void compareTwoStrings(String pirmasZodis, String antrasZodis) {
        //tikriname ar eilutes lygios
        if(pirmasZodis.equalsIgnoreCase(antrasZodis)) {
            System.out.println("Zodziai yra lygūs");
        } else {
            System.out.println("Zodziai yra skirtingi");
        }
    }

    public static void printSymbolCount(String eilute) {
        System.out.println("Printing string symbol count: " + eilute);

        int lettersCount = 0;
        int spacesCount = 0;
        int numbersCount = 0;
        int otherSymbolsCount = 0;

        //Eilute - labas kaip sekasi?
        for (int skaicius = 0; skaicius < eilute.length(); skaicius++) {
            //ciklo logika kiekvienos iteracijos metu
            //skaiciuojame raides
            if (eilute.substring(skaicius, skaicius + 1).matches("[a-zA-Z]")) {
                lettersCount++;
            }

            //skaiciuojame tarpelius
            if (eilute.substring(skaicius, skaicius + 1).matches(" ")) {
                spacesCount++;
            }
            if (eilute.substring(skaicius, skaicius + 1). matches("[0-9]")){
                numbersCount++;
            }
        }
        System.out.println("Eilute turi - " + lettersCount + "raidziu.");
        System.out.println("Eilute turi - " + spacesCount + " tarpelius");
        System.out.println("Eilute turi - " + numbersCount + "skaicius/skaiciu");
    }

}