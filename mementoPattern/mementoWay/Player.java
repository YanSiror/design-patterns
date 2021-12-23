package mementoPattern.mementoWay;

class Player {
    // 生命值
    private int life = 100;
    // 魔法值
    private int magic = 100;

    public void fightBoss() {
        life -= 100;
        magic -= 100;
        if (life <= 0) {
            System.out.println("壮烈牺牲");
        }
    }

    // 存档
    public Memento saveState() {
        return new Memento(life, magic);
    }

    // 读档
    public void restoreState(Memento memento) {
        this.life = memento.life;
        this.magic = memento.magic;
    }
}
