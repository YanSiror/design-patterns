package factoryMode.simpleFactory.bean;

import factoryMode.simpleFactory.bean.action.FruitInterface;

public class Apple implements FruitInterface{
    @Override
    public void getFruitName() {
        System.out.println("I'm apple!");
    }
}
