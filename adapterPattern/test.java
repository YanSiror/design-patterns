package adapterPattern;

public class test {
    public static void main(String[] args) {
        //家用电压
        HomeBattery homeBattery = new HomeBattery();
        homeBattery.charge(220);
        homeBattery.charge(5);
        //USB充电电压
        USBBattery usbBattery = new USBBattery();
        usbBattery.charge(5);

        //转化后的电压
        Adapter adapter = new Adapter();
        usbBattery.charge(220);
        usbBattery.charge(adapter.convertVolt(220));
    }
}
