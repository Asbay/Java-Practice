package day07_stringmanipulation;

public class C04_StringManipulationsStartsWith {
    /**
     * startsWith()
     *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
     *
     * endsWith()
     * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
     */
    public static void main(String[] args) {

        String cumle= "Kazananlar hic hata yapmayanlar degil, vazgecmeyenlerdir..";

        // Ka ile basliyor mu ?/**
        // * startsWith()
        // *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
        // *
        // * endsWith()
        // * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
        // */
        System.out.println(cumle.startsWith("Ka"));

        //dir ile bitiyor mu?
        System.out.println(cumle.endsWith("dir"));
    }
}
