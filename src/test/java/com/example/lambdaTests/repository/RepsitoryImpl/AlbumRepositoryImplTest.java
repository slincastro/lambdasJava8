package com.example.lambdaTests.repository.RepsitoryImpl;

import com.example.lambdaTests.domain.Album;
import com.example.lambdaTests.repository.AlbumRepository;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlbumRepositoryImplTest {

    @Test
    public void shouldGetNameOfAbeyRoadAlbum()
    {
        AlbumRepository repository = new AlbumRepositoryImpl();
        String expectedAlbumName = "Abey Road";

        Album abeyRoad = repository.GetAbeyRoad();

        assertEquals(expectedAlbumName, abeyRoad.getName());
    }
}