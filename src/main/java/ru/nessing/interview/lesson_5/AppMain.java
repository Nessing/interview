package ru.nessing.interview.lesson_5;

import org.hibernate.Session;
import ru.nessing.interview.lesson_5.dao.Dao;
import ru.nessing.interview.lesson_5.dao.StudentDao;
import ru.nessing.interview.lesson_5.entities.StudentEntity;

import java.util.ArrayList;

public class AppMain {
    public static void main(String[] args) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();

        Dao<StudentEntity> studentDao = new StudentDao(session);

        for (int i = 0; i < 1000; i++) {
            studentDao.insert(new StudentEntity("Student_" + i, "Mark_" + i));
        }

        ArrayList<StudentEntity> students = studentDao.getAll();

        for (StudentEntity student : students) {
            System.err.println(student.toString());
        }

        session.close();
    }
}
