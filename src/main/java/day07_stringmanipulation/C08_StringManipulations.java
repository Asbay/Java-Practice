package day07_stringmanipulation;

public class C08_StringManipulations {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan email adresini girmesini isteyin,
// mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
// @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
// @gmail.com ile bitmiyorsa "lutfen yazimı kontrol edin" yazdırın

        String email = "abc@gmail.com";
        String arananMetin = "@gmail.com";

        if (!email.contains(arananMetin)){

            System.out.println("Lutfen gmail adresinizi giriniz");

        }else if (email.endsWith(arananMetin)){
            System.out.println("Email adresiniz kaydedildi ");
        }else
            System.out.println("lutfen yazimı kontrol edin");


        /*
       Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                   i)En az 8 character icermeli
                   ii)Space characteri icermemeli
                   iii)Buyuk harf icermemeli
                   iv)Son characteri "." olmali

*/

    }
}
