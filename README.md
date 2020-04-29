## 设计模式学习
### 单例设计模式

常见的单例模式应用

* `java.lang.Runtime`
* `org.springframework.aop.framework.ProxyFactoryBean`
* `org.apache.catalina.webresources.TomcatURLStreamHandlerFactory`

#### 饿汉式

类加载的初始化阶段就完成了实例的初始化，本质上就是借助于JVM类加载机制，保证实例的唯一性即线程安全

* 类的加载只会执行一次，初始化过程只会执行一次，即赋值只会一次
* JVM以同步的形式来进行类加载过程，线程安全

#### 懒汉式方式一：静态内部类

本质上是利用类的加载机制来保证线程安全，初始化阶段不会给内部类的静态变量赋值，只要在使用内部类时才会触发内部类的初始化

#### 懒汉式方式二：双层检查同步

本质上是利用同步代码块来消除线程安全问题，利用`volatile`关键字来消除JIT编译器,CPU指令重排问题

#### 懒汉式方式三：枚举

天然不支持反射创建对应的实例，且有自己的反序列化机制，且只有枚举能够防御反射和序列化攻击

* 防御反射攻击：由于枚举类都隐式继承Enum抽象类，而该类没有**无参构造器**，且在反射创建对象时会校验是否是枚举类型
* 防御序列化攻击：ObjectInputStream类中，对枚举类型有一个专门的readEnum()方法来处理，防御也是通过JDK内部实现

### 策略模式

可以将算法的实现细节与使用它的代码隔离开来，符合开闭原则

> 应用场景

1. 当你有很多类似的类，但它们执行某些行为的方式不同时
2. 使用该模式将类的业务逻辑与算法的实现细节隔离开，这些算法在逻辑上下文中可能不那么重要
3. 当你的类具有大量的条件运算符，并且在同一算法的不同变体之间切换时

> 常见应用

* `java.util.Comparator`
* `org.springframework.beans.factory.support.InstantiationStrategy`

### 工厂方法模式

定义一个用于创建对象的接口，让子类决定实例化哪一个类，FactoryMethod使得一个类的实例化延迟到子类

> 应用场景

* 不确定该使用对象的确切类型时
* 希望为库或框架提供扩展其内部组件的方法时

> 优点

* 将具体产品和创建者解耦，如ProductA和如ConcreteProductACreater
* 符合单一职责原则，如ConcreteProductACreater
* 符合开闭原则，对于扩展开发，对于修改关闭

> 常见应用

* `Calendar.getInstance()`
* `java.text.NumberFormat.getInstance()`

### 抽象工厂模式

提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类

> 应用场景

* 需要处理**不同系列**的相关产品，但不希望依赖于这些产品的具体类时

> 优点

* 可以确信从工厂得到的产品彼此兼容
* 可以避免具体产品和创建者解耦
* 符合单一职责原则
* 符合开闭原则

> 常见应用

* `java.sql.Connection`
* `java.sql.Driver`