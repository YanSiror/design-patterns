package mementoPattern.baseWay;

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

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }
}
