package practice10;

public class Q04_Ramdom_AdOlusturma {

    //Rastgele alınan harfleri bir Stringe ekleyerek adınızı oluşturan ve bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.

    public static void main(String[] args) {

        String alfabe="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        int maxIdx = alfabe.length();
        String isim= "Ali";
        String yeniIsim ="";
        int sayac=0;
        for(int i=0;i<isim.length();i++){
            while (true){
                char rastgeleKarakter = alfabe.charAt((int)(Math.random()*maxIdx));
                sayac++;
                if(isim.charAt(i)==rastgeleKarakter){
                    yeniIsim += rastgeleKarakter;
                    System.out.println("yeniIsim = " + yeniIsim);
                    break;
                }
            }
        }
        System.out.println("yeniIsim = " + yeniIsim);
        System.out.println("sayac = " + sayac);
    }
    }

