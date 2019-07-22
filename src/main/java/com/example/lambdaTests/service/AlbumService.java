package com.example.lambdaTests.service;

import com.example.lambdaTests.domain.Album;
import com.example.lambdaTests.domain.Track;
import com.example.lambdaTests.repository.RepsitoryImpl.AlbumRepositoryImpl;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;

/**
 * Created by scastro on 4/5/19.
 */
public class AlbumService {
    public Album getYellowSubmarine() {
        return new AlbumRepositoryImpl().getYellowSubmarine();
    }

    public IntSummaryStatistics getYellowSubmarineStatisticsByDuration() {
        return new AlbumRepositoryImpl()
                .getYellowSubmarine()
                .getTracks()
                .stream()
                .mapToInt(Track::getDurationInSeconds)
                .summaryStatistics();
    }

    public Map<String, List<String>> getYellowSubmarineBySide() {
        return null;
    }
}
