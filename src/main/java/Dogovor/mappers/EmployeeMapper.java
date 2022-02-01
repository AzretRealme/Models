package Dogovor.mappers;

import Dogovor.models.dto.EmployeeDto;
import Dogovor.models.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    Employee toEmployee(EmployeeDto employeeDto);
    EmployeeDto toEmployeeDto(Employee employee);

    List<Employee> toEmployeeList(List<EmployeeDto> employeeDtoList);
    List<EmployeeDto> toEmployeeDtoList(List<Employee> employeeList);

}
