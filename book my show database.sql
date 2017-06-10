create table admin
(
ANM varchar2(30),
APWD VARCHAR2(30)
);
DROP TABLE ADMIN;

INSERT INTO ADMIN VALUES('SAGAR','ICSD');
INSERT INTO ADMIN VALUES('DEEPAK','ICSD');
COMMIT;

create TABLE TBLMOVIES
(
MOVIEID      NUMBER(5) NOT NULL ,
MOVIENAME            VARCHAR2(20), 
STARS                VARCHAR2(5),  
STARTDATE            VARCHAR2(20), 
ENDDATE              VARCHAR2(20), 
SLOT912              VARCHAR2(10), 
SLOT1215             VARCHAR2(10) ,
SLOT1518             VARCHAR2(10) ,
SLOT1821             VARCHAR2(10), 
GOLDPRICE            NUMBER(3),    
SILVERPRICE          NUMBER(3) ,   
IMAGENAME            VARCHAR2(20)
);


SELECT * FROM TBLMOVIES;


//user table
create table tblseatsbooked(
ID                     NUMBER(10),    
MOVIEID                NUMBER(8) ,    
TTLGOLDSEATS           NUMBER(8),     
TTLSILVERSEATS         NUMBER(8) ,    
GOLDSEATSBOOKED        VARCHAR2(300), 
SILVERSEATSBOOKED      VARCHAR2(300), 
DATEOFSHOW             VARCHAR2(50) , 
GOLDAVAILSEATS         NUMBER(8) ,    
SILVERAVAILSEATS       NUMBER(8),     
SLOTOFSHOW             VARCHAR2(10)  
);

drop table tblseatsbooked;
//tickets
delete from tblseatsbooked where id=121;
select * from tblseatsbooked;
select goldseatsbooked from tblseatsbooked where movieid=1;
create table tblticket
(
 
ID                     NUMBER(8),     
MOVIEID                NUMBER(8),     
TICKETID               NUMBER(30),    
UNM                    VARCHAR2(30),  
MOB                    VARCHAR2(20),  
EMAILID                VARCHAR2(30),  
GOLDSEATSBOOKED        VARCHAR2(300), 
SILVERSEATSBOOKED      VARCHAR2(300), 
DATEOFSHOW             VARCHAR2(50),  
SLOT                   VARCHAR2(20),  
TOTALPRICE             VARCHAR2(20)  
);

drop table tblticket;
select * from tblticket;
select * from tblseatsbooked;





CREATE TABLE USERREGISTER
(
USERID NUMBER(10) PRIMARY KEY,
UNAME VARCHAR2(20),
UPWD VARCHAR2(20),
UEID VARCHAR2(30),
UMOB NUMBER(20)
);

delete from userregister where userid='1';

DROP TABLE USERREGISTER;
SELECT * FROM USERREGISTER;
DROP TABLE USERLOGIN;

CREATE TABLE USERLOGIN
(
USERID NUMBER(10),
UPWD VARCHAR2(30)
);
select * from userlogin;