package day03_ifStatement;

public class C04_MantikOperatorleri {

    public static void main(String[] args) {

        System.out.println( 5+2==8); // false
        boolean sonuc1 = 5>4 && 7<9 && 6+3==9 && 5+2!=8 ;
        System.out.println("sonuc1 ==>"+ sonuc1); // true

        boolean sonuc2 = 5>4 & 7>9 & 6+3==9 & 5+2!=8;
        System.out.println("sonuc2 = "+ sonuc2);  //false

        int sayi1 =15;
        //sayi1 in 10 ile 20 araliginda oldugunu true diyerek dondurelim.
        // 10<sayi1<20 Java üclu karsilastirma yapmaz
        //ikili karsilastirmalar yapip mantiksal operatorler ile birlestirmeliyiz

        System.out.println( 10<sayi1 && sayi1<20);   // true

        int sayi2 = 5 ;
        //sayi2 nin 10 ile 20 nin arasinda olmadigini true diyerek donduren bir kod yaziniz.
        System.out.println("sayi2 10 ile 20 arasinda degildir : "+ (sayi2<10 || sayi2< 20));  //true
        System.out.println(sayi2<10 || sayi2>20);  //true

        // && = ve         || =  veya
    }
}
