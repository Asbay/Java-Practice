package practice09.Q03_AbstractionAlanHesaplama;

public class Runner {
    //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)


    public static void main(String[] args) {


        Ucgen ucgen = new Ucgen();
        System.out.println(ucgen.alanHesapla(4,2));
        Dikdörtgen dikdortgen = new Dikdörtgen();
        System.out.println(dikdortgen.alanHesapla(5,4));
    }
}