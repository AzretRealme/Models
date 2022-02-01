package Dogovor.mappers;

import Dogovor.models.dto.EmployeeDto;
import Dogovor.models.dto.SalaryDto;
import Dogovor.models.entity.Employee;
import Dogovor.models.entity.Salary;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-01T16:34:42+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
public class SalaryMapperImpl implements SalaryMapper {

    @Override
    public Salary toSalary(SalaryDto salaryDto) {
        if ( salaryDto == null ) {
            return null;
        }

        Salary salary = new Salary();

        salary.setId( salaryDto.getId() );
        salary.setEmployee_id( employeeDtoToEmployee( salaryDto.getEmployee_id() ) );
        salary.setAmount( salaryDto.getAmount() );

        return salary;
    }

    @Override
    public SalaryDto toSalaryDto(Salary salary) {
        if ( salary == null ) {
            return null;
        }

        SalaryDto salaryDto = new SalaryDto();

        salaryDto.setId( salary.getId() );
        salaryDto.setEmployee_id( employeeToEmployeeDto( salary.getEmployee_id() ) );
        salaryDto.setAmount( salary.getAmount() );

        return salaryDto;
    }

    @Override
    public List<Salary> toSalaryList(List<SalaryDto> salaryDtoList) {
        if ( salaryDtoList == null ) {
            return null;
        }

        List<Salary> list = new ArrayList<Salary>( salaryDtoList.size() );
        for ( SalaryDto salaryDto : salaryDtoList ) {
            list.add( toSalary( salaryDto ) );
        }

        return list;
    }

    @Override
    public List<SalaryDto> toSalaryDtoList(List<Salary> salaryList) {
        if ( salaryList == null ) {
            return null;
        }

        List<SalaryDto> list = new ArrayList<SalaryDto>( salaryList.size() );
        for ( Salary salary : salaryList ) {
            list.add( toSalaryDto( salary ) );
        }

        return list;
    }

    protected Employee employeeDtoToEmployee(EmployeeDto employeeDto) {
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

    protected EmployeeDto employeeToEmployeeDto(Employee employee) {
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
}
