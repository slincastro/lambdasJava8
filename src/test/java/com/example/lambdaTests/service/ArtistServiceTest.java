package com.example.lambdaTests.service;

import com.example.lambdaTests.domain.Artist;
import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.Assert.*;

public class ArtistServiceTest {

    @Test
    public void ShouldReturn4ArtistWhenIAskForArtists(){

        int expectedNumber = 4;

        Artist singer = Artist
                .builder()
                .name("Paul McCartney")
                .origin("London")
                .build();

        Artist drummer = Artist
                .builder()
                .name("Ringo Starr")
                .origin("London")
                .build();

        Artist singerGuitarist = Artist
                .builder()
                .name("Jhon Lennon")
                .origin("London")
                .build();

        Artist guitarist = Artist
                .builder()
                .name("George Harrison")
                .origin("London")
                .build();

        Artist beatles = Artist
                .builder()
                .name("The Beatles")
                .origin("London")
                .members(Arrays.asList(
                        singer,
                        drummer,
                        singerGuitarist,
                        guitarist
                ))
                .build();


        assertEquals(expectedNumber, beatles.getMembers().get().size());

    }

    @Test
    public void ShouldReturnOptionalWhenIASkForMusiciansThatNotExist(){

        Artist beatles = Artist
                .builder()
                .name("The Beatles")
                .origin("London")
                .build();

        assertFalse(beatles.getMembers().isPresent());
    }

}