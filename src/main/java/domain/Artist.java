package domain;

import lombok.Builder;

import java.util.List;
import java.util.function.Consumer;

/**
 * Created by scastro on 4/5/19.
 */
@Builder
public class Artist {

    public String name;
    public List<Artist> Members;
    public String origin;

}
