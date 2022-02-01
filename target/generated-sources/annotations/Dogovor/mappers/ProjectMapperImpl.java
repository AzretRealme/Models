package Dogovor.mappers;

import Dogovor.models.dto.ProjectDto;
import Dogovor.models.entity.Project;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-01T16:34:41+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
public class ProjectMapperImpl implements ProjectMapper {

    @Override
    public Project toProject(ProjectDto projectDto) {
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

    @Override
    public ProjectDto toProjectDto(Project project) {
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

    @Override
    public List<Project> toProjectList(List<ProjectDto> projectDtoList) {
        if ( projectDtoList == null ) {
            return null;
        }

        List<Project> list = new ArrayList<Project>( projectDtoList.size() );
        for ( ProjectDto projectDto : projectDtoList ) {
            list.add( toProject( projectDto ) );
        }

        return list;
    }

    @Override
    public List<ProjectDto> toProjectDtoList(List<Project> projectList) {
        if ( projectList == null ) {
            return null;
        }

        List<ProjectDto> list = new ArrayList<ProjectDto>( projectList.size() );
        for ( Project project : projectList ) {
            list.add( toProjectDto( project ) );
        }

        return list;
    }
}
