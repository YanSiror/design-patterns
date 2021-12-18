package decorationMode.functionEnhance;

public class Me implements IBeauty {
    private int value = 100;        //每个人的初始颜值为100

    @Override
    public int getBeauty() {
        return value;
    }
}
