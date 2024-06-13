CREATE TABLE Weather(
    id          SERIAL PRIMARY KEY,
    recordDate  DATE,
    temperature INT
);
INSERT INTO Weather (id, recordDate, temperature)
VALUES (1, '2015-01-01', 10),
       (2, '2015-01-02', 25),
       (3, '2015-01-03', 20),
       (4, '2015-01-04', 30);

SELECT w1.id
FROM Weather w1
         JOIN Weather w2 ON w1.recordDate = w2.recordDate + INTERVAL '1 day'
WHERE w1.temperature > w2.temperature;

