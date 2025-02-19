package ConcreteStates;

import Concrete.VendingMachineState;
import Context.VendingMachine;

public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        machine.addBalance(amount);
        System.out.println("Inserted coin: " + amount);
        if (machine.getBalance() >= machine.getItemPrice()) {
            System.out.println("Sufficient balance. Dispensing item...");
            machine.setState(new DispensingState());
            machine.dispenseItem();
        }
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Insert coin first.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Setting machine to Out of Order.");
        machine.setState(new OutOfOrderState());
    }
}
