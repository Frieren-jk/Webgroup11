# FUR REAL E-COMMERCE WEBSITE

## Status: Completed

### GRADE: 1.00

#### Description
This project was completed as part of WebTech at Polytechnic University of the Philippines. The project has been graded by my professor and will no longer be actively maintained.

### Technologies Used
- Java Servlet
- JSP (JavaServer Pages)
- Javascript
- Tomcat
- MySQL
- JSTL (JavaServer Pages Standard Tag Library)
- jBCrypt (for password hashing)
- HashMap (Java Collections Framework)

### Important Note
- All images used in this project are purely for school purposes only and will not be used for profit
- Minor bugs can be found but we are too lazy to fix that, since we are graded already.

![Sad-cat-thumbs-up-meme-6](https://github.com/Frieren-jk/Webgroup11/assets/83899433/6b7d71a7-2290-4941-b8f3-4f953a1d1568)

### Installation
To install and run this project locally, follow these steps:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Frieren-jk/Webgroup11.git
   
2. **Navigate to the project directory:**:
   ```bash
   cd your-repo
   
3. **Install the dependencies:**:
   ```bash
   npm install
   
4. **Set up your IDE:**:

- Install NetBeans or any other preferred IDE.
- Download and configure Apache Tomcat.
- Ensure you have MySQL installed and running.

5. **Fork the repository on GitHub.**:
   Fork the repository in Github
   Pull the origin from main branch
    ```bash
   git pull origin main
 Or you can use the github desktop to pull origin from master branch

Features

- Register User to the database
- Access Inventory when account is Admin
- Edit and Delete users and products in inventory
- Add Users and Products in the inventory using admin 
- Lockout User for 59 minutes when log-in attempts reaches 3
- Hashes password when user registration is submitted to the database
- Can change current password once user is in home page
- Can add and remove products to the cart table 
- Checkout products and remove them from the cart table
- and more...(I forgot)


#### DATABASE SCHEMA
In MySQL, the following table schema was used for the project:
Employee Table
     
    CREATE TABLE employee (
        userName varchar(12),
        password varchar(60) NOT NULL,
        firstName varchar(50) NOT NULL,
        middleName varchar(50) NULL,
        lastName varchar(50) NOT NULL,
        address varchar(50) NULL,
        birthday varchar(50) NULL,
        mobileNumber VARCHAR(11) NULL,
        accountStatus varchar(10) DEFAULT 'Valid',
        loginStatus varchar(10) DEFAULT 'Offline',
        userType VARCHAR(20) DEFAULT 'User',
        PRIMARY KEY (userName)
        );
Product Table
     
        CREATE TABLE product (
        productID int,
        productName varchar(50) NOT NULL,
        description varchar(100) NOT NULL,
        size varchar(20) NOT NULL,
        price decimal(8,2) NOT NULL,
        quantity int NOT NULL,
        PRIMARY KEY (productID)
        );
Cart Table
     
        CREATE TABLE cart (
        UserName varchar(50),
        productID int,
        productName varchar(50)
        );

#### CONTRIBUTING
This project is not actively maintained, and we are not accepting contributions at this time.

#### LICENSE
This project is licensed under the MIT License.

#### ACKNOWLEDGEMENTS
I would like to thank my professor, for their guidance and support throughout this project.

Feel free to explore the repository to understand the project structure and code. If you have any questions, you can contact me at salvadorjohncarl47@gmail.com

Thank you for visiting!

#### JK

#### GITBASH

"git checkout . "

"git reset --hard HEAD~ "

"git push origin Website-CSS --force"

