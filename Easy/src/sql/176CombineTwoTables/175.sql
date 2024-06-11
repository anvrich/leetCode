CREATE TABLE Person
(
    personId  SERIAL PRIMARY KEY,
    lastName  VARCHAR,
    firstName VARCHAR
);

CREATE TABLE Address
(
    addressId SERIAL PRIMARY KEY,
    personId  INT,
    city      VARCHAR,
    state     VARCHAR,
    FOREIGN KEY (personId) REFERENCES Person (personId)
);


-- Добавление данных в таблицу Person
INSERT INTO Person (lastName, firstName)
VALUES ('Wang', 'Allen'),
       ('Alice', 'Bob');

-- Добавление данных в таблицу Address
INSERT INTO Address (personId, city, state)
VALUES (2, 'New York City', 'New York');


