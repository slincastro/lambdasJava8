package com.example.lambdaTests.domain;

import lombok.Builder;

import java.util.List;

/**
 * Created by scastro on 4/5/19.
 */
@Builder
public class Artist {

    public String name;
    public List<Artist> Members;
    public String origin;

}
