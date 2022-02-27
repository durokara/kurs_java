package day04_dataCasting_Increment;

import java.util.Scanner;

public class Alistirma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        char ilkHarf= scan.next().charAt(0);
        System.out.println("Girdiginiz ismin ilk harfi:" + ilkHarf );

    }
}
