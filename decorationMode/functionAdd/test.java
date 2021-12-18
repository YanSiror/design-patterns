package decorationMode.functionAdd;

public class test {
    public static void main(String[] args) {
        IHouse house = new House();
        house.live();

        //显然经过装饰器的包装, 房子具有了 煮饭 这一新的功能
        CookingDecorator cookingDecorator = new CookingDecorator(house);
        cookingDecorator.cooking();
        cookingDecorator.live();
    }
}
