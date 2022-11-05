package day04_ifStatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Y yada N ikilisinden birini giriniz");
        char karakter = input.next().charAt(0);

        if(karakter == 'Y'|| karakter =='y'){
            System.out.println("YES");
        }else if(karakter == 'N'|| karakter== 'n'){
            System.out.println("NO");
        }else{
            System.out.println("lutfen y yada n giriniz");
        }
    }
}
