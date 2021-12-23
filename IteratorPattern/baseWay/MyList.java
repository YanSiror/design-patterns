package IteratorPattern.baseWay;


import java.util.Arrays;
import java.util.List;

public class MyList {
    private List<String> data = Arrays.asList("a","b","c");
    private int index = 0;

    public String next(){
        return data.get(index++);
    }

    public boolean hasNext(){
        return index < data.size();
    }
}
