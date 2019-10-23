package IOOuterActive;

public class Field {


    public Field(){

    }

    public void FieldList(int sum){

        switch (sum){

            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7: {
                System.out.println("Monastery");
            }
                break;
            case 8:{
                System.out.println("Black cave");
            }
                break;
            case 9:{
                System.out.println("Huts in the mountain");
            }
                break;
            case 10: {
                System.out.println("The werewall (werewallwolf-wall)");
            }
                break;
            case 11: {
                System.out.println("The pit");
            }
                break;
            case 12: {
                System.out.println("Goldmine");
            }
                break;
        }
    }
}


/*(Man kan ikke slå 1 med to terninger)
        Tower         +250
        Crater         -100
        Palace gates        +100
        Cold Desert         -20
        Walled city         +180
        Monastery         0
        Black cave         -70
        Huts in the mountain         +60
        The Werewall (werewolf-wall)        -80,    men spilleren får en ekstra tur.
        The pit         -50
        Goldmine         +650
*/