package practice05;

public class Hacim {

    public static void main(String[] args) {

        HacimHesapla hacim = new HacimHesapla();

        hacim.hacim(2,3,7);
        hacim.hacim(2);
        int küp= hacim.hacim(5);  //return ile olursa böyle
        System.out.println(küp);
        hacim.hacim(5,6);



    }
}
