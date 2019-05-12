package struktury_danych;

import algorytmy.*;
import struktury_danych.kolejka.KolejkaLista;
import struktury_danych.lista.Lista;
import struktury_danych.stos.StosLista;
import struktury_danych.stos.StosPustyException;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //wywolajStosTablice();
        //wywolajStosLista();
        // wywolajKolejkaLista();
        //new ONP().uruchom();
        //wywolajLista();
        //wywolajBinarySearch();
        //wywolajNWD();
        //wywolajNWW();
        //wywolajLiczbyPierwsze();
        wywolajSilnie();

    }

    public static void wywolajSilnie(){
        Silnia silnia = new Silnia();
        int wynik = silnia.rekurencyjnie(5);
        System.out.println("Wynik silni: " + wynik);
    }

    public static void wywolajLiczbyPierwsze(){
        int rozmiar = 1200;
        LiczbyPierwsze liczbyPierwsze = new LiczbyPierwsze();
        liczbyPierwsze.utworzSito(rozmiar);

        System.out.println(liczbyPierwsze.czyPierwszaPrzezSito(5));
        System.out.println(liczbyPierwsze.czyPierwszaPrzezSito(111));
        System.out.println(liczbyPierwsze.czyPierwszaPrzezSito(148));
        System.out.println(liczbyPierwsze.czyPierwszaPrzezSito(997));
    }

    public static void wywolajNWW(){
        int a = 12244556;
        int b = 22334;
        int wynik = NWW.oblicz(a, b);
        System.out.println("Wynik NWW: " + wynik);

    }

    public static void wywolajNWD() {
        NWD nwd = new NWD();
        int a = 12244556;
        int b = 22334;

        int wynik = nwd.odejmowanie(a, b);
        System.out.println("PRZEZ ODEJMOWANIE - najwiekszy wspólny dzielnik dla liczb " + a + " oraz " + b + " to: " + wynik);

        int wynikDzielenia = nwd.resztaZDzielenia(a, b);
        System.out.println("PRZEZ RESZTĘ Z DZIELENIA - najwiekszy wspólny dzielnik dla liczb " + a + " oraz " + b + " to: " + wynikDzielenia);


    }

    public static void wywolajBinarySearch() {
        int tab[] = new int[20];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = i;
        }
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.find(tab, 35);
    }


    public static void wywolajLista() {
        Lista lista = new Lista();

        lista.addLast(1);
        lista.addLast(2);
        lista.addLast(3);
        lista.addLast(4);


        lista.show();

        lista.addFirst(4);

        lista.show();

        lista.peekLast();

        lista.pollLast();
        lista.pollLast();

        lista.show();

        lista.pollFirst();

        lista.show();


        lista.showReverse();


    }


    public static void wywolajStosTablice() {
        Scanner scanner = new Scanner(System.in);
        int rozmiar;
        StosTablice stos;

        System.out.println("Podaj rozmiar stosu");
        rozmiar = scanner.nextInt();

        stos = new StosTablice(rozmiar);

        while (true) {
            System.out.println("Wybierz: 1. push. 2. pop. 3. peek. 4. isEmpty. 5. pokaż. 0. wyjście");
            int num = scanner.nextInt();

            switch (num) {
                case 0:
                    System.out.println("Koniec działania programu");
                    return;
                case 1:
                    try {
                        System.out.println("Podaj wartość na stos: ");
                        int wartosc = scanner.nextInt();
                        stos.push(wartosc);
                        stos.pokaz();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Wartosc pobrana ze stosu: " + stos.pop());
                        stos.pokaz();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Wartosc z podgladu: " + stos.peek());
                        stos.pokaz();
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Czy stos jest pusty? " + stos.isEmpty());
                    break;
                case 5:
                    stos.pokaz();
                    break;
                default:
                    System.out.println("Niepoprawna operacja!");
            }


        }

    }

    public static void wywolajStosLista() {
        StosLista stosLista = new StosLista();

        stosLista.push(1);
        stosLista.push(2);
        stosLista.push(3);
        System.out.println("Po pushach: ");
        stosLista.pokaz();

        stosLista.pop();
        stosLista.pop();
        System.out.println("Po popach: ");
        stosLista.pokaz();

        stosLista.peek();
        System.out.println("Po peekach: ");
        stosLista.pokaz();

        stosLista.push(5);
        System.out.println("Nowy push:");
        stosLista.pokaz();

        try {
            stosLista.pop();
            stosLista.pop();
            stosLista.pop();
            stosLista.pop();
        } catch (StosPustyException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void wywolajKolejkaLista() {
        KolejkaLista kolejkaLista = new KolejkaLista();

        kolejkaLista.add(1);
        kolejkaLista.add(2);
        kolejkaLista.add(3);
        System.out.println("Po addach:");
        kolejkaLista.pokaz();

        kolejkaLista.poll();
        kolejkaLista.poll();
        System.out.println("Po pollach:");
        kolejkaLista.pokaz();

        System.out.println("Po peeku: " + kolejkaLista.peek());
        kolejkaLista.pokaz();

    }
}
