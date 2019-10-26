package IOOuterActive;

import IOOuterActive.Languages.Danish;

import java.util.Scanner;

public class Language {
    Danish danish = new Danish();
    Scanner scan = new Scanner(System.in);
    String lang= "Danish";


    public Language() {

    }

  /*  public void chooseLanguage() {
        System.out.println("Vælg sprog:");
        lang=scan.nextLine();
    }*/

    public void playName() {
        if (lang.equals("Danish")) {
            danish.playName();
        }
    }

    public void tower() {
        if (lang.equals("Danish")) {
            danish.tower();
        }
    }

    public void crater() {
        if (lang.equals("Danish")) {
            danish.crater();
        }
    }

    public void palaceGates() {
        if (lang.equals("Danish")) {
            danish.palaceGates();
        }
    }

    public void coldDesert() {
        if (lang.equals("Danish")) {
            danish.coldDesert();
        }
    }

    public void walledCity() {
        if (lang.equals("Danish")) {
            danish.walledCity();
        }
    }

    public void monastery() {
        if (lang.equals("Danish")) {
            danish.monastery();
        }
    }

    public void blackCave() {
        if (lang.equals("Danish")) {
            danish.blackCave();
        }
    }

    public void hutsInTheMountain() {
        if (lang.equals("Danish")) {
            danish.hutsInTheMountain();
        }
    }

    public void wereWall() {
        if (lang.equals("Danish")) {
            danish.wereWall();
        }
    }

    public void thePit() {
        if (lang.equals("Danish")) {
            danish.thePit();
        }
    }

    public void goldmine() {
        if (lang.equals("Danish")) {
            danish.goldmine();
        }
    }

    public void throwSum() {
        if (lang.equals("Danish")) {
            danish.throwSum();
        }
    }

    public void landedOn() {
        if (lang.equals("Danish")) {
            danish.landedOn();
        }
    }

    public void winner() {
        if (lang.equals("Danish")) {
            danish.winner();
        }
    }

    public void balanceOut() {
        if (lang.equals("Danish")) {
            danish.balanceOut();
        }
    }

    public void moneyWithdrawal() {
        if (lang.equals("Danish")) {
            danish.moneyWithdrawal();
        }
    }

    public void moneyDeposit() {
        if (lang.equals("Danish")) {
            danish.moneyDeposit();
        }
    }

    public void insufficientFunds() {
        if (lang.equals("Danish")) {
            danish.insufficientFunds();
        }
    }
}
