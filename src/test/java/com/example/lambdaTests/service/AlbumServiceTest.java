package com.example.lambdaTests.service;

import com.example.lambdaTests.domain.Album;
import com.example.lambdaTests.domain.Track;
import org.junit.Before;
import org.junit.Test;

import java.util.IntSummaryStatistics;

import static org.junit.Assert.assertEquals;

public class AlbumServiceTest {

    private AlbumService service;

    @Before
    public void setUp() {
        service = new AlbumService();
    }

    @Test
    public void shouldGet13TracksWhenCallGetYellowSubmarine() {
        int expectedSize = 13;
        int expectedMaxDuration = 386;
        int expectedMinDuration = 130;

        IntSummaryStatistics yellowSubmarine = service.getYellowSubmarineStatisticsByDuration();

        assertEquals(expectedSize, yellowSubmarine.getCount());
        assertEquals(expectedMaxDuration, yellowSubmarine.getMax());
        assertEquals(expectedMinDuration, yellowSubmarine.getMin());

    }

    @Test
    public void shouldGetItsAllTooMuchWhenIRequestLongestTrackForTheAlbum() {
        Album yellowSubmarine = service.getYellowSubmarine();
        String expectedTrackName = "It's all too Much";

        Track trackStats = yellowSubmarine.getLongestTrack();

        assertEquals(expectedTrackName, trackStats.getName());

    }

}