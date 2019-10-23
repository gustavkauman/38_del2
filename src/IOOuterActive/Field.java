package IOOuterActive;

public class Field {


    public Field(){

    }

    public void FieldList(int sum){

        switch (sum){

            case 2:{
                System.out.println("Tower");
            }
                break;
            case 3:{
                System.out.println("Crater");
            }
                break;
            case 4:{
                System.out.println("Palace gates");
            }
                break;
            case 5:{
                System.out.println("Cold Desert");
            }
                break;
            case 6:{
                System.out.println("Walled city");
            }
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
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