package practice04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Manav {

    static List<String> urunListesi = new ArrayList<>(Arrays.asList("patates - urun kodu : 1","limon - urun kodu : 2","kivi - urun kodu : 3",
            "biber - urun kodu : 4", "patlican - urun kodu : 5" ));//urunlerin atanacagi bos list ve diger methodlarda da kullanabilmek icin instance yaptik.
    static List<Double> urunFiyatlari = new ArrayList<>(Arrays.asList(5.0,7.5,1.3,8.7,9.2));//urun fiyatlarinin atanacagi bos list ve instance variable.
    static double toplamOdenecekTutar;//instance variable
    static Scanner scan = new Scanner(System.in);//instance variable

    public static void main(String[] args) {

        System.out.println(urunListesi);
        musteriSecim();
    }

    private static void musteriSecim() {

        System.out.println("hangi urunu secmek istersiniz :");
        int secim = scan.nextInt();

        System.out.println("sectiginiz urunden kac kilo alacaksiniz : ");
        double kilo = scan.nextDouble();
        double urunTutari = urunFiyatlari.get(secim - 1);//urun listesi 1'den 5'e kadar. Or. musteri 5. urunu secti, fiyatina ulasmak icin 4. index'e gitmek lazim.
        //bu nedenle -1 yapiyoruz.
        double urunToplamTutar = kilo * urunTutari;
        toplamOdenecekTutar += urunToplamTutar;//alınan her urun odemesi ana odemeye eklendi
        System.out.println("devam edecekseniz 1, kasa için 2 seciniz...");

        int karar = scan.nextInt();
        if (karar == 1) {
            musteriSecim();
        } else {
            kasa();
        }
    }

    private static void kasa() {

        System.out.println("alisverisinizin toplam tutari : " + toplamOdenecekTutar);






















     /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        Ipucu:
        Class icinde 3 method olacak
         * main() isimli bir method
         * musteriSecimi() isimli bir method
         * kasa() isimli bir method
         * */

    /*int toplam = 0;
    int ürünKg;
    int elmaKg = 2;
    int ürünFiyati;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Almak istediginiz ürünü seciniz: Elimizdeki mevcut ürünler:\n " +
                " Portakal , Elma , Armut , Domates, Salatalik .\n");
       String ürün = input.next();

        if(ürün.equalsIgnoreCase("portakal")){
            System.out.println("Kac kg Portakal almak istiyorsunuz");
            int portakalKg = input.nextInt();
            int toplam = 3*portakalKg;
        }else if(ürün.equalsIgnoreCase("elma")){
            System.out.println("Kac kg Elma almak istiyorsunuz");
            int elmaKg = input.nextInt();
            int toplam = 2*elmaKg;
        }else if(ürün.equalsIgnoreCase("armut")){
            System.out.println("Kac kg Armut almak istiyorsunuz");
            int armutKg = input.nextInt();
            int toplam = 4* armutKg;
        }else if(ürün.equalsIgnoreCase("domates")){
            System.out.println("Kac kg Domates almak istiyorsunuz");
            int domatesKg = input.nextInt();
            int toplam = 6* domatesKg;
        }else if(ürün.equalsIgnoreCase("salatalik")){
            System.out.println("Kac kg Salatalik almak istiyorsunuz");
            int salatalikKg = input.nextInt();
            int toplam = 2* salatalikKg;
        }else{
            System.out.println("Sectiginiz ürün elimizde bulunmamaktadir");
        }
        System.out.println("Alisverise devam etmek istiyorsaniz `A'\n" +
                "istemiyorsaniz 'B'ye basiniz");
        String devam = input.next();
        if(devam.equalsIgnoreCase("q")){

        }


    }

    public void musterisecimi(int alinanKg) {

    //   int secim =ürünKg * ürünFiyati;
      //  toplam += secim;


    }

    public void kasa(){

        System.out.println("ödemeniz gereken toplam fiyat: "+ toplam);*/
    }
}