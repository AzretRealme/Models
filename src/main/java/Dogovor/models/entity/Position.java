package Dogovor.models.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "positions")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
}
