CREATE TABLE Person(
    id    SERIAL PRIMARY KEY,
    email VARCHAR UNIQUE
);



INSERT INTO Person (id, email)
VALUES (1, 'john@example.com'),
       (2, 'bob@example.com'),
       (3, 'john@example.com');



DELETE FROM Person
WHERE id NOT IN (
    SELECT MIN(id)
    FROM Person
    GROUP BY email
);
