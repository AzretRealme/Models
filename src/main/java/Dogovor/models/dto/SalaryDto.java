package Dogovor.models.dto;

import Dogovor.models.entity.Employee;
import lombok.Data;

@Data
public class SalaryDto {
    private Long id;

    private EmployeeDto employee_id;

    private double amount;
}
