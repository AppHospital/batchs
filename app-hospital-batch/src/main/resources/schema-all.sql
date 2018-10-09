drop table jira if exists;
drop table person if exists;

CREATE TABLE jira(
card_id BIGINT IDENTITY NOT NULL PRIMARY KEY,
card_number varchar(20),
description varchar(255),
in_charge_of varchar (50)
);

CREATE TABLE person(
person_id BIGINT IDENTITY NOT NULL PRIMARY KEY,
last_name varchar(20),
first_name varchar(20)
);