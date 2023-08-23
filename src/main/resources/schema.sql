drop table  if exists Ingredient cascade;
drop table  if exists Taco cascade;
drop table  if exists Taco_Ingredient cascade;
drop table  if exists Taco_Order cascade;
drop table  if exists Taco_Order_Taco cascade;
DROP SEQUENCE if exists hibernate_sequence;

create table if not exists Ingredient (
  id varchar(4) not null primary key,
  name varchar(25) not null,
  type varchar(10) not null
);

create table if not exists Taco (
  id bigint generated by default as identity primary key,
  name varchar(50) not null,
  createdAt timestamp not null
);


create table if not exists Taco_Ingredient (
  TACO_ID bigint not null,
  ingredients_id varchar(4) not null
);

alter table Taco_Ingredient
    add foreign key (TACO_ID) references Taco(id);
alter table Taco_Ingredient
    add foreign key (ingredients_id) references Ingredient(id);

create table if not exists Taco_Order (
	id bigint generated by default as identity primary key,
	deliveryName varchar(50) not null,
	deliveryStreet varchar(50) not null,
	deliveryCity varchar(50) not null,
	deliveryState varchar(2) not null,
	deliveryZip varchar(10) not null,
	ccNumber varchar(16) not null,
	ccExpiration varchar(5) not null,
	ccCVV varchar(3) not null,
    placedAt timestamp not null
);

create table if not exists Taco_Order_Taco (
	TACO_ORDER_ID bigint not null primary key,
	TACOS_ID bigint not null
);

alter table Taco_Order_Taco
    add foreign key (TACO_ORDER_ID) references Taco_Order(id);
alter table Taco_Order_Taco
    add foreign key (TACOS_ID) references Taco(id);

create sequence hibernate_sequence start with 1 increment by 1;