package observerPattern;

public class MAIN {
    public static void main(String[] args) {
        CriminalObservable zhangSan = new CriminalObservable();
        //新建了 3 个馆擦汗这
        PoliceObserver police1 = new PoliceObserver();
        PoliceObserver police2 = new PoliceObserver();
        PoliceObserver police3 = new PoliceObserver();

        //为 被观察者罪犯 添加观察者
        zhangSan.addObserver(police1);
        zhangSan.addObserver(police2);
        zhangSan.addObserver(police3);
        //对 罪犯放狗咬人 这一行为进行观察, 并作出响应
        zhangSan.crime("放狗咬人");
    }
}
