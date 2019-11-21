## Use Cases

    Use Case 1: Employee Registration
  	  •	As a user, I should be able to Register an employee with following details:<br />
			First Name <br />
			Last Name <br />
			Gender <br />
			Date of Birth <br />
			Department 

	Use Case 2: Employee List 
  	  •	As a user, I should be able to see all the employee details in a tabular form (or any other way) in ascending 		order by first name 
   
## Employee Registration
	Based on use case developed a rest api with h2 memory database

## Application.properties
	server.port=9090
	spring.datasource.url=jdbc:h2:~/test;MVCC=true;DB_CLOSE_DELAY=-1;MODE=Oracle
	spring.datasource.username=sa
	spring.datasource.password=
	spring.datasource.driver-class-name=org.h2.Driver
	spring.datasource.platform=h2
	spring.jpa.hibernate.ddl-auto=none
	spring.h2.console.enabled=true
	spring.h2.console.path=/h2

## How to use?
	1.Install h2 database in your system.
	2.Clone the code from git URL **https://github.com/Anand-2512/demo**.
	3.in Application.properties you can change your h2 database config as per your h2 console
	4.No need to create table as i have already attached the schema.sql and data.sql file
	5.Run the application.
	6.in browser hit URL **http://localhost:9090/**
	7.Now you can see a swagger ui which holds the required use cases

