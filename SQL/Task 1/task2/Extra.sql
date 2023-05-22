create database quanly_fresher;
use quanly_fresher;
create table Trainee (
    TraineeID int auto_increment primary key,
    Full_name varchar (100),
    Birth_day date,
    Gender enum('male','female', 'unknown'),
    ET_IQ int check (ET_IQ <= 20 and ET_IQ >= 0),
    ET_Gmath int check (ET_Gmath <= 20 and ET_Gmath >= 0),
    ET_English int check (ET_English <= 50 and ET_English >=0),
    Training_Class varchar (100),
    Evaluation_Notes text    
    );
    Alter table Trainee
    ADD VTI_Accont varchar(100) primary key;
    