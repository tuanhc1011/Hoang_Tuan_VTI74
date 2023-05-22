create database Quanly1;
use Quanly1;
create table Department (
DepartmentID int auto_increment primary key,
DepartmentName varchar(50)
);
create table Position (
PositionID int auto_increment primary key,
PositionName enum ( 'DEV', 'Test','Scrum Master","PM')
);
create table AccountQL (
AccountID int auto_increment primary key,
Email varchar(50),
Username varchar(50),
Fullname varchar (50),
DepartmentID int,
PossitionID int,
CreateDate date
);
create table GroupQL (
GroupID int auto_increment primary key,
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
TypeID int auto_increment primary key,
TypeName varchar (100)
);
create table CategoryQuetion (
CategoryID int auto_increment primary key,
CategoryName varchar(50)
);
create table Question (
QuestionID int auto_increment primary key,
Content varchar(100),
CategoryID int,
TypeID int,
CreatorID int,
CreateDate date
);
create table Answer (
AnswerID int auto_increment primary key,
Content varchar(200),
QuestionID int
);
create table Exam (
ExamID int auto_increment primary key,
CodeID int,
Title varchar(50),
CategoryID int,
CreatorID int,
CreateDate date);
create table ExamQuestion (
ExamID int,
QuestionID int
);
