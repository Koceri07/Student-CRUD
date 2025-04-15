package org.example.springhybernate164.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.example.springhybernate164.dto.StudentDto;
import org.example.springhybernate164.servise.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/students")
@RequiredArgsConstructor
@Tag(name = "Student", description = "Student API")
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody StudentDto studentDto){
        studentService.createStudent(studentDto);
    }

    @GetMapping("/{id}")
    public StudentDto getStudent(@PathVariable Long id){
        return studentService.getSutudentById(id);
    }

    @GetMapping()
    public List<StudentDto> getAllStudents(){
        return studentService.getAllStudents();
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@PathVariable Long id){
            studentService.deleteStudentById(id);
    }
}