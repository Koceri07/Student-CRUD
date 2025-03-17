package org.example.springhybernate164.controller;

import lombok.RequiredArgsConstructor;
import org.example.springhybernate164.dto.StudentDto;
import org.example.springhybernate164.servise.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody StudentDto studentDto){
        studentService.createStudent(studentDto);
    }

    @GetMapping("/{id}")
    public List<StudentDto> getAllStudents(@PathVariable Long id){
        return studentService.getAllStudents();
    }
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@PathVariable Long id){
            studentService.deleteStudentById(id);
    }


}
