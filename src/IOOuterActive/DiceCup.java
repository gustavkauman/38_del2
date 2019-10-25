package IOOuterActive;

public class DiceCup {

    // Attributes
    private final Die t1;
    private final Die t2;
    private int outcome1, outcome2;

    // Kontruktør. Laver to terninger.
    public DiceCup() {
        t1 = new Die();
        t2 = new Die();
    }

    // Metoder. Slår de to terninger, med metoden "roll" fra "Terning"-klassen.
    public void throwDice() {
        outcome1 = t1.roll();
        outcome2 = t2.roll();
    }

    //lægger de to facevalues sammen og gemmer dem som sum
    public int getSum() {
        return outcome1 + outcome2;
    }


    // Returnere en tekst med værdien af terningernes rul.
    public String toStringOutcome() {
        return "Terning 1: " + outcome1 + "\n" + "Terning 2: " + outcome2 + "\n";
    }

/////////////////// Bruges ikke i dette projekt/////////////////////
//    // Tjekker om der er slået to ens værdier. Returnere boolean.
//    public boolean checkIfEqualNotOneSix() {
//        return (outcome1 == outcome2 && outcome1 != 1 && outcome1 != 6);
//    }
//
//    //Tjekker om terningerne har slået to ettere. Returnere boolean.
//    public boolean checkIfDoubleOne() {
//        return (outcome1 == 1 && outcome2 == 1);
//    }
//
//    // Tjekker om terningerne har slået to seksere
//    public boolean checkIfDoubleSix() {
//        return (outcome1 == 6 && outcome2 == 6);
//    }
//
//    public boolean checkIfEqual() {
//        return (outcome1 == outcome2);
//    }

    // Sætter værdien af udfaldende til den ønskede værdi -------------HUSK AT SLETTE
    public void setUdfald(final int die1, final int die2) {

        outcome1 = die1;
        outcome2 = die2;
    }

}