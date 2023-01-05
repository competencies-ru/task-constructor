--liquibase formatted sql

--changeset Max Tsilyurik:create-ugsn-table
create table UGSN
(
    ID       uuid primary key unique    not null,
    TITLE    varchar(500)               not null,
    CODE     varchar(8)                 not null,
    LEVEL_ID uuid references LEVEL (ID) not null
);