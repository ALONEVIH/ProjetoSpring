package com.projectmannage.ProjetMannage.repository;

import com.projectmannage.ProjetMannage.domain.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, String> {

}
