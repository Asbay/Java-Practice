package practice03;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q04_DoWhile_TopunSicramasi {

    /*
 Bir top belirli yükseklikten atılmaktadır.
 Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
 Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
 Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.
 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Birakilan yüksekligi giriniz..");
        double yükseklik = input.nextDouble();
        double toplamYol=0;
        int vurmaSayisi=0;

        do{
            vurmaSayisi++;
            toplamYol += yükseklik;
            yükseklik = yükseklik* 0.75;
            toplamYol += yükseklik;
        } while(yükseklik>1);

        System.out.println("Yere vurma sayisi = "+ vurmaSayisi);
        System.out.println("Toplam alinan yol = "+ toplamYol);

        NumberFormat numberFormat = new DecimalFormat(".#");
        System.out.println(numberFormat.format(toplamYol));

    }
}
