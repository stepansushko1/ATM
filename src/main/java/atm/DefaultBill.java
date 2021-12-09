package atm;

import lombok.Getter;

@Getter
public abstract class DefaultBill {
    private final int BILL;
    private DefaultBill nextBill;

    public DefaultBill(int bill){
        this.BILL = bill;
    }

    public void setNext(DefaultBill nextBill){
        this.nextBill = nextBill;
    }

    public void process(int amount) {
        if (this.nextBill != null && amount % BILL != 0) {
            nextBill.process(amount % BILL);
        }
        else if (amount % BILL != 0) {
            throw new IllegalArgumentException("The bill cannot be processed");
        }

        System.out.println("Withdrew " + amount / BILL + " out of " + BILL + " $ bills.");

    }
}