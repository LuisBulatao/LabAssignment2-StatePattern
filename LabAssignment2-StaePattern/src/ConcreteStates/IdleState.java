package ConcreteStates;

import Concrete.VendingMachineState;
import Context.VendingMachine;

public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item selected.");
        machine.setState(new ItemSelectedState());
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Insert coin not allowed in Idle state.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Cannot dispense item in Idle state.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Setting machine to Out of Order.");
        machine.setState(new OutOfOrderState());
    }
}
