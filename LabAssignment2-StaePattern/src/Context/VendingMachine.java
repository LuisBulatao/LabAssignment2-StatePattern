package Context;

import Concrete.VendingMachineState;
import ConcreteStates.IdleState;

public class VendingMachine {
    private VendingMachineState state;
    private int Stock;
    private int balance;
    private int itemCost = 50;

    public VendingMachine(int inventory) {
        this.Stock = inventory;
        this.balance = 0;
        this.state = new IdleState();
    }

    public void setState(VendingMachineState newState) {
        this.state = newState;
    }

    public void selectItem() {
        state.selectItem(this);
    }

    public void insertCoin(int coin) {
        state.insertCoin(this, coin);
    }

    public void dispenseItem() {
        state.dispenseItem(this);
    }

    public void setOutOfOrder() {
        state.setOutOfOrder(this);
    }

    public int getBalance() {
        return balance;
    }

    public int getItemPrice() {
        return itemCost;
    }

    public void addBalance(int amount) {
        this.balance += amount;
    }

    public void resetBalance() {
        this.balance = 0;
    }

    public void reduceInventory() {
        if (Stock > 0) {
            Stock--;
        }
        if (Stock == 0) {
            setOutOfOrder();
        }
    }
}
