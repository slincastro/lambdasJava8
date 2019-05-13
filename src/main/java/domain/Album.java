package domain;

import lombok.Builder;

import java.util.List;

/**
 * Created by scastro on 12/5/19.
 */
@Builder
public class Album {
    String Name;
    List<Track> Traks;
    List<Artist> Musicians;
}
