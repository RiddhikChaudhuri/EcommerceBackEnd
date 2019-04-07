drop table if exists customer;
drop table if exists item;
create table customer ( customerid varchar(255) not null, address varchar(255), customer_name varchar(255), customer_phone varchar(255), emailid varchar(255), primary key (customerid) );
create table item ( productid integer not null auto_increment, product_category varchar(255), product_description varchar(255), product_manufacturer varchar(255), product_name varchar(255), product_price double precision not null, stock varchar(255), primary key (productid) );