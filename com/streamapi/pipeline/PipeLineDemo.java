package com.streamapi.pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PipeLineDemo {
    public static void main(String[] args) {
        // stream pipeline flow
        // 1. source of data
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        // 2.convert source into a java stream
        Stream<Integer> integerStream = integerList.stream();
        // 3. non terminal operation
        Stream<Integer> fileStream = integerStream.filter(i -> i>3);
        // 4. non terminal operation
        Stream<Integer> computedstream = fileStream.map(n -> n*n);
        // 5. terminal operation
        computedstream.forEach(a -> System.out.println(a));
    }
}
