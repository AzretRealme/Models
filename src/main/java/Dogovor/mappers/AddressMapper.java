package Dogovor.mappers;

import Dogovor.models.dto.AddressDto;
import Dogovor.models.dto.PositionDto;
import Dogovor.models.entity.Address;
import Dogovor.models.entity.Position;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address toAddress(AddressDto addressDto);
    AddressDto toAddressDto(Address address);

    List<Address> toAddressList(List<AddressDto> addressDtoList);
    List<AddressDto> toAddressDtoList(List<Address> addressList);
}
