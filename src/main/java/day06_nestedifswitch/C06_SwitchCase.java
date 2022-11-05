package day06_nestedifswitch;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        //Ex: Girilen Pozitif 3 basamaklı bir sayıyı yazı ile yazdırınız
//Ex : 568
//Besyuzaltmissekiz


        Scanner input =new Scanner (System.in);
        System.out.println("Lutfen pozitif 3 basamakli bir sayi giriniz");
        int sayi = input.nextInt();

        int birlerBasamagi= (sayi %10 );
        int onlarBasamagi = (sayi/10) % 10;
        int yüzlerBasamagi = (sayi/100);

        if(sayi>99 && sayi<1000) {
            //100ler basamagi
            switch(yüzlerBasamagi) {
                case 0:
                    System.out.print("");
                    break;
                case 1:
                    System.out.print("yüz");
                    break;
                case 2:
                    System.out.print("ikiyüz");
                    break;
                case 3:
                    System.out.print(" ücyüz");
                    break;
                case 4:
                    System.out.print("Dörtyüz");
                    break;
                case 5:
                    System.out.print("Besyüz");
                    break;
                case 6:
                    System.out.print("Altiyüz");
                    break;
                case 7:
                    System.out.print("Yediyüz");
                    break;
                case 8:
                    System.out.print("Sekizyüz");
                    break;
                case 9:
                    System.out.print("Dokuzyüz");
                    break;
            }
                    // 10 Lar Basamagi
                switch(onlarBasamagi){

                    case 0 :
                        System.out.print("");
                        break;
                    case 1 :
                        System.out.print("on");
                        break;
                    case 2 :
                        System.out.print("yirmi");
                        break;
                    case 3 :
                        System.out.print("otuz");
                        break;
                    case 4 :
                        System.out.print("kirk");
                        break;
                    case 5 :
                        System.out.print("elli");
                        break;
                    case 6 :
                        System.out.print("altmis");
                        break;
                    case 7 :
                        System.out.print("yetmis");
                        break;
                    case 8 :
                        System.out.print("seksen");
                        break;
                    case 9 :
                        System.out.print("doksan");
                        break;
                }
                switch(birlerBasamagi){
                    case 0 :
                        System.out.print("");
                        break;
                    case 1 :
                        System.out.print("bir");
                        break;
                    case 2 :
                        System.out.print("iki");
                        break;
                    case 3 :
                        System.out.print("üc");
                        break;
                    case 4 :
                        System.out.print("dört");
                        break;
                    case 5 :
                        System.out.print("bes");
                        break;
                    case 6 :
                        System.out.print("alti");
                        break;
                    case 7 :
                        System.out.print("yedi");
                        break;
                    case 8 :
                        System.out.print("sekiz");
                        break;

                    case 9 :
                        System.out.print("dokuz");
                        break;


                }



            }
        }


    }

