![img.png](output.png)
REST - Country Web Service

REST - Get country based on country code

Write a REST service that returns a specific country based on country code. The country code should be case-insensitive.

Controller: `com.cognizant.spring-learn.controller.CountryController`

Method Annotation: `@GetMapping("/countries/{code}")`

Method Name: `getCountry(String code)`

Method Implemetation: Invoke `countryService.getCountry(code)`

Service Method: `com.cognizant.spring-learn.service.CountryService.getCountry(String code)
`

Service Method Implementation:

•	Get the country code using `@PathVariable`

•	Get country list from `country.xml`

•	Iterate through the country list

•	Make a case insensitive matching of country code and return the country.

•	Lambda expression can also be used instead of iterating the country list

Sample Request: `http://localhost:8083/country/in`

Sample Response:

`{
"code": "IN",
"name": "India"
}`
