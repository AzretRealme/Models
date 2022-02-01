package Dogovor.mappers;

import Dogovor.models.dto.PositionDto;
import Dogovor.models.entity.Position;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-01T16:34:41+0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
public class PositionMapperImpl implements PositionMapper {

    @Override
    public Position toPosition(PositionDto positionDto) {
        if ( positionDto == null ) {
            return null;
        }

        Position position = new Position();

        position.setId( positionDto.getId() );
        position.setTitle( positionDto.getTitle() );

        return position;
    }

    @Override
    public PositionDto toPositionDto(Position position) {
        if ( position == null ) {
            return null;
        }

        PositionDto positionDto = new PositionDto();

        positionDto.setId( position.getId() );
        positionDto.setTitle( position.getTitle() );

        return positionDto;
    }

    @Override
    public List<Position> toPositionList(List<PositionDto> positionDtoList) {
        if ( positionDtoList == null ) {
            return null;
        }

        List<Position> list = new ArrayList<Position>( positionDtoList.size() );
        for ( PositionDto positionDto : positionDtoList ) {
            list.add( toPosition( positionDto ) );
        }

        return list;
    }

    @Override
    public List<PositionDto> toPositionDtoList(List<Position> positionList) {
        if ( positionList == null ) {
            return null;
        }

        List<PositionDto> list = new ArrayList<PositionDto>( positionList.size() );
        for ( Position position : positionList ) {
            list.add( toPositionDto( position ) );
        }

        return list;
    }
}
