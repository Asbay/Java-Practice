package practice04;

public class Q05_StringBuilderPalindrome {

    //Bir String değerin Palindrome olup olmadığını kontrol eden bir kos yazınız.
    public static void main(String[] args) {

        String str = "nazan";
        String reverseStr = "";

        for(int i = str.length()-1; i> -1 ; i--){
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " Polindrome");
        }
        else {
            System.out.println(str + " Palindrome degildir");
        }

        System.out.println("++++++++++++");
        StringBuilder sb = new StringBuilder("nazan");
        String sbReverse = String.valueOf(sb.reverse());
        System.out.println(sb);
        System.out.println(sbReverse);

        if(sb.equals(sbReverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Palindrome degil");
        }

        }
    }

