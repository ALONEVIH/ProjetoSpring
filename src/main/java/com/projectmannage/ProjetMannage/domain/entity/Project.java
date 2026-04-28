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
    private LocalDate initial_date;

    @Column(nullable = false)
    private LocalDate final_date;

    @Column(nullable = false)
    private ProjectStatus status;

    static void main(String[] args) {
        Project project = Project.builder()
                .description("teste")
                .final_date(LocalDate.now())
                .initial_date(LocalDate.now()).build();
    }
}
