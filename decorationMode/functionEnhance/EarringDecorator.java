package decorationMode.functionEnhance;

public class EarringDecorator implements IBeauty{
    private final IBeauty me;
    private static int enhance = 40;

    public EarringDecorator(IBeauty me) {
        this.me = me;
    }

    @Override
    public int getBeauty() {
        return me.getBeauty() + enhance;
    }
}