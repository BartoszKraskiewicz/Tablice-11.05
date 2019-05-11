package algorytmy;

public class BinarySearch {
    // na podstawie pseudokodu
    public boolean find(int[] A, int y) {
        int lewo = 0;
        int prawo = A.length - 1;
        int indeks = -1;

        while (lewo < prawo) {
            int srodek = (lewo + prawo) / 2;

            if (A[srodek] < y) {
                lewo = srodek + 1;
            } else {
                prawo = srodek;
            }
        }

        if (A[lewo] == y) {
            indeks = lewo;
            System.out.println("Znaleziono na indeksie: " + indeks);
            return true;
        } else {
            indeks = -1;
            System.out.println("Nie znaleziono :(");
            return false;
        }
    }


}
