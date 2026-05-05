package com.projectmannage.ProjetMannage.domain.entity;

import com.projectmannage.ProjetMannage.model.ProjectStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "project")
@Data
//@Getter
//Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private LocalDate initialDate;

    @Column(nullable = false)
    private LocalDate finalDate;

    @Column(nullable = false)
    private ProjectStatus status;

    static void main(String[] args) {
        Project project = Project.builder()
                .description("teste")
                .finalDate(LocalDate.now())
                .initialDate(LocalDate.now()).build();
    }
}
