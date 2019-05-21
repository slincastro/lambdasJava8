package com.example.lambdaTests.domain;

import lombok.Builder;
import lombok.Getter;

/**
 * Created by scastro on 12/5/19.
 */
@Builder
@Getter
public class Track {
    private String name;
    private Integer durationInSeconds;
    private String side;
    private Artist leadSinger;

}
