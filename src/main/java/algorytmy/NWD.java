package algorytmy;

public class NWD { // implementacja algorytmu Euklidesa

    public int odejmowanie(int a, int b) {

        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    static public int resztaZDzielenia(int a, int b) {

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}



