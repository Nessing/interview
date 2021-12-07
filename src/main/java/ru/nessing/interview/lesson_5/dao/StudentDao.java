package ru.nessing.interview.lesson_5.dao;

import org.hibernate.Session;
import ru.nessing.interview.lesson_5.entities.StudentEntity;

import java.util.ArrayList;

public class StudentDao extends Dao<StudentEntity> {

    private Session session;

    public StudentDao(Session session) {
        this.session = session;
    }

    @Override
    public void insert(StudentEntity student) {
        session.save(student);
        session.flush();
        session.getTransaction().commit();
    }

    @Override
    public StudentEntity getById(long id) {
        return session.find(StudentEntity.class, id);
    }

    @Override
    public void updateById(long id, StudentEntity student) {
        StudentEntity studentEntity = session.find(StudentEntity.class, id);
        studentEntity.setName(student.getName());
        studentEntity.setMark(student.getMark());
        session.update(studentEntity);
        session.flush();
        session.getTransaction().commit();
    }

    @Override
    public void deleteById(long id) {
        StudentEntity student = session.find(StudentEntity.class, id);
        session.delete(student);
        session.flush();
        session.getTransaction().commit();
    }

    @Override
    public ArrayList<StudentEntity> getAll() {
        return (ArrayList) session.createQuery("from StudentEntity").list();
    }
}
