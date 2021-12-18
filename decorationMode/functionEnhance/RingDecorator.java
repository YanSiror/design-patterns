package decorationMode.functionEnhance;

public class RingDecorator implements IBeauty{
    private final IBeauty me;
    private static int enhance = 20;


    public RingDecorator(IBeauty me) {
        this.me = me;
    }


    @Override
    public int getBeauty() {
        return me.getBeauty() + enhance;
    }
}
