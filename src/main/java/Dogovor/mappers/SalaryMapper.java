package Dogovor.mappers;

import Dogovor.models.dto.PositionDto;
import Dogovor.models.dto.SalaryDto;
import Dogovor.models.entity.Position;
import Dogovor.models.entity.Salary;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SalaryMapper {
    SalaryMapper INSTANCE = Mappers.getMapper(SalaryMapper.class);

    Salary toSalary(SalaryDto salaryDto);
    SalaryDto toSalaryDto(Salary salary);

    List<Salary> toSalaryList(List<SalaryDto> salaryDtoList);
    List<SalaryDto> toSalaryDtoList(List<Salary> salaryList);
}
