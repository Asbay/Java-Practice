package day05_ifStatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen maas icin bir teklif veriniz");
        double maas= input.nextDouble();

        if(maas>= 20000){
            System.out.println("Kabul ediyorum");
        }else if( maas>=10000 && maas <= 20000 ){

        }

    }
}
