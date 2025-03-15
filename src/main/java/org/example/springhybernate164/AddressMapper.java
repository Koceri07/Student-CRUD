package org.example.springhybernate164;

public class AddressMapper {

    public static AdressEntity toEntity(AddressDto addressDto){
        var entity = new AdressEntity();
        entity.setCity(addressDto.getCity());
        entity.setStreet(addressDto.getStreet());
        entity.setId(addressDto.getId());
        return entity;
    }

    public static AddressDto toDto(AdressEntity adressEntity){
        var dto = new  AddressDto();
        dto.setCity(adressEntity.getCity());
        dto.setStreet(adressEntity.getStreet());
        dto.setId(adressEntity.getId());
        return dto;
    }
}
