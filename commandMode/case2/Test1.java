package commandMode.case2;

public class Test1 {
    public static void main(String[] args) {
        Operation operation = null;
        Music music = new Music();
        Tv tv = new Tv();
        //模拟开关一
        Switch switch1 = new Switch();
        if(switch1.getCheck(true)){
            operation = Operation.MUSIC_PLAY;
            music.open();
        } else if(switch1.getCheck(false)){
            operation = Operation.MUSIC_STOP;
            music.close();
        }

        //模拟开关二
        Switch switch2 = new Switch();
        if(switch2.getCheck(true)){
            operation = Operation.TV_TURN_ON;
            tv.open();
        } else if(switch2.getCheck(false)){
            operation = Operation.TV_TURN_OFF;
            tv.close();
        }

        //模拟撤销操作 撤销最近一步的操作
        if (operation == null) return;
        // 撤销上一步
        switch (operation) {
            case MUSIC_PLAY:
                music.close();
                break;
            case MUSIC_STOP:
                music.open();
                break;
            case TV_TURN_ON:
                tv.close();
                break;
            case TV_TURN_OFF:
                tv.open();
                break;
        }
    }
}
