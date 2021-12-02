CREATE TABLE duration
(
    id   bigserial primary key,
    time int not null
);

INSERT INTO duration(time)
VALUES (60),
       (90),
       (120);

CREATE TABLE movie
(
    id          bigserial primary key,
    name        varchar(100),
    duration_fk int REFERENCES duration (id)
);

INSERT INTO movie(name, duration_fk)
VALUES ('Film_1', 2),
       ('Film_2', 1),
       ('Film_3', 3),
       ('Film_4', 1);

CREATE TABLE price
(
    id   bigserial primary key,
    day  varchar(50) not null,
    time varchar(10) not null,
    cost int         not null
);

INSERT INTO price(day, time, cost)
VALUES ('working day', 'a.m.', '260'),
       ('working day', 'p.m.', '300'),
       ('weekend', 'a.m.', '380'),
       ('weekend', 'p.m.', '420');

CREATE TABLE seance
(
    id           bigserial primary key,
    movie_fk     int REFERENCES movie (id),
    day_price_fk int REFERENCES price (id),
--   временная переменная
    start_time   time not null
);

INSERT INTO seance(movie_fk, day_price_fk, start_time)
VALUES (2, 1, '11:40'),
       (1, 1, '11:50'),
       (3, 2, '13:50'),
       (2, 2, '19:25'),
       (4, 3, '10:10');


CREATE TABLE movie_seance
(
    id       bigserial primary key,
    movie    int REFERENCES movie (name),
    duration int REFERENCES movie (duration_fk)
);


CREATE TABLE ticket
(
    id        bigserial primary key,
    seance_fk int REFERENCES seance (id)
);

INSERT INTO ticket(seance_fk)
VALUES (2),
       (5),
       (1),
       (2),
       (1);