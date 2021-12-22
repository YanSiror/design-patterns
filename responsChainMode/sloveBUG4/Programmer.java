package responsChainMode.sloveBUG4;

public abstract class Programmer {
    protected Programmer next;

    public void setNext(Programmer next) {
        this.next = next;
    }

    abstract void handle(BUG bug);
}
