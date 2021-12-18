package decorationMode.functionAdd;

public class CookingDecorator implements ICooking{
    private final IHouse house;


    public CookingDecorator(IHouse house) {
        this.house = house;
    }

    @Override
    public void cooking() {
        System.out.println("添加的煮饭功能!");
    }

    @Override
    public void live() {
        house.live();
    }
}
