create table login(
username varchar(50) not null,
password varchar(50));


insert into login values("admin", "admin@123"); 
insert into login values("naveen", "admin@123"); 

create table regestration(
firstname varchar(50) not null,
lastname varchar(50),
email varchar(50),
telephone varchar(50),
address1 varchar(50),
city varchar(50),
postcode varchar(50),
countryid varchar(50),
Zoneid varchar(50),
inputpassword varchar(50),
confirmpassword varchar(50));

insert into regestration values("Naveen", "s", "Naveen@123","9845678901",
"Jayanagar","Bangalore","560061","India","Karnataka","Naveens123","Naveens123"); 

insert into regestration values("raman", "s", "ramans@123","9845678901",
"Jayanagar","Bangalore","560061","India","Karnataka","ramans123","ramans123"); 