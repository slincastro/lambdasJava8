package com.example.lambdaTests.topics;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * Created by scastro on 4/5/19.
 */
public class ReduceOverCollections {
    public int sumAll(Stream<Integer> input) {

        Integer result = 0;

        result = input.reduce(0,(acc,item) -> acc +item);

        return result;
    }

    public int sumAllWithPRedicates(Stream<Integer> input) {

        BinaryOperator<Integer> accumulator = (acc,item) -> acc+ item;

        return input.reduce(0,accumulator);
    }
}
