# okta-java-swagger-example-service
This was made by Aoji Xie (GSoC Student) as a proof of concept of using our Okta Account with Java/Springboot. 

This is an example Java REST API with Okta authentication and SwaggerUI

- Java Platform (JDK) 8
- Install Maven from the following site:
        https://maven.apache.org/install.html
- Set API keys: File Location : src\main\resources\application.properties
        spring.security.oauth2.resourceserver.jwt.jwk-set-uri: <PLACE OKTA ISSUER URL HERE FROM OKTA CONSOLE>/oauth2/default/v1/keys
- To run the API on port 8080
```sh
    mvn spring-boot:run 
```
- SwaggerUI page:  http://localhost:8080/swagger-ui/index.html
- Use curl commandline or postman to get access token from Okta token end point
