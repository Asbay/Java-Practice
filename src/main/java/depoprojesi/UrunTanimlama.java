package depoprojesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UrunTanimlama {


        static Scanner input = new Scanner(System.in);

        static Map<Integer , UrunTanimlama> urunler = new HashMap<>();
        private  String adi ;
        private  String uretici;
        private   String birim;

        private  static int  id;

        public  static  int idIcınRakam=100;

        private  int miktar=0;

        private  String raf=null;





        public  UrunTanimlama(String adi, String uretici, String birim){

            this.adi = adi;
            this.uretici = uretici;
            this.birim = birim;
            this.id= idIcınRakam;
            miktar=0;
            idIcınRakam++;

        }


        public static Object  urunBilgileriAl(){
            System.out.println("Urunun Adini Giriniz = ");
            String urunAdi=input.next();
            System.out.println("Uretici Firma Adini Giriniz = ");
            String uretciFirma=input.next();
            System.out.println("Birim Giriniz = ");
            String birim = input.next();

            UrunTanimlama urunObje= new UrunTanimlama(urunAdi,uretciFirma,birim);
            urunler.put(getId(), urunObje);

            do {
                System.out.println("Urun Eklemeye devam etmek icin 1'e \n Anasayfaya donmek icin 2'ye basiniz");
                int aaa=input.nextInt();
                if(aaa==1){
                    urunBilgileriAl();
                    break;
                } else if (aaa==2) {
                    DepoKarsilama.depoKarsilamaSayfasi();
                    break;
                }else {
                    System.out.println("Yanlis bir secim yaptiniz");
                }
            }while (true);


            return urunObje;


        }


        public static Map<Integer,UrunTanimlama> urunListesiOlustur(){

            return  urunler;
        }


        public static Integer getId() {

            return id;
        }

        public int getMiktar() {
            return miktar;
        }

        public void setMiktar(int miktar) {
            this.miktar = miktar;
        }

        @Override
        public String toString() {

            return  "\t\t"+  adi+"\t\t\t\t"+ uretici+"\t\t\t\t"+ miktar+"\t\t\t"+birim+"\t\t\t"+raf;
        }

        public String getRaf() {
            return raf;
        }

        public void setRaf(String raf) {
            this.raf = raf;
        }
    }

