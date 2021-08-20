# okta-java-swagger-example-service
This was made by Aoji Xie (GSoC Student) as a proof of concept of using our Okta Account with Java/Springboot. 

This is an example Java REST API with Okta authentication and SwaggerUI

- Java version: 1.8
- Install Maven from the following site:
        https://maven.apache.org/install.html
- Set API keys: File Location : src\main\resources\application.properties
        spring.security.oauth2.resourceserver.jwt.jwk-set-uri: <PLACE OKTA ISSUER URL HERE FROM OKTA CONSOLE>/oauth2/default/v1/keys
- To run the "My Photos Resource API" on port 8080
```sh
    mvn spring-boot:run 
```