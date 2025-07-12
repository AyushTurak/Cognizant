![img.png](output.png)

REST - Country Web Service

Write a REST service that returns India country details in the earlier created spring learn application.

URL: /country

Controller: com.cognizant.spring-learn.controller.CountryController

Method Annotation: @RequestMapping

Method Name: getCountryIndia()

Method Implementation: Load India bean from spring xml configuration and return

Sample Request: http://localhost:8083/country

Sample Response:

    {
    "code": "IN",
    "name": "India"
    }

SME to explain the following aspects:

•	What happens in the controller method?

•	How the bean is converted into JSON reponse?

•	In network tab of developer tools show the HTTP header details received

•	In postman click on "Headers" tab to view the HTTP header details received
