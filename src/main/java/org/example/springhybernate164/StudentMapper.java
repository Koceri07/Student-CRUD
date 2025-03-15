package org.example.springhybernate164;

public class StudentMapper {

    public static StudentEntity toStudentEntity(StudentDto studentDto){
        var student = new StudentEntity();
        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());
        student.setAge(studentDto.getAge());
        student.setId(studentDto.getId());
        student.setAdress(AddressMapper.toEntity(studentDto.getAddress()));
        return student;
    }

    public static StudentDto toStudentDto(StudentEntity studentEntity){
        var student = new StudentDto();
        student.setFirstName(studentEntity.getFirstName());
        student.setLastName(studentEntity.getLastName());
        student.setAge(studentEntity.getAge());
        student.setId(studentEntity.getId());
        student.setAddress(AddressMapper.toDto(studentEntity.getAdress()));
        return student;
    }
}
