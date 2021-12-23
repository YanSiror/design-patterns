package IteratorPattern.baseWay;

public class MAIN {
    public static void main(String[] args) {
        MyList list = new MyList();

        while(list.hasNext()){
            System.out.print(list.next());
        }
    }
}
