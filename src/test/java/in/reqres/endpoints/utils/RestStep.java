package in.reqres.endpoints.utils;

import in.reqres.configuration.EndpointConfiguration;
import in.reqres.configuration.EnderecosEnum;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;

import static in.reqres.configuration.EndpointConfiguration.getUrlApi;

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
}
