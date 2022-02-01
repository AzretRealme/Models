package Dogovor.models.dto;

import lombok.Data;

import java.time.LocalDate;


@Data
public class ProjectDto {

    private Long id;

    private String name;
    private LocalDate start_date;
    private LocalDate end_date;
    private int days_in_project;
}
