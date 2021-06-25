package de.iad.ef;

public class Main {

    public static void main(String[] args) {
	// AP
        Konto konto = new Konto("Rudi Ratlos");
        konto.buchung(200);
        System.out.println(konto.display());
    }
}
