package javapracticeeskiler;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBuyukElemanKuyukElemanFarkiniBul {
    /*
    Kullanicinin girdigi bir arrayin en büyük elemani ile en kücük elemaninin farkini bulma
     */

    public static void main(String[] args) {
        
        farkinibul();
    }

    private static void farkinibul() {

        Scanner input = new Scanner(System.in);
        System.out.print("Array uzunlugunu giriniz : ");
        int uzunluk = input.nextInt();
        int arr [] = new int[uzunluk];


        for (int i =0; i<uzunluk; i++){
            System.out.println("Arrayin "+ (i+1) + ". elemanini giriniz: ");
            arr[i]= input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("ARRAYDEKI EN BÜYÜK ELEMAN ILE EN KÜCÜK ELEMAN ARASINDAKI FARK. "+ (arr[uzunluk - 1] - arr[0]));
    }
}
