package IOOuterActive;

class DiceCup {

    // Attributes
    private final Die t1;
    private final Die t2;
    private int outcome1, outcome2;

    //Contructor. Creates two die objects
    DiceCup() {
        t1 = new Die();
        t2 = new Die();
    }

    //Rolls two die objects with the roll-method form the die-class
    void throwDice() {
        outcome1 = t1.roll();
        outcome2 = t2.roll();
    }

    //Adds the two facevalues and saves the sum
    int getSum() {
        return outcome1 + outcome2;
    }


    //Returns the facevalues of each die
/*    public String toStringOutcome() {
        return "Terning 1: " + outcome1 + "\n" + "Terning 2: " + outcome2 + "\n";
    }*/

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


}