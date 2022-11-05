package day04_ifStatement;

public class C02_ifStatement {
    public static void main(String[] args) {

        /*
 Ogrenci asagidaki gibi notlar aldiginda karsisindaki degerleri yazdiran bir kod yaziniz
              not hesaplayici
           90 ~100 => A  Cok Iyi
           80 ~ 89 => B  Iyi
           70 ~ 79 => C  Orta
           60 ~ 69 => D  Gecer
           0 ~ 59  => F  Zayif
*/

        int not = 65;

        if(not>=90 && not<= 100){
            System.out.println("cok iyi");
        }else if (not>=80 && not <= 89){
            System.out.println("iyi");
        }else if(not>=70 && not <= 79){
            System.out.println("0rta");
        }else if (not>=60 && not <=69){
            System.out.println("Gecer");
        }else if(not>=0 && not<=59){
            System.out.println("Zayif");
        }else{
            System.out.println("Gecerli not degil");
        }
    }
}
