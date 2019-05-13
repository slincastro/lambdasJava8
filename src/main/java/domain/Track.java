package domain;

import lombok.Builder;

import java.sql.Time;

/**
 * Created by scastro on 12/5/19.
 */
@Builder

public class Track {
    private String name;
    private Integer durationInSeconds;

}
