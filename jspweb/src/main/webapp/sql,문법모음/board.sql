drop database if exists noticeboard;
create database noticeboard;
use noticeboard;


drop table if exists board;
create table board(
	bno int auto_increment primary key ,  	-- 게시물번호
    btitle varchar(100),					-- 게시물제목 
    bcontent varchar(500),					-- 내용
    bwriter varchar(100),					-- 작성자
    bpassword varchar(50),					-- 비밀번호
    bdate datetime default now(),			-- 작성일
    bview int 				-- 조회수
);

select * from board;