insert into course(id, name, created_date, last_updated_date)
values(10001,'JPA in 50 Steps', sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date)
values(10002,'Spring in 50 Steps', sysdate(), sysdate());
insert into course(id, name, created_date, last_updated_date)
values(10003,'Spring Boot in 100 Steps', sysdate(), sysdate());


insert into review(id,rating,description , course_id)
values(50001,'5', 'Great Course', 10001);
insert into review(id,rating,description , course_id)
values(50002,'4', 'Wonderful Course', 10002);
insert into review(id,rating,description, course_id)
values(50003,'5', 'Awesome Course', 10001);