Create database Quanly;
use Quanly;
create table Department (
DepartmentID int,
DepartmentName varchar(50)
);
create table Position (
PositionID int,
PositionName varchar(50)
);
create table AccountQL (
AccountID int,
Email varchar(50),
Username varchar(50),
Fullname varchar (50),
DepartmentID int,
PossitionID int,
CreateDate date
);
create table GroupQL (
GroupID int,
GroupName varchar(50),
CreatorID int,
CreateDate date
);
create table GroupAccount(
GroupID int,
AccountID int,
JoinDate date
);
create table TypeQuestion (
TypeID int,
TypeName varchar (100)
);
create table CategoryQuetion (
CategoryID int,
CategoryName varchar(50)
);
create table Question (
QuestionID int,
Content varchar(100),
CategoryID int,
TypeID int,
CreatorID int,
CreateDate date
);
create table Answer (
AnswerID int,
Content varchar(200),
QuestionID int
);
create table Exam (
ExamID int,
CodeID int,
Title varchar(50),
CategoryID int,
CreatorID int,
CreateDate date);
create table ExamQuestion (
ExamID int,
QuestionID int
);