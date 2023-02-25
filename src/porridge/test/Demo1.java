package porridge.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
Stream流的使用，但还有很多问题，待后续处理
* */
public class Demo1 {
    public static void main(String[] args) {
        String[] arr = new String[]{"武汉加油", "中国加油", "世界加油"};
        Stream<String> stream = Arrays.stream(arr);
        System.out.println(stream + "1.1");
        System.out.println(stream.toString()+ "1.2");
        System.out.println(stream.toArray().toString() + "1.3");
        stream = Stream.of("武汉加油", "中国加油", "世界加油");
        System.out.println(stream + "2");
        List<String> list = new ArrayList<>();
        list.add("武汉加油");
        list.add("中国加油");
        list.add("世界加油");
        stream = list.stream();
        System.out.println(stream + "3");
    }
}

