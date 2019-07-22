package com.example.lambdaTests.otherTests;

import com.example.lambdaTests.domain.Artist;
import com.example.lambdaTests.service.ArtistService;
import com.example.lambdaTests.topics.StringCollector;
import com.example.lambdaTests.topics.StringCombiner;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class TestCustomCollector {

    @Test
    public void testIdentityConstraint() {

        StringCollector collector = new StringCollector(", ", "<!--", "-->");
        Supplier<StringCombiner> supplier = collector.supplier();
        BiConsumer<StringCombiner, String> accumulator = collector.accumulator();
        BinaryOperator<StringCombiner> combiner = collector.combiner();
        Function<StringCombiner, String> finisher = collector.finisher();

        StringCombiner stringCombiner1 = supplier.get();
        accumulator.accept(stringCombiner1, "one");
        accumulator.accept(stringCombiner1, "two");
        String result1 = finisher.apply(stringCombiner1);

        StringCombiner stringCombiner2 = supplier.get();
        accumulator.accept(stringCombiner2, "one");
        accumulator.accept(stringCombiner2, "two");
        stringCombiner2 = combiner.apply(stringCombiner2, supplier.get());
        String result2 = finisher.apply(stringCombiner2);

        assertEquals(result1, result2);
    }

    @Test
    public void testCollectEmpty() {
        Stream<String> stream = Stream.of();
        String result = stream.collect(new StringCollector(", ", "<!--", "-->"));
        assertEquals("<!---->", result);
    }

    @Test
    public void testCollectSimple() {
        Stream<String> stream = Stream.of("one", "two", "three", "four");
        String result = stream.collect(new StringCollector(", ", "<!--", "-->"));
        assertEquals("<!--one, two, three, four-->", result);
    }
    @Test
    public void TestingStringCombiner() {

        List<Artist> artist = new ArtistService().GetBeatles();
        String expectedArtists = "[Paul McCartney,Ringo Starr,Jhon Lennon,George Harrison]";

        String result = artist.stream()
                .map(Artist::getName)
                .reduce(new StringCombiner("[", ",", "]"),
                        StringCombiner::add,
                        StringCombiner::merge)
                .toString();

        assertEquals(expectedArtists, result);

    }

    @Test
    public void testStringCollector() {

        List<Artist> artist = new ArtistService().GetBeatles();
        String expectedArtists = "[Paul McCartney,Ringo Starr,Jhon Lennon,George Harrison]";

        String result = artist.stream()
                .map(Artist::getName)
                .collect(new StringCollector(",","[","]"));

        assertEquals(expectedArtists, result);

    }

    @Ignore
    @Test
    public void testReduceAsACollector(){
        List<Artist> artist = new ArtistService().GetBeatles();
        String expectedArtists = "[Paul McCartney,Ringo Starr,Jhon Lennon,George Harrison]";

        String result = artist.stream()
                .map(Artist::getName)
                .collect(
                        Collectors.reducing(
                                new StringCombiner("[", ",","]"),
                                name -> new StringCombiner("[", ",","]").add(name),
                                StringCombiner::merge))
                .toString();

        assertEquals(expectedArtists, result);
    }
}
