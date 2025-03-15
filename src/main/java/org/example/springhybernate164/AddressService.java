package org.example.springhybernate164;

import lombok.RequiredArgsConstructor;
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
