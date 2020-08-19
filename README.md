# FeignClient_in_Spring_Boot_WIth_MicroServices

Feign Client (order-items-restclient)
Project 1: Order_items: http://localhost:8080/

Contains: FeignClient

Attachment: order_items-0.0.1-SNAPSHOT.war 

Deployment War (A): https://drive.google.com/file/d/1WjLxpH5pB1X7M3ZPHUxCqKAd4EdbcDoK/view?usp=sharing 

Project 2: Order_System: http://localhost:8090/ 

Contains: H2 Database

Attachment: order-system-0.0.1-SNAPSHOT.war 

Deployment War (B): https://drive.google.com/file/d/1Q5RgM-PZLln73rcYDQEgi6_xeWJMQe_3/view?usp=sharing

 
1.	Service URL: http://localhost:8090/orderItems/create 

Body: 
{"productName": "I Phone", "productQuantity": 10}
Response: (Status: 201 Created)
  

2.	Service URL: http://localhost:8090/orderItems/all 

Response: (Status: 200 OK)

[
    {
        "productCode": 1,
        "productName": "One Plus",
        "productQuantity": 10
    },
    {
        "productCode": 2,
        "productName": "I Phone",
        "productQuantity": 10
    }
]

 
 
3.	Service URL: http://localhost:8090/orderItems/create 

Body: 
{"customerName":"Tom","orderDate":"27 AUG 2020","shippingAddress":"#15 Orchard Road, Singapore","orderItems":"1","total":100}
Response: (Status: 201 Created)
  

4.	Service URL: http://localhost:8090/order/all 

Response: (Status: 200 OK)


[{"customerId":1,"customerName":"Lee","orderDate":"22 AUG 2020","shippingAddress":"#10 Ang Mo Kio Street, Singapore","orderItems":"10","total":10},{"customerId":2,"customerName":"Gokul","orderDate":"27 AUG 2020","shippingAddress":"#10 Rafles Place, Singapore","orderItems":"50","total":10},{"customerId":3,"customerName":"Tom","orderDate":"27 AUG 2020","shippingAddress":"#15 Orchard Road, Singapore","orderItems":"1","total":100}] 
 
 
