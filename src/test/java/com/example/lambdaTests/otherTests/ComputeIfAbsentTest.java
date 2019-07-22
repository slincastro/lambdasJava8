package com.example.lambdaTests.otherTests;

import com.example.lambdaTests.domain.Album;
import com.example.lambdaTests.service.AlbumService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ComputeIfAbsentTest {

    @Test
    public void TestComputeIfAbsent(){
        Map<String, List<String>> songsBySide = new AlbumService().getYellowSubmarineBySide();
        String sideA = "A";

        //songsBySide.computeIfAbsent(sideA, new AlbumService().getYellowSubmarineBySide());

        //assertEquals(7,songsBySide.get(sideA).size());

    }
}
