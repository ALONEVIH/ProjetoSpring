package com.projectmannage.ProjetoSpring.domain.entity;

import com.projectmannage.ProjetoSpring.model.TaskStatus;
import java.util.UUID;

public class Task {

    private UUID id;
    private String title;
    private String description;
    private Integer numberOfDays;
    private TaskStatus status;
    private Project project;
    private Member assignMember;

}

