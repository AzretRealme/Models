package Dogovor.models.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employeesInProjects")
public class EmployeeInProject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employees_id")
    private Employee employee_id;

    @ManyToOne
    @JoinColumn(name = "projects_id")
    private Project project_id;
}
