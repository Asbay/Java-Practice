package practice10;

public class Q02_Faktoriyel {

    public static void main(String[] args) {
        /*
        //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)
         */


    }
    public static int faktoriyel(int sayi){

        if(sayi==1){
            return 1;
        }else{
            return sayi* faktoriyel(sayi -1);
        }
    }
}
