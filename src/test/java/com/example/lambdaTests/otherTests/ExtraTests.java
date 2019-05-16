package com.example.lambdaTests.otherTests;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ExtraTests {

    @Test
    public void shouldCollectionsNotBeEqualsWhenIUseHashSet() {
        Set<Integer> numbers = new HashSet<>(asList(4, 3, 2, 1)); // we have not defined order
        List<Integer> sameOrder = numbers.stream().collect(toList());

        assertNotEquals(asList(4, 3, 2, 1), sameOrder);
    }

    @Test
    public void shouldCollectionsBeEqualsWhenIUseList() {
        List<Integer> numbers = new ArrayList<>(asList(4, 3, 2, 1)); //we have defined order
        List<Integer> sameOrder = numbers.stream().collect(toList());

        assertEquals(asList(4, 3, 2, 1), sameOrder);
    }

    @Test
    public void shouldReturnConcatenatesCharacters() {

        List<String> characters = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H");
        String expectedOutput = "[A,B,C,D,E,F,G,H]";

        String charactersConcatenated = characters.stream()
                .collect(Collectors.joining(",", "[", "]"));

        assertEquals(expectedOutput, charactersConcatenated);
    }

    //do example of groupingby and partitioning
}
