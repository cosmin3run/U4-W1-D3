package Entities;

public class Rettangolo {

    private final double altezza;
    private final double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double calcoloArea() {
        return altezza * larghezza;
    }

    public double calcoloPerimetro() {
        return 2 * (altezza + larghezza);
    }

    public void stampaRettangolo() {
        System.out.println("Area: " + calcoloArea());
        System.out.println("Perimetro: " + calcoloPerimetro());
    }


}
