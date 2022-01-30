package com.softserveinc.task02;

import com.softserveinc.task01.CoffeeMachineV1;

public class CoffeeMachineV2 extends CoffeeMachineV1 {
    private final Integer milkReservoirCapacity;
    private Integer milk;

    public CoffeeMachineV2(int coffeeBeanStorageCapacity, int waterReservoirCapacity, int wasteCoffeeBeanCapacity, Integer milkReservoirCapacity) {
        super(coffeeBeanStorageCapacity, waterReservoirCapacity, wasteCoffeeBeanCapacity);
        this.milkReservoirCapacity = milkReservoirCapacity;
    }

    public void addMilk(int milk) {
        this.milk = Math.min(milk + this.milk, milkReservoirCapacity);
    }

    public Integer getMilk() {
        return milk;
    }

    public boolean makeCappuccino(){
        int milkForCup = 85;
        if (!super.makeEspresso()) return false;
        if (milkForCup > this.milk) {
            System.err.println("Not enough milk");
            return false;
        }
        return true;
    }

    public boolean makeLatte(){
        int milkForCup = 150;
        if (!super.makeEspresso()) return false;
        if (milkForCup > this.milk) {
            System.err.println("Not enough milk");
            return false;
        }
        return true;
    }
}
