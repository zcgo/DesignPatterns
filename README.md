## 设计模式学习
### 单例设计模式
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
## 设计模式应用