package ru.nessing.interview.lessonSpring.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nessing.interview.lessonSpring.entities.Student;
import ru.nessing.interview.lessonSpring.repositories.AppRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AppService {

    private final AppRepository repository;

    public List<Student> findAll() {
        return repository.findAll();
    }

    public String saveStudent(Student student) {
        repository.save(student);
        return "пользователь " + student.getName() + " добавлен id: " + student.getId();
    }

    public String updateStudent(Long id, String name, int age) {
        Student studentCurrent = repository.getById(id);
        studentCurrent.setName(name);
        studentCurrent.setAge(age);
        return "пользователь " + studentCurrent.getName() + " обновлен";
    }

    public Optional<Student> getStudentById(Long id) {
        return repository.findById(id);
    }

    public void deleteStudentById(Long id) {
        repository.deleteById(id);
    }

}
