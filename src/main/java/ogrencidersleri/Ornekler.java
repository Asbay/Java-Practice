package ogrencidersleri;

import java.util.Scanner;

public class Ornekler {

    /*
       Herhangi bir loop kullanmadan 1'den 100'e kadar tam sayıları yazdıran bir program
           yazınız.
    */
    public static void main(String[] args) {
        yazdır(-100);
    }
    public static void yazdır(int sayi){//-100ile -1
        if(sayi<0){
            System.out.print(sayi+", ");
            yazdır(sayi+1);
        }
    }



}



