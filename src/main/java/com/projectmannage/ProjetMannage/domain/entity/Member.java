package com.projectmannage.ProjetMannage.domain.entity;

import java.util.List;
import java.util.UUID;

public class Member {

    private UUID id;
    private String secret;
    private String name;
    private String email;
    private Boolean delete;
    private List<Project> projects;
}
