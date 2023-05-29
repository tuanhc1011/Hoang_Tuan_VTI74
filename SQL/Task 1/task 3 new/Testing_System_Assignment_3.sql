use quanly1;

2:
	select departmentName from department;

3:

	select departmentID from departments where departmentName = 'Sale';
    
4:

	select MAX(CHAR_LENGTH(fullname)) from accountql;

	select * from accountql where CHAR_LENGTH(fullname) = (select MAX(CHAR_LENGTH(fullname)) from accountql);
    
5: 

	select * from accountql where CHAR_LENGTH(fullname) = (select MAX(CHAR_LENGTH(fullname)) from accountql) and departmentID = 3;
    
6:
	
	select groupname from groupql where createddate < '2019-12-20';
    
7: 
	
    select QuestionID from answer group by questionid having count(answerid)>=4;

8: 

	select codeID from exams where duration >= 60 and created_date < '2019-12-20';
    
9: 

	select * from groupql order by CreatedDate desc limit 5;
    
10:

	select count(accountid) from accountql where departmentid = 2;

11: 
	
    select fullname from accounql where fullname like 'D%o';
    
12:

	delete from exam where createddate < '2019-12-20';
    
13:
	delete from question where content like 'câu hỏi%';
    
14:

	update accountql set fullname = 'Nguyễn Bá Lộc', email = 'loc.nguyenba@vti.com.vn' where account_id = 5;
    
15:

	update groupsaccount set groupid = 4 where accountid = 5;
