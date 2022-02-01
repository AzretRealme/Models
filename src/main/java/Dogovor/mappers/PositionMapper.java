package Dogovor.mappers;

import Dogovor.models.dto.EmployeeDto;
import Dogovor.models.dto.PositionDto;
import Dogovor.models.entity.Employee;
import Dogovor.models.entity.Position;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PositionMapper {

    PositionMapper INSTANCE = Mappers.getMapper(PositionMapper.class);

    Position toPosition(PositionDto positionDto);
    PositionDto toPositionDto(Position position);

    List<Position> toPositionList(List<PositionDto> positionDtoList);
    List<PositionDto> toPositionDtoList(List<Position> positionList);

}
