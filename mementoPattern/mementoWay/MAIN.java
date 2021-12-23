package mementoPattern.mementoWay;

public class MAIN {
    public static void main(String[] args) {
        Player player = new Player();
        // 存档
        Memento memento = player.saveState();

        // 打 Boss，打不过，壮烈牺牲
        player.fightBoss();

        // 读档
        player.restoreState(memento);
    }
}
