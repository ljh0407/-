drop database if exists jspweb;

create database jspweb;
use jspweb;

create table member(
	mno			int auto_increment primary key ,		-- 회원번호 [pk , autokey]
	mid			varchar(50),							-- 회원아이디
    mpassword	varchar(50),							-- 비밀번호
    mname		varchar(50),							-- 이름
    mphone		varchar(15),							-- 전화번호
    memail		varchar(100),							-- 이메일
    maddress	varchar(100),							-- 주소
    mdete		datetime default now(),					-- 가입일
				-- datetime default now() : 현재 시스템(DB)의 자동날짜
	mpoint		int default 0							-- 회원포인트
);				
select * from member;

-- default 레코드 추가시 기본으로 들어가는 값 설정
-- datetime default now() : 현재 시스템(DB)의 자동날짜

-- insert 문법
	-- 특정필드만 삽입 : insert into 테이블명(필드명,필드명,필드명) values(값1,값2,값3)

select * from member where mid = 'sdf' and mpassword = 'sdf';
	-- 존재하면 레코드 1개 검색
    -- 존재하지 않으면 레코드 x
    



	