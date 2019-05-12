package spoj;

import java.util.Scanner;

public class Main_NWD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//wczytuję liczbę prób
        int t = scanner.nextInt();


        for (int i = 0; i < t; i++) {// for wykonuje się tyle razy ile wczytało powtórzeń ze scannera
            int a = scanner.nextInt();// wczytuję a i b
            int b = scanner.nextInt();
            int wynikDzielenia = resztaZDzielenia(a,b);// wykonuję na nich działania (metody poniżej)
            System.out.println(wynikDzielenia);// wypluwam wyniki na ekran
        }

    }

    public static int resztaZDzielenia(int a, int b) {

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}


