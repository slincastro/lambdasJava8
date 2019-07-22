package com.example.lambdaTests.repository.RepsitoryImpl;

import com.example.lambdaTests.domain.Album;
import com.example.lambdaTests.domain.Track;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;
import static org.junit.Assert.assertEquals;

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
        Album pleasePlease = albumRepository.getPleasePleaseMe();
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
        Album pleasePlease = albumRepository.getPleasePleaseMe();
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
        Album yellowSubmarine = albumRepository.getYellowSubmarine();
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
        Album yellowSubmarine = albumRepository.getYellowSubmarine();
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


    @Test
    public void shouldReturn7TracksBySide(){
        Album withTheBeatles = albumRepository.getWithTheBeatles();
        int expectedTracksSideA = 7;
        int expectedTracksSideB = 7;
        String sideA = "A";
        String sideB = "B";

        Map<String, List<String>> songsBySide = withTheBeatles
                .getTracks()
                .stream()
                .collect(
                        groupingBy(Track::getSide, mapping(Track::getName, toList()))
                );

        assertEquals(expectedTracksSideA, songsBySide.get(sideA).size());
        assertEquals(expectedTracksSideB, songsBySide.get(sideB).size());
    }

    @Test
    public void shouldReturn14TracksInWithTheBeatles(){
        Album withTheBeatles = albumRepository.getWithTheBeatles();

        assertEquals(withTheBeatles.getTracks().size(), 14);
    }

    @Test
    public void shouldReturn12Tracks(){
        Album meetTheBeatles = albumRepository.getMeetTheBeatles();
        int expectedTracks = 12;

        assertEquals(expectedTracks,meetTheBeatles.getTracks().size());
    }

    @Test
    public void shouldGet6TRacksBySide(){
        Album meetTheBeatles = albumRepository.getMeetTheBeatles();
        int expectedTracksSideA = 6;
        int expectedTracksSideB = 6;
        String sideA = "A";
        String sideB = "B";

        Map<String, List<String>> songsBySide = meetTheBeatles
                .getTracks()
                .stream()
                .collect(
                        groupingBy(Track::getSide, mapping(Track::getName, toList()))
                );

        assertEquals(expectedTracksSideA,songsBySide.get(sideA).size());
        assertEquals(expectedTracksSideB,songsBySide.get(sideB).size());
    }

    @Test
    public void shouldGet11TracksInTheBeatlesSecondAlbum(){
        Album theBeatlesSecondAlbum = albumRepository.getBeatlesSecondAlbum();

        assertEquals(11, theBeatlesSecondAlbum.getTracks().size());
    }

    @Test
    public void shouldGet11inSideA(){
        Album theBeatlesSecondAlbum = albumRepository.getBeatlesSecondAlbum();
        int expectedTracksSideA = 11;
        String sideA = "A";

        Map<String,List<String>> songsBySide = theBeatlesSecondAlbum
                .getTracks()
                .stream()
                .collect(
                        groupingBy(Track::getSide, mapping(Track::getName, toList()))
                );

        assertEquals(expectedTracksSideA, songsBySide.get(sideA).size());
    }
}