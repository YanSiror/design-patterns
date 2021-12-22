import org.junit.Test;
import responsChainMode.sloveBUG4.BUG;
import responsChainMode.sloveBUG4.ExcPro;
import responsChainMode.sloveBUG4.NoobPro;
import responsChainMode.sloveBUG4.NormalPro;

public class Client4{
    @Test
    public void test() {
        NoobPro newbie = new NoobPro();
        NormalPro normal = new NormalPro();
        ExcPro good = new ExcPro();

        BUG easy = new BUG(20);
        BUG middle = new BUG(50);
        BUG hard = new BUG(100);

        // 组成责任链
        newbie.setNext(normal);
        normal.setNext(good);

        // 从菜鸟程序员开始，沿着责任链传递
        newbie.handle(easy);
        newbie.handle(middle);
        newbie.handle(hard);
    }
}