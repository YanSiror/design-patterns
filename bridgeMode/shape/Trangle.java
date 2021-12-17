package bridgeMode.shape;

import bridgeMode.inter.IColor;
import bridgeMode.inter.IShape;

public class Trangle implements IShape {
    private IColor color;

    @Override
    public void setColor(IColor color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("绘制"+color.getColor()+"色的三角形!");
    }
}
