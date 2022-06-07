import java.util.Scanner;

public class c7 {
    public static void main(String args[]) {

        System.out.println("Scrieti numarul: ");
        Scanner scann= new Scanner(System.in);

        double numar1 = scann.nextDouble();

        Double rezultatadunare = adunare(numar1);
        double rezultatscadere = scadere(numar1);
        double rezultatinmultire = inmultire(numar1);
        double rezultatimpartire = impartire(numar1);
        double rezultatmodul = modul(numar1);

        System.out.println("Rezultat adunare este: " +  rezultatadunare);
        System.out.println("Rezultat scadere este: " +  rezultatscadere);
        System.out.println("Rezultat imultire este: " +  rezultatinmultire);
        System.out.println("Rezultat impartire este: " +  rezultatimpartire);
        System.out.println("Rezultat modul este: " +  rezultatmodul);

    }
    public static double adunare(double numar1){
        double rezultat = numar1 + 5;
        return rezultat;

    }
    public static int scadere(double numar1) {
        double rezultat = numar1 - 12.7;
        return (int) rezultat;
    }
    public static double inmultire (double numar1) {
        double rezultat = numar1 * -3.2;
        return rezultat;
    }
    public static double impartire (double numar1) {
        double rezultat = numar1/4;
        return rezultat;
    }
    public static double modul(double numar1) {
        double rezultat = numar1 % 6;
        return rezultat;
    }
}
