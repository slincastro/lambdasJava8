package com.example.lambdaTests.repository.RepsitoryImpl;

import com.example.lambdaTests.domain.Album;
import com.example.lambdaTests.domain.Track;
import com.example.lambdaTests.repository.AlbumRepository;

import java.util.Arrays;

public class AlbumRepositoryImpl implements AlbumRepository {

    public Album GetYellowSubmarine(){

        Track yellowSubmarine = Track.builder()
                .name("Yellow Submarine")
                .durationInSeconds(160)
                .build();

        Track onlyNorthernSong = Track.builder()
                .name("Only a Northern Song")
                .durationInSeconds(310)
                .build();

        Track allTogetherNow = Track.builder()
                .name("All Together now")
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

        Track pepperLand = Track.builder()
                .name("PepperLand")
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
                .name("PepperLand Laid Waste")
                .durationInSeconds(130)
                .build();

        Track yellowSubmarineInPeperland = Track.builder()
                .name("Yellow Submarine in PepperLand")
                .durationInSeconds(130)
                .build();

        return Album.builder()
                .tracks(Arrays.asList(yellowSubmarine,
                        onlyNorthernSong,
                        allTogetherNow,
                        heyBulldog,
                        itsAllTooMuch,
                        allYouNeedIsLove,
                        pepperLand,
                        seaOfTime,
                        seaOfHoles,
                        seaOfMonsters,
                        marchOfTheMeanies,
                        pepperLandLaidWaste,
                        yellowSubmarineInPeperland))
                .build();

    }

    public Album GetPleasePleaseMe(){

        Track iSawHereStandingThere = Track.builder()
                .name("I Saw Her Standing There")
                .durationInSeconds(172)
                .build();

        Track misery = Track.builder()
                .name("Mistery")
                .durationInSeconds(111)
                .build();
        Track anna = Track.builder()
                .name("Anna (Go to Him)")
                .durationInSeconds(180)
                .build();

        Track chains = Track.builder()
                .name("Chains")
                .durationInSeconds(146)
                .build();

        Track boys = Track.builder()
                .name("Boys")
                .durationInSeconds(150)
                .build();

        Track askMeWhy = Track.builder()
                .name("Ask Me Why")
                .durationInSeconds(150)
                .build();

        Track pleasePleaseMe = Track.builder()
                .name("Please Please Me")
                .durationInSeconds(124)
                .build();

        Track loveMeDo = Track.builder()
                .name("Love Me Do")
                .durationInSeconds(141)
                .build();

        Track iLoveYou = Track.builder()
                .name("P.S. I Love You")
                .durationInSeconds(125)
                .build();

        Track babyItsYou = Track.builder()
                .name("Baby It's You")
                .durationInSeconds(155)
                .build();

        Track doYouWantKnowSecret = Track.builder()
                .name("Do You Want to Know a Secret")
                .durationInSeconds(120)
                .build();

        Track aTasteOfHoney = Track.builder()
                .name("A Taste of Honey")
                .durationInSeconds(126)
                .build();

        Track theresAPlace = Track.builder()
                .name("There's a Place")
                .durationInSeconds(111)
                .build();

        Track twistAndShout = Track.builder()
                .name("Twist and Shout")
                .durationInSeconds(154)
                .build();

        return Album.builder()
                .name("Please Please Me")
                .tracks(Arrays.asList(
                        iSawHereStandingThere,
                        misery,
                        anna,
                        chains,
                        boys,
                        askMeWhy,
                        pleasePleaseMe,
                        loveMeDo,
                        iLoveYou,
                        babyItsYou,
                        doYouWantKnowSecret,
                        aTasteOfHoney,
                        theresAPlace,
                        twistAndShout
                ))
                .build();
    }
}
