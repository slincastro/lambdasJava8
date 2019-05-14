package com.example.lambdaTests.repository;

import com.example.lambdaTests.domain.Album;

public interface AlbumRepository {

     Album GetYellowSubmarine();
     Album GetPleasePleaseMe();

     default Album GetAbeyRoad(){
         return  Album.builder().name("Abey Road").build();
     }

}
