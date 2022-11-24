package depoprojesi;

import java.util.Scanner;
import java.util.Set;

public class Raf {


    static Set<Integer> urunId = UrunTanimlama.urunler.keySet();
    static Scanner input = new Scanner(System.in);

    public static void urunRafaKoy(){
        System.err.println(" # Urun Rafa Koyma Sayfasi #");

        System.out.println("Id Numarasi Giriniz = ");
        int id = input.nextInt();

        UrunTanimlama obje = UrunTanimlama.urunler.get(id);

        do {

            if(urunId.contains(id)){
                System.out.println("Hangi Rafa Koymak Istiyorsunuz ?");
                String istenilenRaf= input.next();

                obje.setRaf(istenilenRaf);

                System.out.println("Rafa Koymaya devam etmek icin 1'e \n Anasayfaya donmek icin herhangi bir tusa basiniz...");
                int secim = input.nextInt();

                if(secim==1){
                    urunRafaKoy();
                }else {
                    DepoKarsilama.depoKarsilamaSayfasi();
                }


            }else{
                System.out.println("Olmayan id Girdiniz, Lütfen tekrar id giriniz = ");
                id=input.nextInt();

            }

        }while(true);


    }
}
