package singletonMode.lazyman;

public class LazyMan {
    private static LazyMan instance = null;

    private LazyMan() {
    }

    public static LazyMan getInstance(){
        if (instance == null) {
            System.out.println("初始化完成!");
            instance = new LazyMan();
        }
        return instance;
    }
}
