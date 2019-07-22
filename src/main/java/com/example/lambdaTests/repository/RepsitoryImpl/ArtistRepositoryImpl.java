package com.example.lambdaTests.repository.RepsitoryImpl;

import com.example.lambdaTests.domain.Artist;
import com.example.lambdaTests.repository.ArtistRepository;

import java.util.Arrays;

public class ArtistRepositoryImpl implements ArtistRepository {

    @Override
    public Artist GetBeatles() {
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

        return Artist
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
    }
}
