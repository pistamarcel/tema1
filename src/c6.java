import java.util.Scanner;

public class c6 {
    public static void main(String args[]){
        System.out.println("Scrieti primul numar:");
        Scanner scann= new Scanner(System.in);

        int a = scann.nextInt();
        Scanner scan= new Scanner(System.in);
        System.out.println("Scrieti al doilea numar:");
        int b = scann.nextInt();

        System.out.println( "Primul numar  " + a+"\n Al doilea numar  " + b) ;
    }
}
