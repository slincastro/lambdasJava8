package com.example.lambdaTests.repository.RepsitoryImpl;

import com.example.lambdaTests.domain.Album;
import com.example.lambdaTests.domain.Track;
import com.example.lambdaTests.repository.AlbumRepository;

import java.util.Arrays;

public class AlbumRepositoryImpl implements AlbumRepository {

    public Album getYellowSubmarine(){

        Track yellowSubmarine = Track.builder()
                .name("Yellow Submarine")
                .side("A")
                .durationInSeconds(160)
                .build();

        Track onlyNorthernSong = Track.builder()
                .name("Only a Northern Song")
                .durationInSeconds(310)
                .side("A")
                .build();

        Track allTogetherNow = Track.builder()
                .name("All Together now")
                .durationInSeconds(130)
                .side("A")
                .build();

        Track heyBulldog = Track.builder()
                .name("Hey Bulldog")
                .durationInSeconds(194)
                .side("A")
                .build();

        Track itsAllTooMuch = Track.builder()
                .name("It's all too Much")
                .durationInSeconds(386)
                .side("A")
                .build();

        Track allYouNeedIsLove = Track.builder()
                .name("All you Need is Love")
                .durationInSeconds(232)
                .side("A")
                .build();

        Track pepperLand = Track.builder()
                .name("PepperLand")
                .durationInSeconds(139)
                .side("B")
                .build();

        Track seaOfTime = Track.builder()
                .name("Sea of Time")
                .durationInSeconds(180)
                .side("B")
                .build();

        Track seaOfHoles = Track.builder()
                .name("Sea of Holes")
                .durationInSeconds(146)
                .side("B")
                .build();

        Track seaOfMonsters = Track.builder()
                .name("Sea of Monsters")
                .durationInSeconds(215)
                .side("B")
                .build();

        Track marchOfTheMeanies = Track.builder()
                .name("March of the meanies")
                .durationInSeconds(137)
                .side("B")
                .build();

        Track pepperLandLaidWaste = Track.builder()
                .name("PepperLand Laid Waste")
                .durationInSeconds(130)
                .side("B")
                .build();

        Track yellowSubmarineInPeperland = Track.builder()
                .name("Yellow Submarine in PepperLand")
                .durationInSeconds(130)
                .side("B")
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
                .year(1969)
                .build();

    }

    public Album getPleasePleaseMe(){

        Track iSawHereStandingThere = Track.builder()
                .name("I Saw Her Standing There")
                .durationInSeconds(172)
                .side("A")
                .build();

        Track misery = Track.builder()
                .name("Mistery")
                .durationInSeconds(111)
                .side("A")
                .build();
        Track anna = Track.builder()
                .name("Anna (Go to Him)")
                .durationInSeconds(180)
                .side("A")
                .build();

        Track chains = Track.builder()
                .name("Chains")
                .durationInSeconds(146)
                .side("A")
                .build();

        Track boys = Track.builder()
                .name("Boys")
                .durationInSeconds(150)
                .side("A")
                .build();

        Track askMeWhy = Track.builder()
                .name("Ask Me Why")
                .durationInSeconds(150)
                .side("A")
                .build();

        Track pleasePleaseMe = Track.builder()
                .name("Please Please Me")
                .durationInSeconds(124)
                .side("A")
                .build();

        Track loveMeDo = Track.builder()
                .name("Love Me Do")
                .durationInSeconds(141)
                .side("B")
                .build();

        Track iLoveYou = Track.builder()
                .name("P.S. I Love You")
                .durationInSeconds(125)
                .side("B")
                .build();

        Track babyItsYou = Track.builder()
                .name("Baby It's You")
                .durationInSeconds(155)
                .side("B")
                .build();

        Track doYouWantKnowSecret = Track.builder()
                .name("Do You Want to Know a Secret")
                .durationInSeconds(120)
                .side("B")
                .build();

        Track aTasteOfHoney = Track.builder()
                .name("A Taste of Honey")
                .durationInSeconds(126)
                .side("B")
                .build();

        Track theresAPlace = Track.builder()
                .name("There's a Place")
                .durationInSeconds(111)
                .side("B")
                .build();

        Track twistAndShout = Track.builder()
                .name("Twist and Shout")
                .durationInSeconds(154)
                .side("B")
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
                .year(1963)
                .build();
    }


