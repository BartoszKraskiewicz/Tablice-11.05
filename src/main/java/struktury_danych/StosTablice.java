package struktury_danych;

public class StosTablice {
    private int[] tab;
    private int top;

    public StosTablice(int rozmiar) {
        tab = new int[rozmiar];
        top = -1;
    }

    public void push(int element) {
        if(isFull()){
            throw new ArrayIndexOutOfBoundsException("Stos jest pełen!");
        }
        //  top = top + 1;
        //  tab[top] = element;
        tab[++top] = element; //to samo, co zakomentowane!
    }

    public int pop() {
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException("Stos jest pusty!");
        }
        // int wartosc = tab[top];
        // top--;
        // return wartosc;
        return tab[top--]; //to samo, co zakomentowane!
    }

    public int peek() {
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException("Stos jest pusty!");
        }
        return tab[top];
    }

    public boolean isEmpty() {
        //return top == -1; - to samo, tylko sktórone, bo == i tak zwroci true/false
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull(){
        return top == tab.length -1;
    }


    public void pokaz(){
        for (int i = 0; i <= top; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }


}
