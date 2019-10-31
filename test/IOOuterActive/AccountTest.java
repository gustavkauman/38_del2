package IOOuterActive;

import IOOuterActive.Languages.Language;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class AccountTest {

    @Before
    public void Before() throws FileNotFoundException, UnsupportedEncodingException {
        Language language = new Language();
        language.readFile();
    }

    @Test
    public void account_balance_cannot_be_less_than_zero() {
        Account acc = new Account();
        acc.setMoney(100);
        acc.subtractMoney(1000);
        assertTrue(acc.getMoneySum() >= 0);
    }

    @Test
    public void account_can_set_balance() {
        Account acc = new Account();
        acc.setMoney(100);
        assertEquals(100, acc.getMoneySum());
    }

    @Test
    public void account_can_have_money_subtracted() {
        Account acc = new Account();
        acc.setMoney(100);
        acc.subtractMoney(10);
        assertEquals(90,acc.getMoneySum());
    }

}