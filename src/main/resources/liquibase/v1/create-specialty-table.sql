--liquibase formatted sql

--changeset Max Tsilyurik:create-specialty-table
create table SPECIALTY
(
    ID      uuid primary key unique   not null,
    CODE    varchar(10)               not null,
    TITLE   varchar(500)              not null,
    UGSN_ID uuid references ugsn (id) not null
);