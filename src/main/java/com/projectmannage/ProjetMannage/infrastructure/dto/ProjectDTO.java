package com.projectmannage.ProjetMannage.infrastructure.dto;

import com.projectmannage.ProjetMannage.domain.entity.Project;
import com.projectmannage.ProjetMannage.model.ProjectStatus;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;


@Data
public class ProjectDTO {

    private final UUID id;
    private final String name;
    private final String description;
    private final LocalDate initialDate;
    private final LocalDate finalDate;
    private final ProjectStatus status;

    public static ProjectDTO create(Project project){
        return new ProjectDTO(
                project.getId(),
                project.getName(),
                project.getDescription(),
                project.getInitialDate(),
                project.getFinalDate(),
                project.getStatus()
        );
    }
}
