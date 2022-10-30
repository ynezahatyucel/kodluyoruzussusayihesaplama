package Giris;
import java.util.Scanner;

public class ustluSayi {
    public static void main(String[] args) {
        int n,k;
        Scanner veri = new Scanner(System.in);

        System.out.println("Üssü alınacak sayıyı giriniz :");
        n= veri.nextInt();
        System.out.println("Üssünü giriniz");
        k= veri.nextInt();
        int total=1;

        for(int i =1 ; i<=k ;i++){

        total *= n;
        }
        System.out.println("Sonuç" + total);

    }}

