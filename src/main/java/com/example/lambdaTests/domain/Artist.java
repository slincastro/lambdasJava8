package com.example.lambdaTests.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.Optional;

/**
 * Created by scastro on 4/5/19.
 */
@Builder
@Getter
public class Artist {

    public String name;
    public List<Artist> members;
    public String origin;

    public Optional<List<Artist>> getMembers(){
        return (members != null && this.members.size() > 0) ? Optional.of(this.members) : Optional.empty();
    }

}
