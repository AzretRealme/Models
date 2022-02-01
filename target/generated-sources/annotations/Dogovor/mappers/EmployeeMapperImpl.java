package Dogovor.mappers;

import Dogovor.models.dto.EmployeeDto;
import Dogovor.models.entity.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-01T16:34:42+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee toEmployee(EmployeeDto employeeDto) {
        if ( employeeDto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId( employeeDto.getId() );
        employee.setLast_name( employeeDto.getLast_name() );
        employee.setFirst_name( employeeDto.getFirst_name() );
        employee.setPatronymic( employeeDto.getPatronymic() );
        employee.setPosition_id( employeeDto.getPosition_id() );

        return employee;
    }

    @Override
    public EmployeeDto toEmployeeDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setId( employee.getId() );
        employeeDto.setLast_name( employee.getLast_name() );
        employeeDto.setFirst_name( employee.getFirst_name() );
        employeeDto.setPatronymic( employee.getPatronymic() );
        employeeDto.setPosition_id( employee.getPosition_id() );

        return employeeDto;
    }

    @Override
    public List<Employee> toEmployeeList(List<EmployeeDto> employeeDtoList) {
        if ( employeeDtoList == null ) {
            return null;
        }

        List<Employee> list = new ArrayList<Employee>( employeeDtoList.size() );
        for ( EmployeeDto employeeDto : employeeDtoList ) {
            list.add( toEmployee( employeeDto ) );
        }

        return list;
    }

    @Override
    public List<EmployeeDto> toEmployeeDtoList(List<Employee> employeeList) {
        if ( employeeList == null ) {
            return null;
        }

        List<EmployeeDto> list = new ArrayList<EmployeeDto>( employeeList.size() );
        for ( Employee employee : employeeList ) {
            list.add( toEmployeeDto( employee ) );
        }

        return list;
    }
}
