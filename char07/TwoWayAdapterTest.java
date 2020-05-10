package com.local.adapter;

public class TwoWayAdapterTest {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        TwoWayAdapter duckToturkeyAdapter = new TwoWayAdapter(duck);
        TwoWayAdapter turkeyToduckAdapter = new TwoWayAdapter(turkey);

        System.out.println("duckToturkeyAdapter:");
        duckToturkeyAdapter.fly();
        duckToturkeyAdapter.gobble();
        duckToturkeyAdapter.quack();

        System.out.println("\nturkeyToduckAdapter:");
        turkeyToduckAdapter.fly();
        turkeyToduckAdapter.gobble();
        turkeyToduckAdapter.quack();
    }
}
