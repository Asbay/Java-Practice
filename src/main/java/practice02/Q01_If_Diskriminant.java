package practice02;

import java.util.Scanner;

public class Q01_If_Diskriminant {
    /* Günün sorusu: if statement
      katsayıları verilen 1 bilinmeyenli denklemin kökleriniz bulunuz.
        ax^2 + bx + c;
        Çözüm adımları
        kullanıcıdan a,b,c yi alın.
        Diskriminant formulü: (-b +/- karekök(delta)) / (2a)
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Denklemin a, b ve c sayilarini sirayla giriniz.");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int delta = b*b- 4*a*c;

        if( delta>0) {
            double x1 = (-b + (Math.sqrt(delta))) / (2*a);
            double x2 = (-b - (Math.sqrt(delta))) / (2*a);
            System.out.println("Denkleminiz " + a + "x²+" + b + "x+" + c);
            System.out.println("Denklemin iki kökü vardir."+ "x1="+ x1+ "  " +"x2= "+ x2);
        }else if(delta ==0){
            double x3 = -b / (2*a);
            System.out.println("Denkleminiz " + a + "x²+" + b + "x+" + c);
            System.out.println("Denklemin tek kökü vardir. x3= "+ x3);
        }else if(delta<0){
            System.out.println("Denkleminiz " + a + "x²+" + b + "x+" + c);
            System.out.println("Denklemin kök yoktur");
        }
    }
}
