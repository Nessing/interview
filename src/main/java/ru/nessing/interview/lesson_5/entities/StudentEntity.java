package ru.nessing.interview.lesson_5.entities;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class StudentEntity {

    public StudentEntity() {

    }

    public StudentEntity(String name, String mark) {
        this.name = name;
        this.mark = mark;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "mark")
    private String mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", name: '" + name + '\'' +
                ", mark: '" + mark + '\'';
    }
}
