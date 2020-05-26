create database studentinfo;


use studentinfo;


create table admins ( 
firstname VARCHAR(64),
lastname VARCHAR(64),
regd_no VARCHAR(25),
email VARCHAR(64),
ph VARCHAR(64),
dob VARCHAR(64),
username VARCHAR(64),
pass VARCHAR(64),
address VARCHAR(64),
photo VARCHAR(64));


create table branches (branch_id VARCHAR(64),branch VARCHAR(64) primary key not null);

insert into branches values("1","CSE");
insert into branches values("1","ECE");
insert into branches values("1","EEE");
insert into branches values("1","MECH");
insert into branches values("1","CIVIL");
insert into branches values("1","MME");
insert into branches values("1","CHEM");



create table students (
firstname VARCHAR(64),
lastname VARCHAR(64),
regd_no VARCHAR(25) primary key not null,
email VARCHAR(64),
ph VARCHAR(64),
dob VARCHAR(64),
stud int,
fac int,
username VARCHAR(64),
pass VARCHAR(64),
branch VARCHAR(64),
address VARCHAR(64),
photo VARCHAR(64));


insert into students values("tony","stark","981405","asdfg@gmail.com","9998887744","21/06/2000","1","0","tony","12","CSE","Stark towers","xyz");
insert into students values("tony","stark","981404","asdfg@gmail.com","9998887744","21/06/2000","0","1","tony1","12","CSE","Stark towers","xyz");


insert into admins values("admin","admin","981405","jhabdf","99","21/06/200","admi","admin123","stark","xxx");

create table course (id VARCHAR(64),name VARCHAR(64),branch VARCHAR(64),files blob);

insert into course values("123","Java","CSE","C:\\Users\\hp\\Downloads\\data_description.txt");

create table notify(id VARCHAR(64),info varchar(100));

insert into notify values("123" ,"Tommorrow the table will be updated");
insert into notify values("123" ,"All students login");
insert into notify values("123" ,"All student check details");
insert into notify values("123" ,"Registration form will close by 11");

create table attendance (regd_no VARCHAR(64),course VARCHAR(64),value VARCHAR(64),date VARCHAR(64));
insert into attendance values("981405","JAVA","100","21/06/2000");
insert into attendance values("981405","JAVA","100","21/03/2001");
insert into attendance values("981405","JAVA","100","1/04/2002");
insert into attendance values("981405","JAVA","100","11/05/2003");


