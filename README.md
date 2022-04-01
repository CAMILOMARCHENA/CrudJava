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

### Postmant


#### Read
the postman functions are specific, there we can send the different requests to our crud. 
First of all we must run our file from our IDE called "CrudPruebaApplication.java", check that we have no errors and start with the requests in postman.
To make a get request, to fulfill the first requirement of crud which is List, we must do it through the url "localhost:8080/empleados", as shown in the image, followed by the SEND button and this way the people added to the database will be listed.

![Image text](https://github.com/CAMILOMARCHENA/CrudJava/blob/master/read.png)


#### Create
For the create function, we edit the postman options, select the "body" option followed by "form-data" and enter the respective keys and the data of each requirement which would be in that order, names, surnames, age, telephone, photo. The user code is provided by the App itself.
When we finish filling the data as you can see in the image, the data will be sent to the database.
In the folder "user-photos", the images are saved with the respective code of each user.

![Image text](https://github.com/CAMILOMARCHENA/CrudJava/blob/master/create.png)
 

#### Update
For the edit function, we edit the postman options, select the "body" option followed by "raw" and select a JSON file, enter the data for each requirement, followed by the field to edit.
When we finish editing the data we can send another GET request to list and view the changes.

![Image text](https://github.com/CAMILOMARCHENA/CrudJava/blob/master/update.png)

#### Delete
In the Delete function, we edit the postman options, select the "body" option followed by "raw" and select a JSON file, enter the code we want to delete from our database, followed by the SEND button.

![Image text](https://github.com/CAMILOMARCHENA/CrudJava/blob/master/delete.png)



