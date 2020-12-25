-- create database
CREATE DATABASE unit_techno;

CREATE SCHEMA squd;

CREATE USER squd WITH password 'squd';

ALTER USER squd WITH SUPERUSER;

GRANT USAGE ON SCHEMA squd TO squd;

ALTER SCHEMA squd OWNER TO squd;