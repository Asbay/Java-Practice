package day06_nestedifswitch;

import java.util.Scanner;

public class C03_SwitchCase {
    /*DERS PROGRAMI

    Hangi gun hangi dersin oldugunu gosteren bir program yaziniz

    Pazartesi ve Sali ise: Java

    Persembe ve Cuma ise: Selenyum

    Carsamba ve Cumartesi ise: SQL

    aksi halde: izin gunu=Day Off  */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen gün ismini giriniz");

        String gün = input.next().toUpperCase();

        switch(gün)  {

            case "PAZARTESI"  :
            case "SALI" :
                System.out.println("Java");
                break;

            case"PERSEMBE" :
            case"CUMA" :
                System.out.println("selenyum");
                break;

            case"CARSAMBA" :
            case "CUMARTESI":
                System.out.println("sql");
                break;

            default:
                System.out.println("Day off");
        }
    }
}
