package studentpractice;

import java.util.Scanner;

public class HackerLanguage {

    /*
    kullanicinin yazdigi metni hackerdiline ceviren kodu yaziniz. hackerlar genlede harfleri sayilara cevirerek anlasiyorlar,
    s-->5
    a->4
    e->3
    i->1
    o->0
    java ile hersey güze --> j4v4 1l3 h3rs3y guzel
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle = input.nextLine().toLowerCase();

        hackerdili(cumle);
    }

    private static void hackerdili(String cumle) {
        String [] arr= new String[cumle.length()];

        for(int i=0; i< cumle.length() ; i++){
            arr[i]= cumle.substring(i,i+1);

            if(arr[i].contains("s")){
                arr[i]="5";
            }
            if(arr[i].contains("a")){
                arr[i]="4";
            }
            if(arr[i].contains("e")){
                arr[i]="3";
            }
            if(arr[i].contains("i")){
                arr[i]="1";
            }
            if(arr[i].contains("o")){
                arr[i]="0";
            }
            System.out.print(arr[i]);
        }





    }
}
