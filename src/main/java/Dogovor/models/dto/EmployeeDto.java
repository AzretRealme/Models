package Dogovor.models.dto;

import Dogovor.models.entity.Position;
import lombok.Data;

import javax.persistence.*;

@Data
public class EmployeeDto {

    private Long id;
    private String last_name;
    private String first_name;
    private String patronymic;

    Position position_id;
}
