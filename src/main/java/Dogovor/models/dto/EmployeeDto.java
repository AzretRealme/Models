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

    private PositionDto position_id;
    private AddressDto address_id;
}
