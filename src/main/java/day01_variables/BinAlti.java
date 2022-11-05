package day01_variables;

public class BinAlti {

    public static void main(String[] args) {

     int toplam=0;

        for(int i =1; i<=1000 ; i++) {

            if(i%3==0 || i%5==0){
                toplam = toplam +i;
                System.out.print(i+ " ");
            }


        }
        System.out.println();
        System.out.println(toplam);
    }
}
