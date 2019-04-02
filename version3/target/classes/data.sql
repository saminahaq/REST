create table Customers(
   Id integer not null,
   Name varchar(255) not null,
   primary key(Id)
);
CREATE TABLE Customer_Address(
    Id integer PRIMARY KEY,
    CUSTOMER_ID integer, 
    STREET_ADDRESS varchar(255), 
    POSTAL_CODE Integer, 
    COUNTRY varchar(255),
    primary key(Id)
    );

/* Create few records in this table */
INSERT INTO Customer_Address VALUES(1, 3,'123 Big Walk Way', 75023, 'US');
INSERT INTO Customer_Address VALUES(2, 2,'509 Charter Road', 90021, 'US');
INSERT INTO Customer_Address VALUES(3, 1,'999 Night Stalker Road',12345, 'Us');

/* Create few records in this table */
INSERT INTO Customers VALUES(1,'Ryan');
INSERT INTO Customers VALUES(2,'Jonathan');
INSERT INTO Customers VALUES(3,'Colin');
INSERT INTO Customers VALUES(4,'Syed');
