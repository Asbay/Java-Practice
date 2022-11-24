package personal;

import java.util.Scanner;

public class Metot extends Tanimlar {

    private Scanner scan = new Scanner(System.in);

    public void selectOption() {

        System.out.println("Personal bilgi sayfasina hosgeldiniz");

        do {
            System.out.println("Hangi islemi yapmak istiyorsunuz? \n 1: Yeni Kayit 2: Kayit Görme  3: Kayit Silme  4: Exit");

            int secenek = scan.nextInt();
            switch(secenek){
                case 1: kayitYap();
                break;
                case 2: kayitGorme();
                break;
                case 3: kayitSilme();
                break;
                case 4:
                    System.out.println("güle güle");
                    setFlag(false);
                    break;
                default:
                    System.out.println("gecersiz secim yaptiniz");
            }




        }while(isFlag());
    }
int counter=0;
    private void kayitSilme() {
        System.out.println("Silmek istediginiz kisinin id numarasini giriniz");
        String yeniid= scan.next();
        if( getListe().containsKey(yeniid)){
           getListe().remove(yeniid);
        }else {
            System.out.println("Bu id ye sahip bir kullanici bulunmamaktadir");
            counter++;
            if(counter==3){
                System.out.println("ust uste 3 defa hatali girdiniz güle güle");
                selectOption();
            }else
            kayitSilme();
        }
    }


    private void kayitGorme() {
        System.out.println("görmek istediginiz kisinin id numarasini giriniz");
        String yeniid= scan.next();
        if( getListe().containsKey(yeniid)){
            System.out.println(getListe().get(yeniid).getName()+  " "+ getListe().get(yeniid).getAdres()+" "+ getListe().get(yeniid).getTelno());
        }else System.out.println("Bu id ye sahip bir kullanici bulunmamaktadir");
    }

    private void kayitYap() {

        System.out.println("Kayit sayfasina Hosgeldiniz");
        System.out.println("IDnumaranizi giriniz");
        setId(scan.next());

        if(!getListe().containsKey(getId())){
            System.out.println("Adinizi yaziniz");
            String ad= scan.next();
            System.out.println("soyadinizi yaziniz");
            String soyad= scan.next();
            setName(ad+ " "+ soyad);
            System.out.println("Telefon numaranizi giriniz");
            setTelno(scan.next());
            System.out.println("yasadiginiz sehri giriniz");
            setAdres(scan.next());
            getListe().put(getId(), new Tanimlar(getName(), getAdres(), getTelno()));



        }else System.out.println("zaten bu id daha önce kullanilmis");

    }
}