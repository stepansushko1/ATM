package atm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestATM {

    @Test
    public void testGetBill(){
        ATM atm = new ATM();
        int expected = 20;
        int actual = atm.initialBill.getBILL();
        assertEquals(expected, actual);
    }

}