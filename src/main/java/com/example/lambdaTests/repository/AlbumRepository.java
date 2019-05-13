package com.example.lambdaTests.repository;

import com.example.lambdaTests.domain.Album;
import com.example.lambdaTests.domain.Track;

import java.util.Arrays;

public class AlbumRepository {

    public Album GetYellowSubmarine(){

        Track yellowSubamrine = Track.builder()
                .name("Wellow Submarine")
                .durationInSeconds(160)
                .build();

        Track onlyNorthernSong = Track.builder()
                .name("Only a Northern Song")
                .durationInSeconds(310)
                .build();

        Track allTogetherNow = Track.builder()
                .name("All Thogether now")
                .durationInSeconds(130)
                .build();

        Track heyBulldog = Track.builder()
                .name("Hey Bulldog")
                .durationInSeconds(194)
                .build();

        Track itsAllTooMuch = Track.builder()
                .name("It's all too Much")
                .durationInSeconds(386)
                .build();

        Track allYouNeedIsLove = Track.builder()
                .name("All you Need is Love")
                .durationInSeconds(232)
                .build();

        Track peperland = Track.builder()
                .name("Pepperland")
                .durationInSeconds(139)
                .build();

        Track seaOfTime = Track.builder()
                .name("Sea of Time")
                .durationInSeconds(180)
                .build();

        Track seaOfHoles = Track.builder()
                .name("Sea of Holes")
                .durationInSeconds(146)
                .build();

        Track seaOfMonsters = Track.builder()
                .name("Sea of Monsters")
                .durationInSeconds(215)
                .build();

        Track marchOfTheMeanies = Track.builder()
                .name("March of the meanies")
                .durationInSeconds(137)
                .build();

        Track pepperLandLaidWaste = Track.builder()
                .name("Perpperland Laid Waste")
                .durationInSeconds(130)
                .build();

        Track yellowSubmarineInPeperland = Track.builder()
                .name("Yellow Submarine in Peperland")
                .durationInSeconds(130)
                .build();

        return Album.builder()
                .tracks(Arrays.asList(yellowSubamrine,
                        onlyNorthernSong,
                        allTogetherNow,
                        heyBulldog,
                        itsAllTooMuch,
                        allYouNeedIsLove,
                        peperland,
                        seaOfTime,
                        seaOfHoles,
                        seaOfMonsters,
                        marchOfTheMeanies,
                        pepperLandLaidWaste,
                        yellowSubmarineInPeperland))
                .build();

    }
}
