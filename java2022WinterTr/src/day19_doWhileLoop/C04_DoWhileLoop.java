package day19_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        //Kullanicidan toplamak uzere pozitif sayilar isteyin,
        // islemi bitirmek icin 0’a basmasini soyleyin.
        // Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        //ve “Negatif sayi giremezsiniz” yazdirip basa donun
        //Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        // yanlislikla kac negative sayi girdigini ve
        // girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        int sayi = 10000;
        int toplam = 0;
        int sayacPozitif=0;
        int sayacNegatif=0;



        do {
            System.out.println("Lütfen pozitif bir tam sayi girin bitirmek icin 0'a basin");
            sayi = scan.nextInt();
            if (sayi < 0) {
                System.out.println("Negatif sayi giremezsiniz");
                sayacNegatif++;
            } else if (sayi > 0) {
                toplam += sayi;
                sayacPozitif++;
            }
        } while (sayi != 0);
        System.out.println("Yanlislikla girilen negatif sayi adedi:" + sayacNegatif );
        System.out.println("girilen pozitif sayilarin toplami:" + toplam);








    }
}
