package day02_variables;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
/*Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir program yazdirin
//( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )
        System.out.println("yaricapi giriniz");
        double r = input.nextDouble();


        System.out.println("cemberin cevresi =" + 2*314*r/100 );
        System.out.println("dairenin alani ="+ 314/100*r*r);
   //Soru 2 )  Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini isteyip o dikdortgenin alan ve
// cevre hesabini yapan bir program yaziniz.
        System.out.println("Kisa kenar uzunlugunu giriniz...");
        double kisa = input.nextDouble();
        System.out.println("Uzun kenar uzunlugunu giriniz...");
        double uzun = input.nextDouble();

        System.out.println("Dikdörtgenin cevresi =" + (2*kisa+2*uzun));
        System.out.println("Dikdörtgenin alani ="+ kisa*uzun);

        System.out.println("ücgenin üc kenar uzunlugunu giriniz...");
        byte a = input.nextByte();
        byte b = input.nextByte();
        byte c = input.nextByte();

        int cevre = a+b+c ;

        System.out.println("ücgenin cevresi = " + cevre );    */

        // Soru4)   /*Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturan bir kod yaziniz
/*
             A
            A A
           A A A

        System.out.println("Lütfen bir karakter giriniz...");
        char ch = input.next().charAt(0);  // Burda kullanici birden fazla karakter girebilir bunu engellemek icin charAt(0)
                                           //kullaniyoruz ki sadece ilk bastaki tek karakteri secsin

        System.out.println("  "+ ch +"  ");
        System.out.println(" "+ch+" "+ch);
        System.out.println(ch+" "+ch+" "+ch);

        //  Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yazdiriniz

        System.out.println("4 basamakli bir sayi giriniz ");
        int sayi= input.nextInt();
        //bir sayinin birler basamagindaki rakami  %10 ile hesaplatabiliriz  1234
        int sonRakam=sayi%10;
        int ilkRakam=sayi/1000;
        System.out.println("ilk rakam + son rakam "+(ilkRakam+sonRakam));
*/

//  Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         /* Ornek : Inputs : 853
         Output : Girdiginiz sayinin birler basamagi : 3
                  Girdiginiz sayinin onlar basamagi : 5
                  Girdiginiz sayinin yuzler basamagi : 8


        System.out.println("3 basamakli bir sayi giriniz");353
        int sayi = input.nextInt();
        // 1) 1 ler basamagindaki sayiyi bulun
        int birler = sayi % 10;
        System.out.println("girdiginiz sayinin birler basamagi " + birler);
        sayi /= 10;
        // 2) 10 lar basamagindaki sayiyi bulun
        int onlar = sayi % 10;
        System.out.println("girdiginiz sayinin onlar basamagi " + onlar);
        // 3) 100 ler basamagindaki sayiyi bulun
        int yuzler = sayi /= 10;
        System.out.println("girdiginiz sayinin yuzler basamagi " + yuzler);

          */
        System.out.println("Lutfen 5 Basamakli bir sayi giriniz");
        int num = input.nextInt();
        int ilkIkiRakam = num / 1000 ;

        System.out.println("ilkIkiRakam ="+ ilkIkiRakam);
        int ilkIkiToplam = ((ilkIkiRakam % 10)+(ilkIkiRakam/10));
        System.out.println("ilkIkiToplam= "+ ilkIkiToplam);

        int sonIkiRakam=num%100;
        System.out.println("sonIkiRkm = " + sonIkiRakam);
        int sonIkiTop=(sonIkiRakam%10)+(sonIkiRakam/10);//5+4
        System.out.println("sonIkiTop = " + sonIkiTop);


        int toplam=ilkIkiToplam+sonIkiTop;
        System.out.println("toplam = " + toplam);
    }
}




