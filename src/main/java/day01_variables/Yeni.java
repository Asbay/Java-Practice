package day01_variables;

import java.util.Scanner;

public class Yeni {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int n = input.nextInt();

        if (n % 5 == 0 || n% 3 ==0) {
            System.out.println(n);

        }else{
            System.out.println("ni");
        }
    }
}