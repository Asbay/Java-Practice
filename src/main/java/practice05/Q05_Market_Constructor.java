package practice05;

public class Q05_Market_Constructor {

    //Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız..

    public static void main(String[] args) {

        Market ürünObjesi = new Market("Ekmek", 5,1);
        System.out.println(ürünObjesi.ürünAdi);
        System.out.println(ürünObjesi.sonKullanmaTarihi);
        System.out.println(ürünObjesi.ürünFiyati);

        Market nutellaObjesi = new Market("Nutella",45,20);
        System.out.println("Ürün adi= "+ nutellaObjesi.ürünAdi + " Ürün fiyati= "+ nutellaObjesi.ürünFiyati+ " Son kullanma tarihi= "+ nutellaObjesi.sonKullanmaTarihi);


        Market bardakObjesi = new Market("Bardak", 50);
        System.out.println("Ürün adi= "+ bardakObjesi.ürünAdi+  " Ürünfiyati= "+ bardakObjesi.ürünFiyati + " Son kullanma tarihi= "+ bardakObjesi.sonKullanmaTarihi);

    }
}
