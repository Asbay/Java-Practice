package practice05;

import java.time.LocalDate;

public class Market {

    String ürünAdi;
    double ürünFiyati;
    String sonKullanmaTarihi;
    static int toplamÜrün;

    Market(String ürünAdi,double ürünFiyati, int aySonra){

        //iki farkli yazim tarzi var this ile veya this olmadan iki farkli isimle olabilir

        this.ürünAdi = ürünAdi;
        this.ürünFiyati = ürünFiyati;
       sonKullanmaTarihi= LocalDate.now().plusMonths(aySonra).toString();
        toplamÜrün++;
    }
    Market(String ürünIsmi, double fiyat){

        ürünAdi= ürünIsmi;
        ürünFiyati = fiyat;
        sonKullanmaTarihi =" Son kullanma tarihi yoktur";

    }
}
