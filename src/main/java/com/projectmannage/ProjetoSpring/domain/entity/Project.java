package com.projectmannage.ProjetoSpring.domain.entity;

import com.projectmannage.ProjetoSpring.model.ProjectStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    @GeneratedValue
    private UUID id;
    private String name;
    private String description;
    private LocalDate initial_date;
    private LocalDate final_date;
    private ProjectStatus status;

    static void main(String[] args) {
        Project project = Project.builder()
                .description("teste")
                .final_date(LocalDate.now())
                .initial_date(LocalDate.now()).build();
    }
}
