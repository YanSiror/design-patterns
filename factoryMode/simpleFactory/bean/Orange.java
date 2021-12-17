package factoryMode.simpleFactory.bean;

import factoryMode.simpleFactory.bean.action.FruitInterface;

public class Orange  implements FruitInterface {
    @Override
    public void getFruitName() {
        System.out.println("I'm orange!");
    }
}
