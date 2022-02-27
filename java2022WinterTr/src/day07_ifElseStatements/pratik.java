package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class pratik {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi=scan.next().toLowerCase();


        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println("girdiginiz gun haftasonu");

        }  else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali")) ||

    }
}
