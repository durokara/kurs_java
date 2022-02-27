package day03_scanner;

public class odev_sali {

    public static void main(String[] args) {

        int sayi1=10 , sayi2=20;
        System.out.println("Swaptan once sayi1: " + sayi1 + " sayi2: " + sayi2);

        sayi1= sayi1 + sayi2;
        sayi2= sayi1 - sayi2;
        sayi1= sayi1 - sayi2;

        System.out.println("Swaptan sonra sayi1: " + sayi1 + " sayi2: " + sayi2);






    }
}
