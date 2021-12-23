package mediatorPattern.baseWay;

public class Player {
    int money = 100;    //每个玩家的初始金额为100元

    public void win(Player player,int money){
        //金额会发生变化
        player.money -= money;      //输家金额 - money
        this.money += money;        //赢家金额 - money
    }
}
