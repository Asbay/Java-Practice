package practice01;

public class Q03_Regex {
    public static void main(String[] args) {

        //Bir String değerin belirli sayıda karakter içerip belirli bir karakter ile bitip bitmediğini kontrol eden bir kod yazınız.
        String str = "!s";
        System.out.println(str.matches(".s"));//true ==> herhangi bir karakter ile başlayıp 's' harfi ile bitiyor.
//matches() methodu regex ile çalışıp String değerin regex ile karşılaştırmasını yapar.
        System.out.println(str.matches("..s"));//false ==> 3 karakterli olamadığı için

//Bir String değerin ikinci karakterinin belirli bir karakter olup olmadığını kontrol eden bir kod yazınız.
        System.out.println("&shgfh".matches(".s.*"));//true ==> ilk karakter herhangi biri, ikinci karakter 's'
//  .* ==> esnek sayıda karalter(0 yada daha fazla)
        System.out.println("&shgfh".matches(".r.*"));//false ==> ikinci karakter uyuşmuyor.

        //Bir String değerin sadece harf içerip içermediğini kontol eden bir kod yazınız.
        System.out.println();
        System.out.println("asedmnmnmkhk".matches("[a-zA-Z]*"));
        System.out.println("asedmnm!!khk".matches("[a-zA-Z]*"));
        System.out.println("abc".matches("\\w*"));//true
        //Bir String değerin belirli bir sayıda belirli karakterleri içerdiğini kontrol eden bir kod yazınız.
        System.out.println("abchd".matches("[a-zA-Z]{5}")); //true 5 tane harf iceriyor dogru
        System.out.println("abchdY".matches("[a-zA-Z]{5}")); //false 6 karakterli o yüzden false
        System.out.println("4bchd".matches("[a-zA-Z]{5}")); //false 5 karakterli ama harf disinda karakter iceriyor
        System.out.println();
//Bir String değerin belirli karakterleri en az belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("187645".matches("[0-9]{6,}"));  //true
        System.out.println("187345645".matches("[0-9]{6,}")); //true en az 6 rakam iceriyor dogru
        System.out.println("18764".matches("[0-9]{6,}")); // false 6 dan az karakter iceriyor

        System.out.println();
        //Bir String değerin belirli karakterleri en az ve en çok belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("abcd123xA".matches("\\w{7,10}")); // w demek [a-zA-Z0-9_] demek true aldik en fazla 10 karakter iceriyor
        System.out.println("abcd_23xA".matches("\\w{7,10}")); //true w nun icinde _ de var
        System.out.println();
        //Bir String değerin belirli karakterleri en az ve en çok belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("1?12345678".matches("[1][\\p{Punct}][0-9]{8}")); //true
        System.out.println("§?12345678".matches(".[\\p{Punct}][0-9]{8}"));  //true




    }
}
