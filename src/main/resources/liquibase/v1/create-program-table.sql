--liquibase formatted sql

--changeset Max Tsilyurik:create-program-table
create table PROGRAM
(
    ID           uuid primary key unique        not null,
    CODE         varchar(13)                    not null,
    TITLE        varchar(500)                   not null,
    SPECIALTY_ID uuid references specialty (id) not null
);