- adapter 适配器模式
    - 设计意图：将一个接口转换成另外一个接口，实现接口之间的兼容
    - 比如兼容旧版本，可以实现服务端代码升级，而客户端代码可以不用修改就可以应用升级后的服务，从而实现解耦
    - 对象适配器，实现接口，通过组合来实现
        - client 
        - target interface
        - adapter
        - adpatee 已经存在的类
    - 类适配器，多重继承实现，缺乏弹性扩展，子类可以重写父类的方法，也可以在父类中提炼出公共方法

- 相关模式
    - bridge模式，将接口和实现分离
    - decorator模式，增强对象的功能，而不改变原有的接口
    - proxy模式，
    
- 源码
    - HashMap
    