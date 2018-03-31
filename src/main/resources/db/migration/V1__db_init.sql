drop table if exists person;
create table if not exists `person` (
  `id` integer primary key auto_increment,
  `first_name` varchar(20) not null,
  `last_name` varchar(20) not null
);
insert into `person` (first_name, last_name) values('Jack', 'Bauer');
insert into `person` (first_name, last_name) values('David', 'Palmer');
