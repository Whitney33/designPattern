package com.local.adapter;

/**
 * 双向适配器
 */
public class TwoWayAdapter implements Turkey, Duck{
    private Turkey turkey;
    private Duck duck;

    //构造函数，只初始化一个特定的对象
    public TwoWayAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    public TwoWayAdapter(Duck duck){
        this.duck = duck;
    }

    public void fly() {
        if(null != turkey){
            turkey.fly();
        }
        if(null != duck){
            duck.fly();
        }
    }

    public void quack() {
        if(null != turkey){
            turkey.gobble();
        }else {
            System.out.println("action not allowed");
        }
    }

    public void gobble() {
        if(null != duck){
            duck.quack();
        }else {
            System.out.println("action not allowed");
        }
    }
}
