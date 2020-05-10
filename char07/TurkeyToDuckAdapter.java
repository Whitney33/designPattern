package com.local.adapter;

public class TurkeyToDuckAdapter implements Duck{
    private Turkey turkey;

    public TurkeyToDuckAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    //实现适配的方法的时候，需要考虑对象的实际情况
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }

    public void quack() {
        turkey.gobble();
    }
}
