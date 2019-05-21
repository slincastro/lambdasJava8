package com.example.lambdaTests.repository.RepsitoryImpl;

import com.example.lambdaTests.domain.Album;
import com.example.lambdaTests.domain.Track;
import com.example.lambdaTests.repository.AlbumRepository;
import com.sun.java.accessibility.util.Translator;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;
import static org.junit.Assert.*;

public class AlbumRepositoryImplTest {

    private AlbumRepositoryImpl albumRepository;

    @Before
    public void setUp() {
        albumRepository = new AlbumRepositoryImpl();
    }

    @Test
    public void shouldGetNameOfAbeyRoadAlbum() {
        String expectedAlbumName = "Abey Road";

        Album abeyRoad = albumRepository.GetAbeyRoad();

        assertEquals(expectedAlbumName, abeyRoad.getName());
    }

    @Test
    public void shouldReturn7tracksByEachSide() {
        Album pleasePlease = albumRepository.GetPleasePleaseMe();
        int expectedTracksBySide = 7;

        Map<Boolean, List<Track>> albumPartitionedBySide = pleasePlease
                .getTracks()
                .stream()
                .collect(partitioningBy(
                        track -> track
                                .getSide()
                                .equals("A")
                ));

        assertEquals(expectedTracksBySide, albumPartitionedBySide.get(Boolean.TRUE).size());
        assertEquals(expectedTracksBySide, albumPartitionedBySide.get(Boolean.FALSE).size());
    }

    @Test
    public void shouldReturn7tracksByEachSideUsingGroupBy() {
        Album pleasePlease = albumRepository.GetPleasePleaseMe();
        int expectedTracksBySide = 7;
        String sideA = "A";
        String sideB = "B";

        Map<String, List<Track>> albumPartitionedBySide = pleasePlease
                .getTracks()
                .stream()
                .collect(
                        groupingBy(Track::getSide));

        assertEquals(expectedTracksBySide, albumPartitionedBySide.get(sideA).size());
        assertEquals(expectedTracksBySide, albumPartitionedBySide.get(sideB).size());
    }

    @Test
    public void shouldReturn6tracksOnSideA_7tracksOnSideB() {
        Album yellowSubmarine = albumRepository.GetYellowSubmarine();
        int expectedTracksBySideA = 6;
        int expectedTracksBySideB = 7;

        Map<Boolean, List<Track>> albumPartitionedBySide = yellowSubmarine
                .getTracks()
                .stream()
                .collect(partitioningBy(
                        track -> track
                                .getSide()
                                .equals("A")
                ));


        assertEquals(expectedTracksBySideA, albumPartitionedBySide.get(Boolean.TRUE).size());
        assertEquals(expectedTracksBySideB, albumPartitionedBySide.get(Boolean.FALSE).size());
    }

    @Test
    public void shouldReturnTheNamesOfSongsByEachSide() {
        Album yellowSubmarine = albumRepository.GetYellowSubmarine();
        int expectedTracksSideA = 6;
        int expectedTracksSideB = 7;
        String sideA = "A";
        String sideB = "B";

        Map<String, List<String>> songsBySide = yellowSubmarine
                .getTracks()
                .stream()
                .collect(
                        groupingBy(Track::getSide, mapping(Track::getName, toList()))
                );

        assertEquals(expectedTracksSideA, songsBySide.get(sideA).size());
        assertEquals(expectedTracksSideB, songsBySide.get(sideB).size());
    }
}