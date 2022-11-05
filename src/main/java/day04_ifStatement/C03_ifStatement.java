package day04_ifStatement;

import java.util.Scanner;

public class C03_ifStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gün ismi giriniz");

       /* String gun = input.next().toLowerCase(); // girilenleri kücük harf yapar

       if(gun.equals("cuma")){
            System.out.println("Muslumanlar icin kutsal gün");
        }
        if(gun.equals("cumartesi")){
            System.out.println("Yahudiler icin kutsal gün");
        }if(gun.equals("pazar"){
            System.out.println("Hristiyanlar icin kutsal gün");
        }
        if(!gun.equals("cuma")&& !gun.equals("cumartesi")&&!gun.equals("pazar")){
            System.out.println("Kutsal gün degil...");
        }
         //2.Yol
        String gun = input.next();
        if(gun.equalsIgnoreCase("cuma")){
            System.out.println("muslumanlar icin kutsal gün");
        }
        if(gun.equalsIgnoreCase("cumartesi")){
            System.out.println("yahudiler icin kutsal gün");
        }
        if(gun.equalsIgnoreCase("pazar")){
            System.out.println("hristiyanlar icin kutsal gün");
        }
        if(!gun.equalsIgnoreCase("cuma")&& !gun.equalsIgnoreCase("cumartesi") && !gun.equalsIgnoreCase("pazar")){
            System.out.println("kutsal gün degil");
*/
            //3.yol
            String yeniGun=input.next().toLowerCase();
            if(yeniGun.equals("cuma")){
                System.out.println("Müslümanların kutsal günü");
            } else if (yeniGun.equals("cumartesi")) {
                System.out.println("Hristiyanların kutsal günü");
            }else if(yeniGun.equals("pazar")) {
                System.out.println("Yahudilerin kutsal günü");
            }else{
                System.out.println("kutsal gün degil");
            }


    }
}
