package Dogovor.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;

    @ManyToOne
    @JoinColumn(name = "employees_id")
    private Employee employee_id;
}
