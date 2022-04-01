# CRUD IN JAVA

### Functionality

Web rest for the creation of services using the Java programming language.
Its main objective is to perform the functions of a CRUD convecional, defined in:
- **C** : create
- **R**: read
- **U**: update
- **D**: delete
By means of this web application, you can operate on stored information being these functions of the persistent storage.

### Requirements

- JAVA 18
- Spring boot 2.6.6
- openjdk-17.0.1
- Netbeans 13
- Postman
- PostgreSQL 14

### Database
In order to import the database, Posgrest 14 must be installed.
the first step is to open pgAdmin4 to import the database.
The second step is to create a new database, right click on the database created and click on "restore", select the .sql file that contains the database and the name of the role that in this case is "postgrest", then click on Restore and ready, the database has been exported.

After this, we go to our IDE and follow the route "Other Sources/src/main/resources/<default package/applications.properties>", we change our credentials of the database to those defined by each user of Postgresql, in my case in the line 8, I have specified the port "5533", in the line 9 my user "camilo" and in the line 10 my password "123", so that the function of the database is complete, we must edit the credentials of each one.

### Postman

![Image text](https://github.com/CAMILOMARCHENA/Proyecto-De-Grado/blob/master/recursos/Captura%20de%20pantalla%20(105).png)
