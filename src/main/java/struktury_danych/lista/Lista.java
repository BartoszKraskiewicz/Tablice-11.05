package struktury_danych.lista;

public class Lista {

    private ElemLista first;
    private ElemLista last;

    public Lista() {
        first = last = null;
    }

    public void addFirst(int value) {
        ElemLista newElem = new ElemLista(value);

        if (first == null) {// jeżeli lista jest pusta
            first = last = newElem;
        } else {// jeżeli jakieś elementy juz sa w liscie
            newElem.setNext(first);
            first.setPrev(newElem);
            first = newElem;
        }

    }

    public void addLast(int value) {
        ElemLista newElem = new ElemLista(value);
        if (last == null) {// jeżeli lista jest pusta
            last = first = newElem;
        } else {// jeżeli jakieś elementy juz sa w liscie
            last.setNext(newElem);
            newElem.setPrev(last);
            last = newElem;
        }
    }

    public int peekFirst() {
        //TODO if null then exception
        return first.getValue();
    }

    public int peekLast() {
        //TODO if null then exception
        return last.getValue();
    }

    public int pollFirst() {
        //TODO if null then exception

        int value = first.getValue();// zapamietanie wartosci z firsta zanim stracimy do niego referencję
        first = first.getNext();// ustawiamy nowego firsta, który jest zawsze następnikiem

        if (first == null) {// jeżeli lista staje się pusta, musimy tez zaktualizowac lasta o null
            last = null;
        } else {
            first.setPrev(null);// usuwamy refrencję do poprzednika (bo usuwamy temten element) i wrzucamy za niego nulla
        }

        return value;
    }

    public int pollLast() {// analogicznie do pollFirst
        //TODO if null then exception

        int value = last.getValue();
        last = last.getPrev();// ustawiamy nowego lasta, który jest zawsze poprzednikiem

        if (last != null) {
            last.setNext(null);
        } else {
            // last == null, lista zaczyna byc pusta, zatem musimy także zaktualizować firsta o nulla
            first = null;
        }
        return value;
    }

    public boolean isEmpty() {
//        if (first == null){
//            return true;
//        }else{
//            return false;
//        }
        return first == null;// to samo, co wyżej, tylko krócej
    }

    public void show() {
        ElemLista pointer = first;// tworzymy pointer, zeby przypisywać do niego wartości, a nie modyfikować wartosci
        while (pointer != null) {
            System.out.print(pointer.getValue() + " ");
            pointer = pointer.getNext();
        }
        System.out.println("-- KONIEC");
    }

    public void showReverse() {
        ElemLista pointer = last;
        while (pointer != null) {
            System.out.print(pointer.getValue() + " ");
            pointer = pointer.getPrev();
        }
        System.out.println("-- POCZĄTEK");
    }

    public ElemLista search(int value) {// wyszukiwanie w liscie konkretnej wartosci
        ElemLista pointer = first;

        while (pointer != null) {
            if (pointer.getValue() == value) {
                return pointer;
            }
            pointer = pointer.getNext();

        }
        return null;// nie znaleziono szukanej wartości
    }

    public boolean contains(int value) {// sprawdzanie, czy lista zawiera jakąś wartość
        ElemLista found = search(value);
//        if(found!=null){
//            return true;
//        }else{
//            return false;
//        }
        return search(value) != null;// to same co wyżej, ale krócej
    }

    // true - jeśli znaleziono i usunieto element o wskazanej wartości; false - jeżeli nie znaleziono
    public boolean remove(int value) {
        ElemLista found = search(value);

        if (found == null) {// jeżeli nie znaleziono elementu o wskazanej wartosci
            return false;
        }
        if (found == first) {// jeżeli wskazana wartosc jest firstem
            pollFirst();
        } else if (found == last) {// jeżeli wskazana wartosc jest lastem
            pollLast();
        } else {// jeżeli element jest gdzies pomiedzy first a last; aktualizujemy referencje w obie strony
            found.getPrev().setNext(found.getNext());// pobieramy poprzednika i ustawiamy jego nstępnika poprzez nastepnika znalezionego
            found.getNext().setPrev(found.getPrev());
        }
        return true;


    }


}