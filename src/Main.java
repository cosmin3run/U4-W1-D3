import Entities.Rettangolo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizi pomeridiano D3");
        System.out.println("ESERCIZIO 1");
        Rettangolo rettangolo1 = new Rettangolo(10,10);
        Rettangolo rettangolo2 = new Rettangolo(10, 10);
        System.out.println("Rettangolo 1 ");
        rettangolo1.stampaRettangolo();
        System.out.println("Rettangolo 2 ");
        rettangolo2.stampaRettangolo();

        System.out.println("Rettangoli insieme");

        double areeRettangoli = rettangolo1.calcoloArea() + rettangolo2.calcoloArea();
        double perimetriRettangoli = rettangolo1.calcoloPerimetro() + rettangolo2.calcoloPerimetro();
        System.out.println("L'area dei due rettangoli insieme è: " + areeRettangoli);
        System.out.println("Il perimetro dei due rettangoli insieme è: " + perimetriRettangoli);

    }
}