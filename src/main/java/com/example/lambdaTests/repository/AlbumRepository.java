package com.example.lambdaTests.repository;

import com.example.lambdaTests.domain.Album;

public interface AlbumRepository {

     Album getYellowSubmarine();
     Album getPleasePleaseMe();

     default Album GetAbeyRoad(){
         return  Album.builder().name("Abey Road").build();
     }

}
