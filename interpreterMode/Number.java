package interpreterMode;


public class Number implements Expression {
    int number;     //转换后的数字

    public Number(char word) {
        //使用for 循环 代码量少 - 这里直接使用 switch 吧
        switch (word) {
            case '零':
                number = 0;
                break;
            case '一':
                number = 1;
                break;
            case '二':
                number = 2;
                break;
            case '三':
                number = 3;
                break;
            case '四':
                number = 4;
                break;
            case '五':
                number = 5;
                break;
            case '六':
                number = 6;
                break;
            case '七':
                number = 7;
                break;
            case '八':
                number = 8;
                break;
            case '九':
                number = 9;
                break;
            default:
                break;
        }
    }

    @Override
    public int intercept() {
        return number;
    }
}
