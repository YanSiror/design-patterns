package appearanceMode;

public class test {
    public static void main(String[] args) {
        //daily 方法封装了每天必须做的 刷牙洗脸 起床一次,睡觉一次
        AppearanceSupply appearanceSupply = new AppearanceSupply();
        appearanceSupply.daily();
        System.out.println("----------------");
        appearanceSupply.daily();
    }
}
