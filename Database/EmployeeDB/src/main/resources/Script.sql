USE EmployeeDb;
CREATE TABLE Roles(
                      name varchar(20),
                      id int NOT NULL AUTO_INCREMENT PRIMARY KEY
);

CREATE TABLE Employees(
                          id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
                          name varchar(20),
                          email varchar(25),
                          mobile int,
                          age int,
                          natID long,
                          role_id int,
                          FOREIGN KEY (role_id) REFERENCES Roles(id)
);

CREATE TABLE Projects(
                         name varchar(20) NOT NULL PRIMARY KEY,
                         DateOfStart DATETIME,
                         manager varchar(20)
);

CREATE TABLE enrolled_employees(
                                   employee_id int,
                                   proj_name varchar(20),
                                   id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
                                   FOREIGN KEY (proj_name) REFERENCES Projects(name),
                                   FOREIGN KEY (employee_id) REFERENCES Employees(id)
);


