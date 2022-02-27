package day03_scanner;

import java.util.Scanner;

public class ScannerPratik1 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Iki TamSayi Giriniz : ");
        int Tamsayi1=scan.nextInt();
        int Tamsayi2= scan.nextInt();

        System.out.println("Girdiginiz Tamsayilar:" + Tamsayi1 + " " + Tamsayi2);
        System.out.println("Toplam: " + (Tamsayi1 + Tamsayi2));
        System.out.println("Fark: " + ( Tamsayi1 - Tamsayi2 ));
        System.out.println("Carpim: " + (Tamsayi1 *Tamsayi2));



    }
}
