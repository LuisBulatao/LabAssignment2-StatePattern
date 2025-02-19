package ConcreteStates;

import Concrete.VendingMachineState;
import Context.VendingMachine;

public class OutOfOrderState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("The Vending Machine is out of order.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("The Vending Machine is out of order.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("The Vending Machine is out of order.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("The Vending Machine is already out of order.");
    }
}
