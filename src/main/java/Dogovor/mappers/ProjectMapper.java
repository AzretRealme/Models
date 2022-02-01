package Dogovor.mappers;

import Dogovor.models.dto.PositionDto;
import Dogovor.models.dto.ProjectDto;
import Dogovor.models.entity.Position;
import Dogovor.models.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProjectMapper {
    ProjectMapper INSTANCE = Mappers.getMapper(ProjectMapper.class);

    Project toProject(ProjectDto projectDto);
    ProjectDto toProjectDto(Project project);

    List<Project> toProjectList(List<ProjectDto> projectDtoList);
    List<ProjectDto> toProjectDtoList(List<Project> projectList);
}
