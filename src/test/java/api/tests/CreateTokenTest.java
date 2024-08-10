package api.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import api.endpoints.Routes;
import api.payloads.CreateTokenRequestPOJO;
import api.payloads.CreateTokenResponsePOJO;

public class CreateTokenTest extends BaseClass {

    
    @Test
    public void testAuthentication() {
        
        // Create the request body
        CreateTokenRequestPOJO authRequest = new CreateTokenRequestPOJO("admin", "password123");

        // Send the POST request and map the response to CreateTokenResponsePOJO class
        Response response = RestAssured
            .given()
                .contentType(getProperty("content.type"))
                .body(authRequest)
            .when()
                .post(Routes.BASE_URI)  // Assuming /auth is the correct endpoint
            .then()
                .statusCode(200)
                .extract()
                .response();
        
        CreateTokenResponsePOJO responsePayload = response.as(CreateTokenResponsePOJO.class);
        
        // Print the token
        System.out.println("Token: " + responsePayload.getToken());

        // Verify the response is not null and token is retrieved
        assertNotNull(responsePayload.getToken(), "Token should not be null");

        // Additional assertions to validate token or other response fields if needed
        // Example: assertEquals(responsePayload.getToken(), "expected_token_value");
    }
}
