package depoprojesi;

import java.util.Scanner;
import java.util.Set;

public class UrunCikis {


    static Set<Integer> urunId = UrunTanimlama.urunler.keySet();

    static Scanner input = new Scanner(System.in);


    public static void urunCikisi() {
        System.err.println("# Urun Cikis Sayfasi #");

        System.out.println("Id Numarasi Giriniz = ");
        int id = input.nextInt();
        UrunTanimlama obje = UrunTanimlama.urunler.get(id);


        do {

            if (urunId.contains(id)) {

                System.out.println("Cikis Yapmak Istediginiz Miktari Giriniz = ");
                int miktarCikis = input.nextInt();

                if (obje.getMiktar() >= miktarCikis) {

                    obje.setMiktar(obje.getMiktar() - miktarCikis);

                    System.out.println("Urun cikartmaya devam etmek icin 1'e \n Anasayfaya donmek icin herhangi bir tusa basiniz...");
                    int secim = input.nextInt();

                    if (secim == 1) {
                        urunCikisi();
                    } else {
                        DepoKarsilama.depoKarsilamaSayfasi();
                    }
                } else {
                    System.out.println("Depoda Bu Kadar Urun Yoktur. Depodaki tum urunu cikartmak icin 1'e basiniz.\n " +
                            "Tekrar cikartacaginiz urun miktarini girmek icin 2'ye basin \n " +
                            "Anasayfaya donmek icin baska bir tusa basin");

                    int islem = input.nextInt();

                    switch (islem) {
                        case 1:
                            System.out.println("Depodan Cikan miktar = " + obje.getMiktar());
                            obje.setMiktar(0);
                            System.out.println("Anasayfaya donmek icin herhangi bir tusa basin");
                            input.nextInt();
                            DepoKarsilama.depoKarsilamaSayfasi();

                            break;
                        case 2:
                            urunCikisi();
                            break;
                        default:
                            DepoKarsilama.depoKarsilamaSayfasi();
                            break;
                    }


                }

            } else {
                System.out.println("Gecerli bir id giriniz");
                id = input.nextInt();
            }

        } while (true);

    }
}
