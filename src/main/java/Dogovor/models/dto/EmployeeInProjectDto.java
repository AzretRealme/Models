package Dogovor.models.dto;

import Dogovor.models.entity.Employee;
import Dogovor.models.entity.Project;
import lombok.Data;

import javax.persistence.*;


@Data
public class EmployeeInProjectDto {

    private Long id;

    private EmployeeDto employee_id;

    private ProjectDto project_id;
}
