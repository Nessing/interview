CREATE TABLE IF NOT EXISTS student
(
    id   bigserial PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    mark VARCHAR(10) NOT NULL
);