/*주석 : create database를 작성할수 있다*/
create database test;
/* 데이터베이스의 테이블을 사용하기전에, 데이터 베이스로 이동*/
USE test;

/* 
데이터베이스의 테이블을 사용할때도 동일하게 create사용
테이블을 작성해줄때는, 안에 들어갈 자료형을 고정시킨다
*/
create table people (
	ID int,
    Name varchar(10) 
);

/* insert를 사용해서 데이터를 넣을수 있다.*/
insert into people (ID, Name) values (1, "홍길동");

/* 
select (필드) from (테이블
필드에 * 기호를 넣으면 테이블의 모든 필드값을 확인한다.
*/
select * from people