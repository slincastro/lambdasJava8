package com.example.lambdaTests.service;

import com.example.lambdaTests.domain.Album;
import com.example.lambdaTests.domain.Track;
import com.example.lambdaTests.repository.RepsitoryImpl.AlbumRepositoryImpl;

import java.util.IntSummaryStatistics;

/**
 * Created by scastro on 4/5/19.
 */
public class AlbumService {
    public Album getYellowSubmarine() {
        return new AlbumRepositoryImpl().GetYellowSubmarine();
    }

    public IntSummaryStatistics getYellowSubmarineStatisticsByDuration() {
        return new AlbumRepositoryImpl()
                .GetYellowSubmarine()
                .getTracks()
                .stream()
                .mapToInt(Track::getDurationInSeconds)
                .summaryStatistics();
    }
}
