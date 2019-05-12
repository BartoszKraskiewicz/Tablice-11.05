package spoj;

import java.util.Scanner;

public class Main_NWD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();


        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int wynikDzielenia = resztaZDzielenia(a,b);
            System.out.println(wynikDzielenia);
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


