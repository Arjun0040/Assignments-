package com.timbuchalka;

public class Tiger extends Feline implements Wild{
    public Tiger(int size, String fightMethod) {
        super(size, fightMethod);
    }

    @Override
    public void huntFood() {
        System.out.println("HUNTING");
    }

    @Override
    public void roamInForest() {
        System.out.println("I like to hang out with myself");
    }
}
