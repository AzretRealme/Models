package Dogovor.models.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String last_name;
    private String first_name;
    private String patronymic;

    @ManyToOne
    @JoinColumn(name = "positions_id")
    private Position position_id;

    @ManyToOne
    @JoinColumn(name = "addresses_id")
    private Address address;
}
