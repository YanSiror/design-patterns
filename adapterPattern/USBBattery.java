package adapterPattern;

import adapterPattern.inter.Service;

public class USBBattery implements Service {
    private final int voltage = 5;

    @Override
    public int supply() {
        return 5;
    }

    @Override
    public void charge(int volt) {
        if(voltage != volt)
            System.out.println("Charge fail, you need input correct voltage:" + voltage +", but now:"+ volt);
        else
            System.out.println("Charging... ... ...");
    }
}
