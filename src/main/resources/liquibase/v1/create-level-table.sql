--liquibase formatted sql

--changeset Max Tsilyurik:create-level-table
create table LEVEL
(
    ID uuid primary key unique not null,
    TITLE varchar(50) unique not null
);