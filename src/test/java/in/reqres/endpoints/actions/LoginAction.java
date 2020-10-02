package in.reqres.endpoints.actions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import in.reqres.configuration.TipoConexaoEnum;
import in.reqres.domain.Login;
import in.reqres.endpoints.utils.RestStep;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.IOException;

import static in.reqres.configuration.EndpointConfiguration.getUrlApi;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

public class LoginAction {

    private RestStep restStep;
    private Login login;
    private ObjectMapper objectMapper;

    public LoginAction() {
        this.restStep = new RestStep();
        this.objectMapper = new ObjectMapper();
    }

    public void informaEmailEPassword(String email, String password) {
        login = new Login(email, password);
        try {
            String loginJson = objectMapper.writeValueAsString(login);
            restStep.setRequest(given().log().all().contentType(ContentType.JSON)
                    .body(loginJson));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void efetuarLogin() {
        try {
            restStep.setResponse(restStep.getRequest().when().log().all().post(getUrlApi(TipoConexaoEnum.LOGIN)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void validaLogin() {
        restStep.getResponse().then().statusCode(200);
        String token = restStep
                .getResponse()
                .then().log().all()
                .contentType(ContentType.JSON)
                .extract().response().jsonPath()
                .getString("token");
        this.login.setToken(token);
        assert (!login.getToken().isEmpty());
    }


    public void validaUsuarioInvalido() {
        restStep.getResponse().then().statusCode(400);
        assert (
                restStep
                        .getResponse()
                        .then().log().all()
                        .contentType(ContentType.JSON)
                        .extract().response().jsonPath()
                        .getString("error").equals("user not found"));
    }
}
