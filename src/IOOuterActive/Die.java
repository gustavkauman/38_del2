package IOOuterActive;

public class Die {

    //Attributer
    private final int maxval = 6; // max value
    private int faceValue;       //current value

    //constructor
    public Die() {
    }

    //generates random value between 1 and 6 and returns that value
    public int roll() {
        faceValue = (int) (Math.random() * maxval) + 1;
        return faceValue;
    }
}
