CREATE TABLE IF NOT EXISTS students
(
    id   bigserial primary key,
    name VARCHAR(50) not null,
    age  int not null
);

INSERT INTO students(name, age)
VALUES ('John', 42),
       ('Mike', 25),
       ('Steve', 33);