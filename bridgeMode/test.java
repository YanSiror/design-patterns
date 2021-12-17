package bridgeMode;

import bridgeMode.color.Red;
import bridgeMode.inter.IColor;
import bridgeMode.shape.Circle;
import bridgeMode.shape.Trangle;

public class test {
    public static void main(String[] args) {
        IColor color = new Red();
        Trangle trangle = new Trangle();
        trangle.setColor(color);
        trangle.draw();

        Circle circle = new Circle();
        circle.setColor(color);
        circle.draw();;
    }
}
