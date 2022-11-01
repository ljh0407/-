drop database if exists jspweb;
create database jspweb;
use jspweb;
create table member(
	mno			int auto_increment primary key ,		-- 회원번호[pk , autokey ] 
	mid			varchar(50) UNIQUE NOT NULL , 			-- 회원아이디 
    mpassword	varchar(50) NOT NULL , 					-- 회원패스워드 
    mname		varchar(50) NOT NULL , 					-- 회원명
    mphone		varchar(15) NOT NULL , 					-- 회원 전화번호 
    memail		varchar(100) UNIQUE NOT NULL , 			-- 회원 이메일 
    maddress	varchar(100)  NULL	 ,					-- 회원 주소 [ 우편번호,도로명주소,지번주소,상세주소]
    mdate		datetime default now() NOT NULL ,				-- 회원 가입일 
	mpoint		int	default 0 NOT NULL							-- 회원 포인트 
);

-- default 레코드 추가시 기본으로 들어가는 값 설정 
-- datetime default now() : 현재 시스템(DB)의 자동날짜
-- insert 문법
	-- 특정필드만 삽입 :  insert into 테이블명( 필드명 , 필드명 , 필드명 ) values( 값1, 값2 , 값3 );
	-- 모든필드 삽입 :   insert into 테이블명 values( 값1, 값2, 값3 );
/*
	select * from member;
	-- 로그인 [ 해당 테이블에 동일한 아이디와 패스워드가 존재하는 검색 ]
		-- select 
		-- select * from 테이블명 where 아이디 = ? and 비밀번호 = ?
	select * from member where mid = '123' and mpassword = '456';
		-- 존재하면 레코드 1개 검색 
		-- 존재하지 않으면 레코드 x 
	select * from member;
	-- 회원정보 호출 
	select * from member where mid = '변수';
	-- 회원 삭제 
	delete from member where mid = 'dfgdfgdf' and mpassword = 'dfgdfg';
*/
DROP TABLE if exists category;
create table category( cno int auto_increment primary key , cname varchar(100)  );
-- 게시판 테이블 생성 
DROP TABLE if exists board;
CREATE TABLE board(
	bno			int auto_increment,  -- 번호  	
    btitle		varchar(1000) NOT NULL, 		-- 제목 		
    bcontent	longtext NULL,			-- 내용	[ 썸머노트 이용해서 사진/영상 대용량 추가 ]
    bfile		longtext NULL,			-- 첨부파일 [ 게시물 1개당 첨부파일 1개 ]
    bdate 		datetime default now() NOT NULL	,	-- 작성일 : 기본값 현재 DB서버 시스템 날짜 
    bview		int default 0 NOT NULL ,				-- 조회수 : 기본값 0 
    cno			int ,									-- 카테고리번호 FK 
    mno 		int	,									-- 작성자 
	constraint bno_pk primary key (bno)  , 
    constraint bcno_fk foreign key (cno) references category(cno) on update cascade ,
    constraint bmno_fk foreign key (mno) references member(mno) on delete cascade
);
-- 댓글 : 1.게시물번호 2.회원번호 3.내용 4.답글식별필드
drop table if exists reply;
create table reply(
	rno 		int  auto_increment, -- 댓글식별번호 
    rcontent 	varchar(1000) not null , -- 댓글내용
    rdate		datetime  default now(),  -- 댓글작성일
    rindex		int default 0 , -- 댓글 과 대댓글 식별 필드 [ 0:상위댓글 , 숫자:상위댓글번호 ] 
    mno			int not null,-- 작성자 회원번호
    bno			int not null,-- 게시물번호 
    constraint rno_pk primary key(rno) ,
    constraint rmno_fk foreign key (mno) references member(mno) on delete cascade, -- 회원탈퇴시 댓글도 같이 삭제
    constraint rbno_fk foreign key (bno ) references board(bno) on delete cascade -- 게시물삭제시 댓글도 같이 삭제
);

-- 제품 테이블 --
drop table if exists pcategory;
create table pcategory( /* 제품 카테고리 테이블 */
	pcno  int auto_increment,   				/* 카테고리번호  */
    pcname varchar(100) , 						/* 카테고리이름  */
    constraint pcno_pk primary key( pcno )
);
drop table if exists product;
create table product( /* 제품 테이블 */
	pno int auto_increment ,  /*제품번호*/
    pname varchar(100)  , /*제품명*/
    pcomment varchar(1000) , /* 제품설명 */
    pprice int unsigned ,  /*  +-20억    unsigned ---> 0~40억   : 제품가격 */
    pdiscount float , /* 할인율[소수점] */ 
    pactive tinyint , /* 상태 : 0[준비중] , 1:판매중 , 2:재고없음  뜻함 */
    pimg varchar(1000) , /* 대표 이미지 경로 */ 
    pdate datetime default now() , 	/* 등록날짜 */
    pcno int , /* 제품카테고리의 FK */ 
    constraint pno_pk primary key ( pno ),
    constraint pcno_fk foreign key ( pcno ) references pcategory( pcno ) /* pcategory[pk:pcno]  <-------->  product[fk:pcno] */
);

/* 제품별 사이즈 테이블  : 제품별[pno] 사이즈[psize] 저장 */
drop table if exists productsize;
create table productsize(
	psno	int auto_increment , 
    psize	varchar(100) , 
    pno		int  , 
	constraint psno_pk primary key( psno ) ,
    constraint pno_fk foreign key ( pno ) references product( pno )
);
/* 사이즈별 색상재고 테이블 : 사이즈별[psno] 색상[pcolor] 재고[pstock] 저장 */
drop table if exists productstock;
create table productstock(
	pstno	int auto_increment , 
    pcolor 	varchar(100) , 
    pstock int ,
    psno int , 
    constraint pstno_pk primary key( pstno ) , 
    constraint psno_fk	foreign key( psno ) references productsize( psno )
);

