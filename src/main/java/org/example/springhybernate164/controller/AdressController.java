package org.example.springhybernate164.controller;

import lombok.RequiredArgsConstructor;
import org.example.springhybernate164.dto.AddressDto;
import org.example.springhybernate164.repository.AdressRepository;
import org.example.springhybernate164.servise.AddressService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/adresses")
@RequiredArgsConstructor
public class AdressController {
    private final AddressService addressService;

    @PostMapping
    public void create(AddressDto addressDto){
        addressService.createAdress(addressDto);
    }

    @GetMapping("/{id}")
    public AddressDto getById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }
}
