package org.example.springhybernate164;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class StudentService {
    private final StudentRepository studentRepository;
    private final AddressService addressService;

        public void createStudent(StudentDto studentDto){
            log.info("ActionLog.createStudent.start for name {}", studentDto.getFirstName());
            StudentEntity studentEntity = StudentMapper.toStudentEntity(studentDto);
            addressService.createAdress(studentDto.getAddress());
            studentRepository.save(studentEntity);
            log.info("ActionLog.createStudent.end for name {}", studentDto.getFirstName());
    }

    public StudentDto getSutudentById(Long id){
            log.info("ActionLog.getStudentById.start for id: {}", id);
        var studentEntity =  studentRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Student not Found"));

        log.info("ActionLog.getStudentById.end for id: {}", id);
        return StudentMapper.toStudentDto(studentEntity);
    }

    public List<StudentDto> getAllStudents(){
            return studentRepository.findAll()
                    .stream()
                    .map(StudentMapper::toStudentDto)
                    .toList();
    }

    public void deleteStudentById(Long id){
            studentRepository.deleteById(id);
    }
}
