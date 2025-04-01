package org.example.springhybernate164.mapper;

import org.example.springhybernate164.Entity.StudentEntity;
import org.example.springhybernate164.dto.StudentDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {

    StudentMapper INSTENCE = Mappers.getMapper(StudentMapper.class);


    @Mapping(target = "id",ignore = true)
    StudentDto toDto(StudentEntity studentEntity);

    StudentEntity toEntity(StudentDto studentDto);
}

