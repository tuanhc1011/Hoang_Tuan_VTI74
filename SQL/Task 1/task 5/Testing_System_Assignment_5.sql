1:
USE quanly1;
CREATE VIEW list_sale AS
SELECT A.Fullname, A.Email, D.DepartmentName
FROM accountql A
    INNER JOIN department D
    ON A.DepartmentID = D.DepartmentID
	WHERE D.DepartmentID = 'sale'
2:
USE quanly1;
CREATE VIEW top_account AS 
WITH so_luong_account AS (SELECT count(GA.AccountID) as so_luong
                                FROM groupaccount GA
                                GROUP BY GA.AccountID)
SELECT accountql.AccountID,accountql.Username,accountql.Fullname, count(GA.AccountID) 
FROM groupaccount GA
INNER JOIN accountql A
ON GA.AccountID = A.AccountID
GROUP BY GA.AccountID 
HAVING count(GA.AccountID) = (SELECT max(count(GA.AccountID)) 
								FROM so_luong_account);
3:
CREATE VIEW content_qua_dai AS
SELECT * FROM question
	WHERE LENGTH(Content) > 300;
DELETE FROM content_qua_dai;
4:
USE quanly1;
CREATE VIEW max_nhan_vien AS
SELECT D.DepartmentName, count(A.DepartmentID) as so_luong_NV FROM accountql A
INNER JOIN department D ON D.DepartmentID = A.DepartmentID
GROUP BY A.DepartmentID HAVING count(A.DepartmentID) =(SELECT max(A.DepartmentID) as SL_NV FROM (
		SELECT count(A.DepartmentID) as ABC FROM accountql A GROUP BY A.DepartmentID) as SL_DID);
SELECT * FROM max_nhan_vien;
5:
CREATE VIEW Nguyen_Create AS
SELECT Q.CategoryID, Q.Content, A.Fullname as Nguoi_tao FROM question Q
INNER JOIN accountql A ON A.AccountID = Q.CreatorID
WHERE SUBSTRING_INDEX(A.Fullname, ' ', 1) ='Nguyễn';