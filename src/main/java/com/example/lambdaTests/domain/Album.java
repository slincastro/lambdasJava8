package com.example.lambdaTests.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by scastro on 12/5/19.
 */
@Builder
@Getter
public class Album {
    String name;
    int year;
    List<Track> tracks;
    List<Artist> musicians;

    public Track getLongestTrack() {
        return tracks
                .stream()
                .max(Comparator.comparing(Track::getDurationInSeconds))
                .orElseThrow(NoSuchElementException::new);
    }
}
