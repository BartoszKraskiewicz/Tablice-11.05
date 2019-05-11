package struktury_danych.stos;

public class StosLista {

    private StosElem top;

    public StosLista() {
        top = null;
    }

    public void push(int wartosc) {
        StosElem newElem = new StosElem(wartosc, top);
        top = newElem;
    }

    public int peek() throws StosPustyException{
        if (isEmpty()){
            throw new StosPustyException("Stos jest pusty dzbanie!");
        }
        return top.getValue();
    }

    public int pop() throws StosPustyException{
        if (isEmpty()){
            throw new StosPustyException("Stos jest pusty lamusie!");
        }

        int wartosc = top.getValue();
        top = top.getPrev();
        return wartosc;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void pokaz() {
        StosElem pointer = top;
        while (pointer != null){
            System.out.print(pointer.getValue() + " ");
            pointer = pointer.getPrev();
        }
        System.out.println();
    }

}

