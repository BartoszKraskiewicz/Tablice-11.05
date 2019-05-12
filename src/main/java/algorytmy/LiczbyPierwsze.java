package algorytmy;

import java.util.Arrays;

public class LiczbyPierwsze {// sito Eratostenesa

    private boolean[] sito;

    public void utworzSito(int rozmiar) {
        sito = new boolean[rozmiar];
        Arrays.fill(sito, true);// uzupełnia całą tablicę wartościami true

        sito[0] = false;//dla "0" ustawiamy false
        sito[1] = false;//...i dla "1" ustawiamy false, bo iterować będziemy dopiero od dwójki

        for (int i = 2; i < rozmiar; i++) {
            // sprawdz czy pierwsza, jeżeli tak to jej wielokrotności ustaw na false
            if (sito[i] == true) {
                for (int j = i + i; j < rozmiar; j = j + i) {
                    sito[j] = false;
                }
            }
        }
        for (int i = 0; i < rozmiar; i++) {
            System.out.println(i + ": " + sito[i]);
        }
    }

    public boolean czyPierwszaPrzezSito(int liczba){
        return sito[liczba];
    }


}


