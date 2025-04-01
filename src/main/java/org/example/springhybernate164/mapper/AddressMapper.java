package org.example.springhybernate164.mapper;

import org.example.springhybernate164.Entity.AdressEntity;
import org.example.springhybernate164.dto.AddressDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    @Mapping(target = "id", ignore = true)
    AdressEntity toEntity(AddressDto addressDto);

    AddressDto toDto(AdressEntity adressEntity);

//    public static AdressEntity toEntity(AddressDto addressDto){
//        var entity = new AdressEntity();
//        entity.setCity(addressDto.getCity());
//        entity.setStreet(addressDto.getStreet());
//        entity.setId(addressDto.getId());
//        return entity;
//    }
//
//    public static AddressDto toDto(AdressEntity adressEntity){
//        var dto = new  AddressDto();
//        dto.setCity(adressEntity.getCity());
//        dto.setStreet(adressEntity.getStreet());
//        dto.setId(adressEntity.getId());
//        return dto;
//    }
}
