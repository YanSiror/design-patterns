package builderMode;

public class test {
    public static void main(String[] args) {
        MilkTea milkTea = new MilkTea.Builder("原味").ice(false).pearl(true).build();
        System.out.println(milkTea.toString());
        milkTea = new MilkTea.Builder("卡布奇诺").ice(true).pearl(true).build();
        System.out.println(milkTea.toString());
    }
}
