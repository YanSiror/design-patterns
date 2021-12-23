package IteratorPattern.iteratorWay;

public class MAIN {
    public static void main(String[] args) {
        MyList list = new MyList();
        // 获取迭代器，用于遍历列表
        Iterator iterator = list.iterator();
        // 输出：abc
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
