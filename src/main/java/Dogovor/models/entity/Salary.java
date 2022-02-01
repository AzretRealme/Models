package Dogovor.models.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "salaries")
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employees_id")
    private Employee employee_id;

    private double amount;
}
