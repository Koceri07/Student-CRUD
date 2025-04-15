package org.example.springhybernate164.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {


    private Long id;
    @Length(min = 3,max = 20)
    private String firstName;
    @Length(min = 6, max = 30)
    private String lastName;
    private int age;
    private AddressDto address;
}
