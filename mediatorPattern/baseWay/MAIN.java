package mediatorPattern.baseWay;

public class MAIN {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();

        player1.win(player2,5);     //1赢2 5块
        player1.win(player3,10);    //1赢3 10块
        player1.win(player4,20);    //1赢4 20块

        // 输出：四人剩余的钱：105,120,88,97
        System.out.println("四人剩余的钱：" + player1.money + "," + player2.money + "," + player3.money + "," + player4.money);
    }
}
