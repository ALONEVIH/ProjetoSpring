package com.projectmannage.ProjetMannage.aplicationservice;


import com.projectmannage.ProjetMannage.domain.entity.Project;
import com.projectmannage.ProjetMannage.infrastructure.dto.SaveProjectDataDTO;
import com.projectmannage.ProjetMannage.model.ProjectStatus;
import com.projectmannage.ProjetMannage.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Transactional
    public Project createProject(SaveProjectDataDTO saveProjectData){
        Project project = Project
                .builder()
                .name(saveProjectData.getName())
                .description(saveProjectData.getDescription())
                .initial_date(saveProjectData.getInitial_date())
                .final_date(saveProjectData.getFinal_date())
                .status(ProjectStatus.PEDDING)
                .build();

        projectRepository.save(project);
        return project;
    }

}
