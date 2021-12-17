package factoryMode.abstractFactory.bean;

import factoryMode.simpleFactory.bean.action.FruitInterface;

public class Fruit implements FruitInterface {
    String name;

    @Override
    public void getFruitName() {
        System.out.println(this.name);
    }
}
