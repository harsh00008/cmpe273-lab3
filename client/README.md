CMPE273 - Lab 3 - Consistent Hashing Cache Client
=================================================

This client adds and gets code from cache servers based on Consistent Hashing.


$ mvn clean package

# How to run the Cache client
$ ./bin/client.s

#Console output
```
=========== Adding Data to the server ===========

|-------------------------------------------|
| Selected Server : http://localhost:3000
| Adding data : (1, a)  
|-------------------------------------------|

|-------------------------------------------|
| Selected Server : http://localhost:3000
| Adding data : (2, b)  
|-------------------------------------------|

|-------------------------------------------|
| Selected Server : http://localhost:3001
| Adding data : (3, c)  
|-------------------------------------------|

|-------------------------------------------|
| Selected Server : http://localhost:3000
| Adding data : (4, d)  
|-------------------------------------------|

|-------------------------------------------|
| Selected Server : http://localhost:3001
| Adding data : (5, e)  
|-------------------------------------------|

|-------------------------------------------|
| Selected Server : http://localhost:3002
| Adding data : (6, f)  
|-------------------------------------------|

|-------------------------------------------|
| Selected Server : http://localhost:3001
| Adding data : (7, g)  
|-------------------------------------------|

|-------------------------------------------|
| Selected Server : http://localhost:3000
| Adding data : (8, h)  
|-------------------------------------------|

|-------------------------------------------|
| Selected Server : http://localhost:3002
| Adding data : (9, i)  
|-------------------------------------------|

|-------------------------------------------|
| Selected Server : http://localhost:3000
| Adding data : (10, j)  
|-------------------------------------------|

============ Getting Keys ===============

|=========================================|
| Execute : GET(1)
| Retrieving From : http://localhost:3000 
| Result : a
|=========================================|

|=========================================|
| Execute : GET(2)
| Retrieving From : http://localhost:3000 
| Result : b
|=========================================|

|=========================================|
| Execute : GET(3)
| Retrieving From : http://localhost:3001 
| Result : c
|=========================================|

|=========================================|
| Execute : GET(4)
| Retrieving From : http://localhost:3000 
| Result : d
|=========================================|

|=========================================|
| Execute : GET(5)
| Retrieving From : http://localhost:3001 
| Result : e
|=========================================|

|=========================================|
| Execute : GET(6)
| Retrieving From : http://localhost:3002 
| Result : f
|=========================================|

|=========================================|
| Execute : GET(7)
| Retrieving From : http://localhost:3001 
| Result : g
|=========================================|

|=========================================|
| Execute : GET(8)
| Retrieving From : http://localhost:3000 
| Result : h
|=========================================|

|=========================================|
| Execute : GET(9)
| Retrieving From : http://localhost:3002 
| Result : i
|=========================================|

|=========================================|
| Execute : GET(10)
| Retrieving From : http://localhost:3000 
| Result : j
|=========================================|


```
