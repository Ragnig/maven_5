package xyz.grega.mavenjenkinssample;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestBankAccount {

    @Test
    public void testDebitWithSufficientFunds() {
        BankAccount ba = new BankAccount(10);
        double amount = ba.debit(5);
        assertEquals(5.0, amount, 0);
    }

    @Test
    public void testDebitWithInsufficientFunds() {
        BankAccount ba = new BankAccount(10);
        double amount = ba.debit(11);
        assertEquals(10.0, amount, 0);
    }

}
