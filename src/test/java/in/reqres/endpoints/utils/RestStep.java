package in.reqres.endpoints.utils;

import in.reqres.configuration.EndpointConfiguration;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;

public class RestStep {

    private RequestSpecification request;
    private Response response;

    public void setRequest(RequestSpecification request) {
        this.request = request;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public RequestSpecification getRequest() {
        return request;
    }

    public Response getResponse() {
        return response;
    }

    @Before
    public static void setUPInicial() throws IOException {

        new EndpointConfiguration();
        RestAssured.reset();
        RestAssured.baseURI = "https://reqres.in/api/";


    }
}
