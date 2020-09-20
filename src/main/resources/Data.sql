insert into user (id,name,email)values (1, 'Ife', 'ife@expense.com');
insert into user (id,name,email)values (2, 'Oke', 'okee@expense.com');

insert into category (id,name, user_id)values (1,'Travel',1);
insert into category (id,name,user_id)values (2,'Student Loan',2);
insert into category (id,name,user_id)values (3,'House Loan',1);


insert into expense(id,descript,expansedate,location,category_id,user_id) values (100,'Lagos the crazy City','2020-7-17T03:02:000Z','Lagos',1,2);
insert into expense (id,descript,expansedate,location,category_id,user_id)values (101,'Abuja for off your mic ','2020-6-12T03:00:000Z','Abuja',2,2);
insert into expense (id,descript,expansedate,location,category_id,user_id)values (102,'Abia the carbon cpy of China','2020-5-10T04:00:000Z','Abia',2,1);

