package ru.nessing.interview.lessonSpring.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.nessing.interview.lessonSpring.entities.Student;
import ru.nessing.interview.lessonSpring.services.AppService;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AppController {
    private final AppService service;

    @GetMapping("get_text/{text}")
    public String test(@PathVariable String text) {
        return text;
    }

    @GetMapping("/get_id/{id}")
    public Optional<Student> getStudent(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    @PostMapping
    public String saveNewStudent(@RequestBody Student student) {
        student.setId(null);
        return service.saveStudent(student);
    }

    @PostMapping("updateStudent/{id} {name} {age}")
    public String updateStudent(@PathVariable Long id, String name, int age) {
        return service.updateStudent(id, name, age);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Long id) {
        service.deleteStudentById(id);
    }
}