    public Album getWithTheBeatles(){
        Track wontBeLong = Track.builder()
                .durationInSeconds(140)
                .name("t Won't Be Long")
                .side("A")
                .build();

        Track gotToDo = Track.builder()
                .durationInSeconds(125)
                .name("All I've Got to Do")
                .side("A")
                .build();

        Track allMyLoving = Track.builder()
                .durationInSeconds(130)
                .name("All My Loving")
                .side("A")
                .build();

        Track dontBotherMe = Track.builder()
                .durationInSeconds(147)
                .name("Don't Bother Me")
                .side("A")
                .build();

        Track littleChild = Track.builder()
                .durationInSeconds(107)
                .name("Don't Bother Me")
                .side("A")
                .build();

        Track tillThereWasYou = Track.builder()
                .durationInSeconds(137)
                .name("Till There Was You")
                .side("A")
                .build();

        Track pleaseMrPostman = Track.builder()
                .durationInSeconds(155)
                .name("Please Mister Postman")
                .side("A")
                .build();

        Track rollOverBeethoven = Track.builder()
                .durationInSeconds(170)
                .name("Roll Over Beethoven")
                .side("B")
                .build();

        Track holdMeTigh = Track.builder()
                .durationInSeconds(150)
                .name("Hold Me Tight")
                .side("B")
                .build();

        Track youReallyGotAHold = Track.builder()
                .durationInSeconds(183)
                .name("You Really Got a Hold on Me")
                .side("B")
                .build();

        Track iWannaBeYourMan = Track.builder()
                .durationInSeconds(120)
                .name(" Wanna Be Your Man")
                .side("B")
                .build();

        Track devilInHerHearth = Track.builder()
                .durationInSeconds(150)
                .name("Devil in Her Heart")
                .side("B")
                .build();

        Track notASecondTime = Track.builder()
                .durationInSeconds(130)
                .name("Not a Second Time")
                .side("B")
                .build();

        Track money = Track.builder()
                .durationInSeconds(170)
                .name("Money (That's What I Want)")
                .side("B")
                .build();


        return Album.builder()
                .tracks(Arrays.asList(
                        wontBeLong,
                        gotToDo,
                        allMyLoving,
                        dontBotherMe,
                        littleChild,
                        tillThereWasYou,
                        pleaseMrPostman,
                        rollOverBeethoven,
                        holdMeTigh,
                        youReallyGotAHold,
                        iWannaBeYourMan,
                        devilInHerHearth,
                        notASecondTime,
                        money
                ))
                .name("With the Beatles")
                .year(1963)
                .build();
    }



    public Album getMeetTheBeatles() {

        Track holdYourHand = Track.builder()
                .durationInSeconds(144)
                .name("I Want to Hold Your Hand")
                .side("A")
                .build();

        Track standingThere = Track.builder()
                .durationInSeconds(170)
                .name("I Saw Her Standing There")
                .side("A")
                .build();


        Track thisBoy = Track.builder()
                .durationInSeconds(131)
                .name("This Boy")
                .side("A")
                .build();

        Track itWontBeLong = Track.builder()
                .durationInSeconds(131)
                .name("t Won't Be Long")
                .side("A")
                .build();

        Track allIveGotToDo = Track.builder()
                .durationInSeconds(125)
                .name("ll I've Got to Do")
                .side("A")
                .build();

        Track allMyLoving = Track.builder()
                .durationInSeconds(124)
                .name("All My Loving")
                .side("A")
                .build();

        Track dontBotherMe = Track.builder()
                .durationInSeconds(146)
                .name("Don't Bother Me")
                .side("B")
                .build();


        Track littleChild = Track.builder()
                .durationInSeconds(106)
                .name("Little Child")
                .side("B")
                .build();


        Track tillThereWasYou = Track.builder()
                .durationInSeconds(132)
                .name("Till There Was You")
                .side("B")
                .build();

        Track holdMeTight = Track.builder()
                .durationInSeconds(150)
                .name("Hold Me Tight")
                .side("B")
                .build();

        Track iWannaBeYourMan = Track.builder()
                .durationInSeconds(119)
                .name("I Wanna Be Your Man")
                .side("B")
                .build();

        Track notASecondTime = Track.builder()
                .durationInSeconds(123)
                .name("Not a Second Time")
                .side("B")
                .build();

        return Album.builder()
                .tracks(
                        Arrays.asList(
                                holdYourHand,
                                standingThere,
                                thisBoy,
                                itWontBeLong,
                                allIveGotToDo,
                                allMyLoving,
                                dontBotherMe,
                                littleChild,
                                tillThereWasYou,
                                holdMeTight,
                                iWannaBeYourMan,
                                notASecondTime

                        )
                )
                .year(1964)
                .name("Meet the Beatles!")
                .build();

    }

    public Album getBeatlesSecondAlbum() {
        Track rollOverBeethoven = Track.builder()
                .durationInSeconds(164)
                .name("Roll Over Beethoven")
                .side("A")
                .build();

        Track thankYouGirl = Track.builder()
                .durationInSeconds(121)
                .name("Thank You Girl")
                .side("A")
                .build();

        Track youReallyGotAHoldMe = Track.builder()
                .durationInSeconds(178)
                .name("You Really Got a Hold on Me")
                .side("A")
                .build();

        Track devilInHerHeart = Track.builder()
                .durationInSeconds(144)
                .name("Devil in Her Heart")
                .side("A")
                .build();

        Track money = Track.builder()
                .durationInSeconds(167)
                .name("Money (That's What I Want)")
                .side("A")
                .build();

        Track youCantDoThat = Track.builder()
                .durationInSeconds(153)
                .name("You Can't Do That")
                .side("A")
                .build();


        Track longTallSally = Track.builder()
                .durationInSeconds(123)
                .name("Long Tall Sally")
                .side("A")
                .build();

        Track iCallYourName = Track.builder()
                .durationInSeconds(129)
                .name("I Call Your Name")
                .side("A")
                .build();

        Track pleaseMisterPostman = Track.builder()
                .durationInSeconds(154)
                .name("Please Mister Postman")
                .side("A")
                .build();

        Track illGetYou = Track.builder()
                .durationInSeconds(124)
                .name("I'll Get You")
                .side("A")
                .build();

        Track sheLovesYou = Track.builder()
                .durationInSeconds(139)
                .name("She Loves You")
                .side("A")
                .build();
        return Album.builder()
                .name("The Beatles' Second Album")
                .tracks(
                        Arrays.asList(
                                rollOverBeethoven,
                                thankYouGirl,
                                youReallyGotAHoldMe,
                                devilInHerHeart,
                                money,
                                youCantDoThat,
                                longTallSally,
                                iCallYourName,
                                pleaseMisterPostman,
                                illGetYou,
                                sheLovesYou
                        )
                )
                .build();
    }

}
