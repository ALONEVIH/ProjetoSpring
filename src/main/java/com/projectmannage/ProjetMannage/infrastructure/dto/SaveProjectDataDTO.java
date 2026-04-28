package com.projectmannage.ProjetMannage.infrastructure.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class SaveProjectDataDTO {

    private final String name;
    private final String description;
    private final LocalDate initial_date;
    private final LocalDate final_date;
    private final String status;

}
