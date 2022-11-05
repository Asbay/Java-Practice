package practice05;

public class HesapMakinesi {

    public void toplama(int... a) {
        int toplam = 0;

        for (int w : a) {
            toplam += w;
        }
        System.out.println("Toplam= " + toplam);


    }

    public void cikarma(int a, int b) {
        System.out.println("Fark= " + (a - b));
    }

    public void carpma(int... a) {
        int carpim = 1;
        for (int w : a) {
            carpim *= w;
        }
        System.out.println(carpim);
    }

    public void bölme(double a, double b) {
        if (b == 0) {
            System.out.println("Bölen sayi o olamaz");
        } else {
            System.out.println("Bölüm= " + a/b);
        }
    }
    //System.out.println("Bölüm = "+new DecimalFormat("##.##").format(a/b));

    /* SINIRSIZ SAYIDA SAYI CIKARTMAK ICIN METHOD
    public static double subtract(int... a){
    int sub = a[0];

    for (int w : a){
        if (w == a[0]) continue;
        sub -= w;
    }
    System.out.println("Result: " + sub);
    return sub;
}
     */
}