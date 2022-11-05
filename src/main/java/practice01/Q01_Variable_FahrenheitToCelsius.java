package practice01;

import java.util.Scanner;

public class Q01_Variable_FahrenheitToCelsius {
    public static void main(String[] args) {
        // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
// formül: c = (f-32)*5/9

        Scanner scan = new Scanner(System.in);
        System.out.println("Fahrenheit degerini giriniz");
        double f = scan.nextDouble();

        double celsius =(f-32)*5/9;

        System.out.println("Celsius : "+ celsius);


    }
}
