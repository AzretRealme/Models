package Dogovor.models.dto;

import Dogovor.models.entity.Employee;
import lombok.Data;

import javax.persistence.*;

@Data
public class AddressDto {

    private Long id;
    private String street;

    private EmployeeDto employee_id;
}
