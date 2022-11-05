package practice06;

public class Kitap {

    String kitapAdi, yazarAdi,seriNumarasi ;
    int sayfasayisi;
    static int kitapSayisi;

    Kitap(String kitapAdi, String yazarAdi, int sayfasayisi){
        this.kitapAdi=kitapAdi;
        this.yazarAdi=yazarAdi;
        this.sayfasayisi=sayfasayisi;
        seriNumarasi=kitapAdi.substring(0,2)+yazarAdi.substring(0,2)+kitapSayisi;
        kitapSayisi++;

    }
    public void kitapBilgileri(){
        System.out.println("Kitap Adi= "+ kitapAdi+ "\nYazar adi= "+yazarAdi+ "\nSayfa sayisi= "+sayfasayisi+ "\nSeri numarasi= "+ seriNumarasi);
        System.out.println("==============");
    }
}
