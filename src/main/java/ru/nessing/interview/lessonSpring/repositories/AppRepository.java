package ru.nessing.interview.lessonSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nessing.interview.lessonSpring.entities.Student;

@Repository
public interface AppRepository extends JpaRepository<Student, Long> {

}
