package day05_ifStatement;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz..." +"\n Kadin icin K  \n Erkek icin E harfini giriniz");
        char cinsiyet = input.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasinizi giriniz");
        double yas = input.nextDouble();

        if(cinsiyet== 'K'){
            if(yas <0 || yas >120 ){
                System.out.println("lutfen dofru yas degerini giriniz");
            }else if(yas>= 60){
                System.out.println("Emekli olabilirsin");
            }else{
                System.out.println("Emekli olamazsin " + (60-yas) + " calismalisin");
            }


        }else if (cinsiyet == 'E'){
            if(yas<0 || yas>120){
                System.out.println("Lutfen dogru yas degerini giriniz");
            }else if (yas> 65){
                System.out.println("Emekli olabilirsin");
            }else{
                System.out.println("Emekli olamazsin " + (65-yas)+ " daha calismalisin");
            }


        }else System.out.println("Lutfen gecerli bir harf giriniz");

    }
}
