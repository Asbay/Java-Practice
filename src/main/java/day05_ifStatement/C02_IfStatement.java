package day05_ifStatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        //Kullanicidan yasini iste ... 65 veya daha büyükse emekli olabilrsin
        //65 den daha kücükse "? sene daha calismalisin yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi pozitif sayi olarak giriniz");
        int yas= input.nextInt();

        if(yas>= 65){
            System.out.println("Emekli olabilirsin");
        }else {
            System.out.println("Emekli olamazsin");
            System.out.println(65 - yas +  "  sene daha calismalisin...");
        }

        if(yas>= 0){
            if(yas>65){
                System.out.println("Emekli olabilirsin");
            }else{
                System.out.println("Emekli olamazsin...");
                System.out.println(65-yas  + " sene daha calismalisin");
            }
       }
    }
}
