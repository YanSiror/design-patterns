package prototypeMode.manual;

public class test {
    public static void main(String[] args) {
        //下 定制衣服 订单
        Cloth finalCloth = new Cloth();
        finalCloth.setType("大衣");
        finalCloth.setSize("XL");
        System.out.println(finalCloth.toString());

        //根据定制的衣服,克隆 n 份
        Cloth simpleCloth = finalCloth.clone();
        System.out.println(simpleCloth.toString());
    }
}
