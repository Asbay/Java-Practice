package depoprojesi;

import java.util.Scanner;

public class DepoKarsilama {


    static Scanner input = new Scanner(System.in);

    public static void depoKarsilamaSayfasi (){

        System.err.println("#  OKUMUS DEPO ANASAYFA  #");

        System.out.println(" 1. Urun Tanimlama\n" +
                " 2. Urun Rafa Koy\n " +
                " 3. Urun Giris\n"     +
                " 4. Urun Cikis\n"     +
                " 5. Urun Listele\n"   +
                "Yapmak istediginiz islemin numarasini giriniz");

        int secim = input.nextInt();

        switch (secim) {
            case 1:
                UrunTanimlama.urunBilgileriAl();
                break;
            case 2:
                Raf.urunRafaKoy();
                break;
            case 3:
                UrunGiris.urunGirisi();
                break;
            case 4:
                UrunCikis.urunCikisi();
                break;
            case 5:
                UrunListele.urunListe();
                break;
            default:
                System.err.println("Gecerli Bir Secim Yapiniz !");
                depoKarsilamaSayfasi();
                break;

        }




    }

}
