create table employee(
                         id serial primary key,
                         name varchar(255),
                         salary int,
                         managerId int
);

insert into employee(name, salary, managerid)
values ('Joe', 70000, 3),
       ('Henry', 80000, 4),
       ('Sam', 60000, null),
       ('Max', 90000, null);


-- select e.name as Сотрудник
-- from employee e
-- join employee m on e.managerid = m.id
-- where e.salary > m.salary;
SELECT e.name AS Employee
FROM Employee e
         JOIN Employee m ON e.managerId = m.id
WHERE e.salary > m.salary OR (e.managerId IS NULL AND m.managerId IS NOT NULL);
