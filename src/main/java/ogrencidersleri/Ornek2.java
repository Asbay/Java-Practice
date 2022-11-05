package ogrencidersleri;

import java.util.Scanner;

public class Ornek2 {

    /*
        TASK :
       Bir pozitif tamsayı verildiğinde, 3 üssü olup olmadığını kontrol edin. 3'ün üssü(kuvveti) ise true, değilse false return edin.
       Örnek 1:
       input: 27
       output: true
       Örnek 2:
       Girdi: 0
       Çıktı: false
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir pozitif tamsayı giriniz: ");
        int sayi=input.nextInt();
        System.out.println("Girdi: "+ sayi+"\n"+"Çıktı: "+powerOfThree(sayi));
    }
    public static boolean powerOfThree(int sayi){//1=3^0
        boolean b=false;
        int carpma=1;
        for(int i=1;i<sayi;i++){
            carpma *=3;//3,9,27,
            if(carpma==sayi){
                carpma *=3;//3,9,27
                b=true;
                break;
            }
        }return b;
    }


}
