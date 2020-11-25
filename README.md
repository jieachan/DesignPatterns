# 设计模式 DesignPatterns
## 创建型模式：
* 工厂方法模式（Factory Method）:[设计模式-工厂方法模式](https://blog.aidd.top/posts/89a20157.html)
* 抽象工厂模式（Abstract Factory）：[设计模式-抽象工厂模式](https://blog.aidd.top/posts/5a86ebac.html)
* 建造者模式（Builder）:[设计模式-建造者模式](https://blog.aidd.top/posts/2a48474d.html)
* 单例模式（Singleton）: 
* 原型模式（Prototype）：

## 结构型模式：
* 适配器模式（Adapter）:要将一个接口转变成另一个接口，它的目的是通过改变接口来达到重复使用的目的
* 桥接模式（Bridge）:将抽象部分与它的实现部分分离，使它们都可以独立地变化
* 装饰器模式（Decorator）：不是要改变被装饰者对象的接口，而是恰恰要保持原有的接口，但是增强原有对象的功能，或者改变原有对象的处理方法而提升性能。
* 代理模式（Proxy）: 注重对对象某一功能的流程把控和辅助。它可以控制对象做某些事，重心是为了借用对象的功能完成某一流程，而非对象功能如何。
* 外观模式（Facade）：
* 享元模式（Flyweight）：
* 组合模式（Composite）：

## 行为型模式：
* 模板方法模式（Template Method）
* 策略模式（Strategy）
* 命令模式（Command）
* 职责链模式（Chain of Responsibility）
* 状态模式（State）
* 观察者模式（Observer）
* 中介者模式（Mediator）
* 迭代器模式（Iterator）
* 访问者模式（Visitor）
* 备忘录模式（Memento)
* 解释器模式（Interpreter）


## 模式区别：
代理模式VS装饰器模式：
* 1、应用场景上，代理模式是为了帮助目标类增强一些自己不关心的事，比如日志代理，在目标类前后加一些日志。而装饰模式则是用来增强自身的功能，比如Java的InputStream那些的子类装饰类，提供了一些更方便的接口给我们调用。
* 2、使用方式上，代理模式一般在代理类中确定了要被代理的目标对象，客户端根本不知道被代理类的存在。而装饰模式中被装饰者对象需要客户端创建提供，并且可以层层嵌套，层层装饰。
