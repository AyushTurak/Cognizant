![img.png](output.png)

Securing RESTful Web Services with Spring Security

Follow steps below to secure all web services using Spring Security:

•	Open spring-learn project in Eclipse

•	Include spring security related libraries by adding the below dependency in pom.xml

    <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
    </dependency>

•	Rebuild the project in command line using mvn clean package command (ensure to include proxy details in mvn command).

•	To ensure the new libraries are enabled in Eclipse, right click the project and select Maven > Update Project

•	Create a new package 'com.cognizant.spring-learn.security'

•	Create a new class SecurityConfig in the new package created above which extends from WebSecurityConfigurerAdapter

•	Include annotations @Configuration and @EnableWebSecurity at class level

•	Import appropriate classes using Ctrl + Shift + O

•	Start the application and check the logs and test the REST service. Refer command below:

    curl -s http://localhost:8090/countries

•	The following error message is the expected response:

    {"timestamp":"2019-10-05T09:24:33.794+0000","status":401,"error":"Unauthorized","message":"Unauthorized","path":"/countries"}

•	The inclusion of @EnableWebSecurity has restricted access to all the web services with a common password.

•	Refer the logs to find out the password generated. Now execute the invocation of the service with password as specified below, which should get the list of countries. include the password from the log file after user:.

    curl -s -v -u user:d27321a9-0751-4f59-8fc6-f8633847a9b8 http://localhost:8090/countries

•	Find below a sample response for the above command:

[{"code":"US","name":"United States"},{"code":"DE","name":"Germany"},{"code":"IN","name":"India"},{"code":"JP","name":"Japan"}]* timeout on name lookup is not supported

*   Trying ::1...
* TCP_NODELAY set
* Connected to localhost (::1) port 8090 (#0)
* Server auth using Basic with user 'user'
> GET /countries HTTP/1.1
> Host: localhost:8090
> Authorization: Basic dXNlcjpkMjczMjFhOS0wNzUxLTRmNTktOGZjNi1mODYzMzg0N2E5Yjg=
> User-Agent: curl/7.55.0
> Accept: */*
>
< HTTP/1.1 200
< Set-Cookie: JSESSIONID=C0C907417A21BBCA9F30BEEA4B512AEE; Path=/; HttpOnly
< X-Content-Type-Options: nosniff
< X-XSS-Protection: 1; mode=block
< Cache-Control: no-cache, no-store, max-age=0, must-revalidate
< Pragma: no-cache
< Expires: 0
< X-Frame-Options: DENY
< Content-Type: application/json;charset=UTF-8
< Transfer-Encoding: chunked
< Date: Sat, 05 Oct 2019 09:36:34 GMT
<
{ [133 bytes data]
* Connection #0 to host localhost left intact

•	First line contains the country list responded successfully.

•	The above result contains the request header and response header.
  
•	The request lines starts with > and response lines starts with <
  
•	Notice the Authorization header in the HTTP Request

•	This denotes that it uses basic HTTP Authorisation. Whatever following Basic is Base64 encoding of the password that was supplied in the command line.