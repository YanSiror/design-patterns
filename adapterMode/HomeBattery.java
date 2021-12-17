package adapterMode;

import adapterMode.inter.Service;

public class HomeBattery implements Service {
    private final int voltage = 220;

    @Override
    public int supply() {
        return voltage;     //提供220v电压
    }

    @Override
    public void charge(int volt) {
        if(voltage != volt)
            System.out.println("Charge fail, you need input correct voltage:" + voltage +", but now:"+ volt);
        else
            System.out.println("Charging... ... ...");
    }
}
