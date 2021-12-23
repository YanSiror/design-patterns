package mediatorPattern.mediatorWay;

public class Player {
    int money = 100;    //每个玩家的初始金额为100元
    public Group group;

    public Player(Group group) {
        this.group = group;
    }

    public void change(int money){
        //金额会发生变化
        group.money += money;      //群内金额 + money, 输家发的钱
        this.money += money;        //赢家金额 + money
    }
}
