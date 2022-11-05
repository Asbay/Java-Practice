package day03_ifStatement;

public class C02_AsciiDegerleri {

    public static void main(String[] args) {

        char harf = 'a';
        char harf2 = 'A';
        System.out.println("harf > harf2 ==>"+ (harf > harf2));
        //true verdi sonuc. Karsilastirma islemlerinin sonucu true yada false olarak döner...

        char space = ' ';
        System.out.println("Space in ASCII degeri : "+ (space+0 ));
        // spacein ASCII degernin hesaplamak icin toplamaya etkisi olmayan sifiri seceriz böylece ekrana
        // yazdirdigimiz deger spacein ASCII degerini verir.

        char m = 'm';
        System.out.println("m nin ASCII degeri : "+ (m + 0));
        //m nin ASCII degeri 109...

        //2.Yol
        //charlarda java char karaktere int atayabilir. Cünki charin bir resim karakteri birde matematiksel degeri vardir.
        // bu nedenle  ASCII degerlerimi hesaplayabiliriz
        int harf3 = 'm';
        System.out.println("m nin ASCII degeri = " + harf3 );

        byte b1 = 12;
        byte b2 = -125;

        System.out.println("b1>b2 ==> " + (b1>b2));


        float f1 = 2.45645f;
        float f2 = 5.86786F;
        System.out.println("f1>f2 ==>"+ (f1>f2));  //false
        System.out.println("b1 >f1 ==> "+ (b1 >f1));  // true

        long lng1 = 5456456464L;
        System.out.println("b1< lng1 ==> "+ (b1<lng1)); //true

        char ch = 'h';
        System.out.println("b1 >ch ==> "+ (b1> ch)); //false



    }
}
