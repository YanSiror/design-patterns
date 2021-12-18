package decorationMode.functionEnhance;

public class test {
    public static void main(String[] args) {
        IBeauty iBeauty = new Me();
        System.out.println("当前魅力值: " + iBeauty.getBeauty());

        //为没有戴戒指的我, 装饰上戒指
        IBeauty ringDecorator = new RingDecorator(iBeauty);
        System.out.println("当前魅力值: " + ringDecorator.getBeauty());

        //为没有戴耳环的我, 装饰上戒指
        IBeauty earringDecorator = new EarringDecorator(iBeauty);
        System.out.println("当前魅力值: " + earringDecorator.getBeauty());
    }
}
