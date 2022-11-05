package practice04;

public class Q07_Artirma_Azaltma {


    public static void main(String[] args) {

        int x = 20;
        int y =15;


        System.out.println(x);//20
        System.out.println(x++ + ++y);//36
        System.out.println(x);//21

        int z =5;
                    //6   6     7    7      7    6
        int sonuc = ++z + z++ + z++ + --z +  z-- +z;
        System.out.println(sonuc);
    }
}