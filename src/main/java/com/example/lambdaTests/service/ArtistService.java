package com.example.lambdaTests.service;

import com.example.lambdaTests.domain.Artist;
import com.example.lambdaTests.repository.RepsitoryImpl.ArtistRepositoryImpl;

import java.util.List;

public class ArtistService {

    public List<Artist> GetBeatles() {
        return new ArtistRepositoryImpl().GetBeatles().members;
    }
}
