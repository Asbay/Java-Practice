package day06_nestedifswitch;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        /*
TASK :
 Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
 Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
 3 basamaklı degilse çift olup olmadigini kontrol edin.
 Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
 */
        Scanner input = new Scanner(System.in);
        System.out.println(" 0 dan büyük pozitif bir tam sayi giriniz...");
        int sayi = input.nextInt();
        System.out.println();
       /*  System.out.println("Ternary");

        String sonuc=(sayi>0)  ? (sayi>99 && sayi<1000) ? ("3 basamakli 0 dan büyük sayi"):
                (sayi%2 ==0) ? ("3basamakli olmayan cift sayi") : ("3 basamakli olmayan tek sayi") :
                "Lutfen sifirdan büyük bir sayi giriniz";

        System.out.println(sonuc);

*/
        System.out.println("if else");
        if(sayi>0){
            if(sayi<1000 && sayi>99){
                System.out.println("3 Basamakli sayi");
            }else if (sayi %2==0){
                System.out.println("3 basamakli olmayan cift sayi");
            }else
                System.out.println("3 basamakli olmayan tek sayi");
        }else
            System.out.println("lutfen sifirdan buyuk pozitif bir tamsayi giriniz");

    }
}
