package factoryMode.simpleFactory;

import factoryMode.simpleFactory.bean.Apple;
import factoryMode.simpleFactory.bean.Banana;
import factoryMode.simpleFactory.bean.Orange;
import factoryMode.simpleFactory.bean.action.FruitInterface;

public class Factory {
    //实现获取水果名称的方法
    public FruitInterface getFruit(String name){
        switch (name){
            case "apple":
                Apple apple = new Apple();
                apple.getFruitName();
                return apple;
            case "banana":
                Banana banana = new Banana();
                banana.getFruitName();
                return banana;
            case "orange":
                Orange orange = new Orange();
                orange.getFruitName();
                return orange;
            default:
                break;
        }
        return null;
    }
}
