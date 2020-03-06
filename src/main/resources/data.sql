drop table if exists employee;

create table employee(id int auto_increment primary key,name varchar(50) not null,
dob Date default not null);

insert into employee (name,dob) values('anitha',sysdate),('harika',sysdate),('rajiv',sysdate);



create table employee_time(id int auto_increment primary key,
empid int,date Date ,swipein Date
,swipeout Time,location varchar(50) );



insert into employeeswipe(emp_id,date,location,swipe_in,swipe_out)values(1,sysdate,'thislocation',now(),now()),
(2,sysdate,'thislocation',now(),now()),
(3,sysdate,'thislocation',now(),now()),
(4,sysdate,'thislocation',now(),now());