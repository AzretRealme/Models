package Dogovor.mappers;

import Dogovor.models.dto.EmployeeDto;
import Dogovor.models.dto.EmployeeInProjectDto;
import Dogovor.models.entity.Employee;
import Dogovor.models.entity.EmployeeInProject;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EmployeeInProjectMapper {
    EmployeeInProjectMapper INSTANCE = Mappers.getMapper(EmployeeInProjectMapper.class);

    EmployeeInProject toEmployeeInProject(EmployeeInProjectDto employeeInProjectDto);
    EmployeeInProjectDto toEmployeeInProjectDto(EmployeeInProject employeeInProject);

    List<EmployeeInProject> toEmployeeInProjectList(List<EmployeeInProjectDto> employeeInProjectDtoList);
    List<EmployeeInProjectDto> toEmployeeInProjectDtoList(List<EmployeeInProject> employeeInProjectList);
}
