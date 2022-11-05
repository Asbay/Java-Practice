package day04_ifStatement;

import java.util.Scanner;

public class C04_ifStatement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen is unvaninizi giriniz");
        String jobTitel = input.nextLine().toLowerCase();

        if(jobTitel.equals("qa")){
            System.out.println("is unvani Quality Analyst");
        }else if(jobTitel.equals("dev")){
            System.out.println("Developer");
        }else if(jobTitel.equals("ba")){
            System.out.println("Business Analyst");
        }else if(jobTitel.equals("pm")){
            System.out.println("Project Manager");
        }


    }
}
