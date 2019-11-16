package com.example.lambdaTests.controllers;

import com.example.lambdaTests.domain.Album;
import com.example.lambdaTests.service.AlbumService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class DiskController {

    @RequestMapping(value = "/record", method = RequestMethod.GET, produces = {"application/json"})
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Album getRecord(){
        AlbumService album = new AlbumService();

        return album.getYellowSubmarine();
    }
}
