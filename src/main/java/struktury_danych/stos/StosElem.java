package struktury_danych.stos;

public class StosElem {

    private int value;

    private StosElem prev;

    //teraz wjeżdża konstruktor
    public StosElem(int value, StosElem prev) {
        this.value = value;
        this.prev = prev;
    }

    public StosElem getPrev() {
        return prev;
    }

    public int getValue() {
        return value;
    }
}
