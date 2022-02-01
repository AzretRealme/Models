package Dogovor.mappers;

import Dogovor.models.dto.AddressDto;
import Dogovor.models.dto.EmployeeDto;
import Dogovor.models.entity.Address;
import Dogovor.models.entity.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-01T16:34:42+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
public class AddressMapperImpl implements AddressMapper {

    @Override
    public Address toAddress(AddressDto addressDto) {
        if ( addressDto == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( addressDto.getId() );
        address.setStreet( addressDto.getStreet() );
        address.setEmployee_id( employeeDtoToEmployee( addressDto.getEmployee_id() ) );

        return address;
    }

    @Override
    public AddressDto toAddressDto(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDto addressDto = new AddressDto();

        addressDto.setId( address.getId() );
        addressDto.setStreet( address.getStreet() );
        addressDto.setEmployee_id( employeeToEmployeeDto( address.getEmployee_id() ) );

        return addressDto;
    }

    @Override
    public List<Address> toAddressList(List<AddressDto> addressDtoList) {
        if ( addressDtoList == null ) {
            return null;
        }

        List<Address> list = new ArrayList<Address>( addressDtoList.size() );
        for ( AddressDto addressDto : addressDtoList ) {
            list.add( toAddress( addressDto ) );
        }

        return list;
    }

    @Override
    public List<AddressDto> toAddressDtoList(List<Address> addressList) {
        if ( addressList == null ) {
            return null;
        }

        List<AddressDto> list = new ArrayList<AddressDto>( addressList.size() );
        for ( Address address : addressList ) {
            list.add( toAddressDto( address ) );
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
