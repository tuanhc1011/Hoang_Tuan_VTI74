use quanly1;
1:
select a.AccountID, a.Fullname, d.DepartmentName 
from accountql a 
join department d 
on a.DepartmentID = d.DepartmentID;
2:
select * from accountql a 
where CreateDate < 20-12-2010;
3:
select * from position
where PositionName = 'DEV';
4:
select D.departmentName, count(A.DepartmentID) from accountql A
inner join department D on A.DepartmentID = D.DepartmentID
group by A.DepartmentID
having count(A.DepartmentID)>3;
5:
select E.QuestionID from examquestion E
inner join question Q on Q.QuestionID
group by E.QuestionID
having count(E.QuestionID) = (select max(so_cau_hoi) as abc from (
select count(E.QuestionID) as so_cau_hoi from examquestion E group by E.QuestionID ) as T1
);
6:
Select C.CategoryID, C.CategoryName from categoryquetion C
join question Q on C.CategoryID = Q.CategoryID
group by Q.CategoryID;
7:
select Q.content, count(E.QuestionID) as 'SL_cauhoi'
from question Q left join examquestion E on E.QuestionID = Q.QuestionID
group by Q.QuestionID
order by E.ExamID;
8:
select max(socauhoi) from (
select count(A.QuestionID) as socauhoi from answer A group by A.QuestionID) as socautraloi;
select A.QuestionID, A.Content, count(A.QuestionID) from A 
inner join question Q on Q.QuestionID = A.QuetionID
having count(A.QuestionID) = socautraloi;
9:
select GA.GroupID, count(GA.AccountID) as 'so nhan su' 
from groupaccount GA join groupql G 
on GA.GroupID = G.GroupID
group by G.GroupID
order by G.GroupID;
10:
11: 
use quanly1;
select D.DepartmentID, D.DepartmentName, count(P.PositionName) as 'soluong'  from accountql A
join department D on A.DepartmentID = D.DepartmentID
join position P on A.PossitionID = P.PositionID 
group by D.DepartmentID, P.PositionID;

 
