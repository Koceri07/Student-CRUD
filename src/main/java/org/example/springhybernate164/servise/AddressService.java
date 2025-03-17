package org.example.springhybernate164.servise;

import lombok.RequiredArgsConstructor;
import org.example.springhybernate164.repository.AdressRepository;
import org.example.springhybernate164.Entity.AdressEntity;
import org.example.springhybernate164.dto.AddressDto;
import org.example.springhybernate164.mapper.AddressMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {
    private final AdressRepository adressRepository;

    public void createAdress(AddressDto addressDto){
        AdressEntity entity = AddressMapper.toEntity(addressDto);
        adressRepository.save(entity);
    }
}
