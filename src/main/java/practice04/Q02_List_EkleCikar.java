package practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleCikar {
     /*
Kullanıcdan aldığınız bir sayıyı bir list'e ekleyen,
list'ten çıkaran yada mevcut bir elementi o sayı ile güncelleyen bir kod yazınız.
 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        while(true){

            System.out.println("Ekleme yapmak icin 'add'\n" +
                    "Guncelleme yapmak icin 'update'\n" +
                    "Silmek icin 'delete'\n" +
                    "Cikmak icin 'quit' komutunu giriniz.");
            String option = input.next();

            if(option.equalsIgnoreCase("add")){
                System.out.println("Eklemek istediginiz sayiyi giriniz");
                int eklenenSayi = input.nextInt();
                list.add(eklenenSayi);
            }else if(option.equalsIgnoreCase("update")){
                System.out.println("Güncellemek istediginiz sayiyi giriniz");
                int güncellenecekSayi = input.nextInt();
                System.out.println("Girmek istediginiz yeni sayiyi giriniz");
                int yeniSayi = input.nextInt();
                list.set(list.indexOf(güncellenecekSayi), yeniSayi);
            }else if(option.equalsIgnoreCase("delete")){
                System.out.println("Silmek istediginiz sayiyi giriniz");
                int silinecekSayi = input.nextInt();
                list.remove((Integer)silinecekSayi);
            }else if(option.equalsIgnoreCase("quit")){
                break;
            }else {
                System.out.println("Gecerli bir kod giriniz");
            }
            System.out.println(list);
        }
        System.out.println("güle güle");
    }
}
