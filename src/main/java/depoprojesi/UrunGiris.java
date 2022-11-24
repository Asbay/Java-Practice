package depoprojesi;

import java.util.Scanner;
import java.util.Set;

public class UrunGiris {


    // id'lerini SEt'in icine aldik.
    static Set<Integer> urunId = UrunTanimlama.urunler.keySet();



    static Scanner input = new Scanner(System.in);
    public static void urunGirisi() {
        System.err.println(" # Urun Giris Sayfasi #");


        System.out.println("Id Numarasi Giriniz = ");
        int id = input.nextInt();
        UrunTanimlama obje = UrunTanimlama.urunler.get(id);

        do {

            if(urunId.contains(id)){
                System.out.println("Miktar Giriniz = ");
                int miktar= input.nextInt();
                obje.setMiktar(obje.getMiktar()+miktar);

                System.out.println("Urun eklemeye devam etmek icin 1'e \n Anasayfaya donmek icin herhangi bir tusa basiniz...");
                int secim = input.nextInt();

                if(secim==1){
                    urunGirisi();
                }else {
                    DepoKarsilama.depoKarsilamaSayfasi();
                }


            }else{
                System.out.println("Olmayan id Girdiniz, Lütfen tekrar id giriniz = ");
                id=input.nextInt();

            }
        }while (true);















    }
}

