use quanly1;

2:
	select departmentName from departments;

3:

	select departmentID from departments where departmentName = 'Sale';
    
4:

	select MAX(CHAR_LENGTH(full_name)) from accounts;

	select * from accounts where CHAR_LENGTH(full_name) = (select MAX(CHAR_LENGTH(full_name)) from accounts);
    
5: 

	select * from accounts where CHAR_LENGTH(full_name) = (select MAX(CHAR_LENGTH(full_name)) from accounts) and departmentID = 3;
    
6:
	
	select group_name from `groups` where created_date < '2019-12-20';
    
7: 
	
    select question_id from answers group by question_id having count(answer_id)>=4;

8: 

	select `code` from exams where duration >= 60 and created_date < '2019-12-20';
    
9: 

	select * from `groups` order by created_date desc limit 5;
    
10:

	select count(account_id) from accounts where department_id = 2;

11: 
	
    select full_name from accounts where full_name like 'D%o';
    
12:

	delete from exams where created_date < '2019-12-20';
    
13:
	delete from questions where content like 'câu hỏi%';
    
14:

	update accounts set full_name = 'Nguyễn Bá Lộc', email = 'loc.nguyenba@vti.com.vn' where account_id = 5;
    
15:

	update groups_accounts set group_id = 4 where account_id = 5;
