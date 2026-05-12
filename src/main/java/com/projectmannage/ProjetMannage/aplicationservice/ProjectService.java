package com.projectmannage.ProjetMannage.aplicationservice;


import com.projectmannage.ProjetMannage.domain.entity.Project;
import com.projectmannage.ProjetMannage.infrastructure.dto.SaveProjectDataDTO;
import com.projectmannage.ProjetMannage.model.ProjectStatus;
import com.projectmannage.ProjetMannage.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Transactional
    public Project createProject(SaveProjectDataDTO saveProjectData){
        Project project = Project
                .builder()
                .name(saveProjectData.getName())
                .description(saveProjectData.getDescription())
                .initialDate(saveProjectData.getInitialDate())
                .finalDate(saveProjectData.getFinalDate())
                .status(ProjectStatus.PEDDING)
                .build();

        projectRepository.save(project);
        log.info("Project created: {}", project);
        return project;
    }

}
