package commandMode.case1;

public class Test1 {
    public static void main(String[] args) {
        Music music = new Music();
        Tv tv = new Tv();
        //模拟开关一
        Switch switch1 = new Switch();
        if(switch1.getCheck(true)){
            music.open();
        } else if(switch1.getCheck(false)){
            music.close();
        }

        //模拟开关二
        Switch switch2 = new Switch();
        if(switch2.getCheck(true)){
            tv.open();
        } else if(switch2.getCheck(false)){
            tv.close();
        }
    }
}
