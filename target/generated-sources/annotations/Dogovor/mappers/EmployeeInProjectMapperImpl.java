package Dogovor.mappers;

import Dogovor.models.dto.EmployeeDto;
import Dogovor.models.dto.EmployeeInProjectDto;
import Dogovor.models.dto.ProjectDto;
import Dogovor.models.entity.Employee;
import Dogovor.models.entity.EmployeeInProject;
import Dogovor.models.entity.Project;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-01T16:34:42+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
public class EmployeeInProjectMapperImpl implements EmployeeInProjectMapper {

    @Override
    public EmployeeInProject toEmployeeInProject(EmployeeInProjectDto employeeInProjectDto) {
        if ( employeeInProjectDto == null ) {
            return null;
        }

        EmployeeInProject employeeInProject = new EmployeeInProject();

        employeeInProject.setId( employeeInProjectDto.getId() );
        employeeInProject.setEmployee_id( employeeDtoToEmployee( employeeInProjectDto.getEmployee_id() ) );
        employeeInProject.setProject_id( projectDtoToProject( employeeInProjectDto.getProject_id() ) );

        return employeeInProject;
    }

    @Override
    public EmployeeInProjectDto toEmployeeInProjectDto(EmployeeInProject employeeInProject) {
        if ( employeeInProject == null ) {
            return null;
        }

        EmployeeInProjectDto employeeInProjectDto = new EmployeeInProjectDto();

        employeeInProjectDto.setId( employeeInProject.getId() );
        employeeInProjectDto.setEmployee_id( employeeToEmployeeDto( employeeInProject.getEmployee_id() ) );
        employeeInProjectDto.setProject_id( projectToProjectDto( employeeInProject.getProject_id() ) );

        return employeeInProjectDto;
    }

    @Override
    public List<EmployeeInProject> toEmployeeInProjectList(List<EmployeeInProjectDto> employeeInProjectDtoList) {
        if ( employeeInProjectDtoList == null ) {
            return null;
        }

        List<EmployeeInProject> list = new ArrayList<EmployeeInProject>( employeeInProjectDtoList.size() );
        for ( EmployeeInProjectDto employeeInProjectDto : employeeInProjectDtoList ) {
            list.add( toEmployeeInProject( employeeInProjectDto ) );
        }

        return list;
    }

    @Override
    public List<EmployeeInProjectDto> toEmployeeInProjectDtoList(List<EmployeeInProject> employeeInProjectList) {
        if ( employeeInProjectList == null ) {
            return null;
        }

        List<EmployeeInProjectDto> list = new ArrayList<EmployeeInProjectDto>( employeeInProjectList.size() );
        for ( EmployeeInProject employeeInProject : employeeInProjectList ) {
            list.add( toEmployeeInProjectDto( employeeInProject ) );
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

    protected Project projectDtoToProject(ProjectDto projectDto) {
        if ( projectDto == null ) {
            return null;
        }

        Project project = new Project();

        project.setId( projectDto.getId() );
        project.setName( projectDto.getName() );
        project.setStart_date( projectDto.getStart_date() );
        project.setEnd_date( projectDto.getEnd_date() );
        project.setDays_in_project( projectDto.getDays_in_project() );

        return project;
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

    protected ProjectDto projectToProjectDto(Project project) {
        if ( project == null ) {
            return null;
        }

        ProjectDto projectDto = new ProjectDto();

        projectDto.setId( project.getId() );
        projectDto.setName( project.getName() );
        projectDto.setStart_date( project.getStart_date() );
        projectDto.setEnd_date( project.getEnd_date() );
        projectDto.setDays_in_project( project.getDays_in_project() );

        return projectDto;
    }
}
