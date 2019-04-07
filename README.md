# EcommerceBackEnd
BackEnd Services for Ecommerce BackEnd WebSite developed in Spring Boot and MySql

#HowToRunTheAbove
Start the Spring-Boot Application
Create Schema with name ecommerce
When the application starts , schema.sql and data.sql with initialize and load the database with the initial values.

#Endpoints
1) GET http://localhost:8080/listAllItems

2) POST http://localhost:8080/addItem 
Body:
{
	"productName": "",
	"productCategory":"",
	"productDescription":"",
	"productManufacturer":"",
	"productPrice":"",
	"unitStock":""
}

3) DELETE http://localhost:8080/deleteAllItem

4) DELETE Item By ID http://localhost:8080/deleteItem/{itemID}
