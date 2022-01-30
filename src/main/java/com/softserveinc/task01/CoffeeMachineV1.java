package com.softserveinc.task01;

public class CoffeeMachineV1 extends AbstractCoffeeMachine {

    private Integer beansForCup = 22;

    public CoffeeMachineV1(int coffeeBeanStorageCapacity, int waterReservoirCapacity, int wasteCoffeeBeanCapacity) {
        super(coffeeBeanStorageCapacity, waterReservoirCapacity, wasteCoffeeBeanCapacity);
    }

    @Override
    public boolean makeEspresso() {
        int waterForCup = 30;
        return super.makeCoffee(beansForCup, waterForCup);
    }

    @Override
    public boolean makeAmericano() {
        int waterForCup = 100;
        return super.makeCoffee(beansForCup, waterForCup);
    }
}
