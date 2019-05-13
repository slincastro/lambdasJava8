package com.example.lambdaTests.topics;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * Created by scastro on 4/5/19.
 */
public class ReduceOverCollectionsTest {

    @Test
    public void shouldReturn10whenSendAList(){

        Stream<Integer> input = Stream.of(1,2,3,4);
        int expectedAccumulator = 10;

        int accumulator = new ReduceOverCollections().sumAll(input);

        assertEquals(expectedAccumulator,accumulator);
    }

    @Test
    public void shouldReturn11whenSendAList(){
        Stream<Integer> input = Stream.of(1,1,2,3,4);
        int expectedAcumulator = 11;

        int accumulator = new ReduceOverCollections().sumAllWithPRedicates(input);

        assertEquals(expectedAcumulator,accumulator);
    }
}