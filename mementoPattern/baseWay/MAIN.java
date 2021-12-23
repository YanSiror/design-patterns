package mementoPattern.baseWay;

public class MAIN {
    public static void main(String[] args) {
        Player player = new Player();
        // 存档
        int savedLife = player.getLife();
        int savedMagic = player.getMagic();

        // 打 Boss，打不过，壮烈牺牲
        player.fightBoss();

        // 读档，恢复到打 Boss 之前的状态
        player.setLife(savedLife);
        player.setMagic(savedMagic);
    }
}
