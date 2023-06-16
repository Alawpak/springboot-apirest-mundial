package com.springboot.apirest.mundial.service.dto.team;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class TeamResponse {
    private String status;
    @JsonProperty("data")
    private List<Team> teams;
}
