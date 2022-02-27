package day03_scanner;

import java.util.Scanner;

public class ScannerPratik2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Karenin Kenar Uzunlugunu Giriniz:");
        int KenarUzunlugu = scan.nextInt();
        System.out.println("karenin cevresi:" + (4*KenarUzunlugu));
        System.out.println("karenin alani:" + ( 2*KenarUzunlugu));

    }
}
