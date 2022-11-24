package depoprojesi;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UrunListele {

    static Scanner input = new Scanner(System.in);






    public static  void urunListe(){

        System.err.println("\t\t\t\t\t\t\t# URUN LİSTELEME #");
        System.out.println("_____________________________________________________________________________________");
        System.out.println("\tID\t\t\tİSİM\t\t\tURETİCİ\t\t\tMİKTAR\t\t\tBİRİM\t\t\tRAF\t");
        System.out.println("-------------------------------------------------------------------------------------");


        Map<Integer,UrunTanimlama> rrr=   UrunTanimlama.urunListesiOlustur();

        Set<Map.Entry<Integer, UrunTanimlama>> urunlerSet=rrr.entrySet( );

        for(Map.Entry<Integer, UrunTanimlama> w : urunlerSet){

            System.out.print("\t"+w.getKey()+ " " +w.getValue());
            System.out.println("\n");


        }
        System.out.println("Anasayfaya Donmek icin 1'e Basin");

        int a =input.nextInt();
        do {
            if(a==1){
                DepoKarsilama.depoKarsilamaSayfasi();
                break;
            }else {
                System.out.println("Yanlis secim yaptiniz\n Anasayfaya donmek icin lütfen 1'e basiniz");
                a=input.nextInt();
            }
        }while (true);





    }
}
