package ConcreteStates;

import Concrete.VendingMachineState;
import Context.VendingMachine;

public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Cannot select item while dispensing the machine.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Cannot insert coin while dispensing the machine.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("The Item has been Dispensing.");
        machine.reduceInventory();
        machine.resetBalance();
        machine.setState(new IdleState());
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Cannot set out of order while dispensing the machine.");
    }
}
