package practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q02_MarketGünlükGelir {

    /*
           Günlük gelir market programı yazınız.
     -Tüm günlerin gelirlerini gösteren bir method,
     -Haftalık gelir ortalamasını gösteren bir method,
     -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
     -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,
     */

    static List<String> günler = new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
    static List<Double> günlükGelirler =new ArrayList<>();
    static double toplamGelir =0;



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int gun =0;

        while(gun <7){
            System.out.println(günler.get(gun)+ " gelirini giriniz");
            double gününGeliri = input.nextDouble();
            günlükGelirler.add(gününGeliri);
            toplamGelir += gününGeliri;
            gun++;
        }
        System.out.println(günlükGelirler);
        System.out.println(toplamGelir);
        System.out.println("Gelir Ortalamasi " + gelirOrtalamasi());
        System.out.println("OrtalamaÜstüGünler "+ ortalamaÜstüGünler());
        System.out.println("Ortalama alti günler "+ ortalamaAltiGünler());

    }

    static double gelirOrtalamasi(){
        return toplamGelir /7;
    }

    static  String ortalamaÜstüGünler() {

        String str = "";
        for (int i = 0; i < günlükGelirler.size(); i++) {
            if (günlükGelirler.get(i) > gelirOrtalamasi()) {

                str += günler.get(i) + " ";
            }
        }
        return str;
    }

        static  String ortalamaAltiGünler(){

            String str1 = "";
            for (int i=0; i< günlükGelirler.size(); i++){
                if(günlükGelirler.get(i)< gelirOrtalamasi()){

                    str1 += günler.get(i)+" ";
                }
            }
            return str1;

        }
}
