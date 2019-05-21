package com.example.lambdaTests.service;

import com.example.lambdaTests.domain.Artist;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class ArtistServiceTest {

    @Test
    public void ShouldReturn4ArtistWhenIAskForArtists(){

        int expectedNumber = 4;

        List<Artist> beatles = new ArtistService().GetBeatles();

        assertEquals(expectedNumber, beatles.size());

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