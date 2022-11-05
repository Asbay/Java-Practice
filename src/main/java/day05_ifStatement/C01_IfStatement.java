package day05_ifStatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ilk sayiyi giriniz");
        double sayi1 = input.nextDouble();

        System.out.println("Lütfen ikinci sayiyi giriniz");
        double sayi2 = input.nextDouble();

        if(sayi1>0 && sayi2>0){
            System.out.println("Sayilarin toplami="+ (sayi1 + sayi2));
        }else if (sayi1<0 && sayi2<0 ){
            System.out.println("sayilarin carpimi="+ (sayi1*sayi2));
        }else if(sayi1 * sayi2 <0 ){
            System.out.println("Farkli isaretteki sayilarla islem yapamazsin");
        }else System.out.println("sifir carpmaya göre yutan elemandir");
    }
}
