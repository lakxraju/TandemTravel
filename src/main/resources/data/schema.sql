CREATE TABLE users
(
 UserId varchar(100) NOT NULL,
 UserFirstname varchar(11) NOT NULL ,
 UserLastname varchar(100) DEFAULT NULL,
 UserCity varchar(100) DEFAULT NULL,
 UserEmail varchar(100) DEFAULT NULL,
 PRIMARY KEY (UserId)
);

insert into users(UserId, UserFirstname , UserLastname, UserCity, UserEmail) values('1','Jack','Dunphy','Dusseldorf','jack@gmail.com');
