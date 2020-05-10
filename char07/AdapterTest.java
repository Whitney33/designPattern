package com.local.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        //适配器实现的鸭子类
        TurkeyToDuckAdapter turkeyToDuckAdapter = new TurkeyToDuckAdapter(turkey);

        System.out.println("Duck action:");
        testDuck(duck);

        System.out.println("\nTurkey action:");
        turkey.fly();
        turkey.gobble();

        System.out.println("\nTurkeyToDuckAdapter action:");
        testDuck(turkeyToDuckAdapter);
    }

    static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }
}
