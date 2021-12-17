package factoryMode.abstractFactory.bean.action;


import factoryMode.abstractFactory.bean.Fruit;

public interface IFactory {
    Fruit create(String name);
}
