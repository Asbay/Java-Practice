package practice05;

public class HacimHesapla {

    //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız)



    public int hacim(int a){
        return a*a*a;
    }
    public void hacim(int a, int b){
        System.out.println("Kare Prizma Hacim= "+ a*b*a);
    }
    public void hacim(int a, int b, int c){
        System.out.println("Dikdörtgenler Prizmasi Hacim= "+ a*b*c);
    }

   /*2.yol Return ile

    public int hacimHesapla(int a) {
        return a*a*a;
    }
    public int hacimHesapla(int a, int b) {
        return a*a*b;
    }
    public int hacimHesapla(int a, int b, int c) {
        return a*b*c;
    }*/
}
