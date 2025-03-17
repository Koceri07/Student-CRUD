package org.example.springhybernate164.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto {
    private String firstName;
    private String lastName;
    private int age;
    private int id;
}
