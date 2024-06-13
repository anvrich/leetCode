-- create table person
-- (
--     id serial primary key ,
--     email varchar not null unique
-- );

create table person(
    id    serial primary key,
    email varchar not null
);

INSERT INTO Person (email)
VALUES ('a@b.com'),
       ('c@d.com'),
       ('a@b.com');


select email from person
group by email  having count(*) >  1;
