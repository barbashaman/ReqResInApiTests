package in.reqres.endpoints.actions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import in.reqres.configuration.EnderecosEnum;
import in.reqres.domain.User;
import in.reqres.endpoints.utils.RestStep;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;

import java.io.IOException;

import static in.reqres.configuration.EndpointConfiguration.getUrlApi;
import static io.restassured.RestAssured.given;

public class UserAction {

    RestStep restStep;
    User user;
    ObjectMapper objectMapper;

    public UserAction() {
        restStep = new RestStep();
        objectMapper = new ObjectMapper();
        user = new User();
    }

    public void setUserId(Integer id) {
        user.setId(id.toString());
    }

    public void buscaUsuario() {
        try {
            restStep.setResponse(given().log().all().when().get(getUrlApi(EnderecosEnum.USERS) + "/" + user.getId()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void validaBuscaUsuario() {
        User userFromApi = restStep.getResponse().getBody().jsonPath().getObject("data", User.class);
        assert(restStep.getResponse().statusCode()==HttpStatus.SC_OK
                &&
                user.getId()==user.getId());
    }

    public void setUserCreationData(String email, String first_name, String last_name) {
        user = new User(email,first_name,last_name);

        try {
            String userJason = objectMapper.writeValueAsString(user);
            restStep.setRequest(given().log().all().contentType(ContentType.JSON)
                    .body(userJason));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void cadastraUsuario() {
        try {
            restStep.setResponse(restStep.getRequest().when().log().all().post(getUrlApi(EnderecosEnum.USERS)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void validaCadastroUsuario() {
        restStep.getResponse().then().statusCode(HttpStatus.SC_CREATED);
        assert (
                restStep
                        .getResponse()
                        .then().log().all()
                        .contentType(ContentType.JSON)
                        .extract().response().jsonPath()
                        .getString("error").equals("user not found"));
    }
}
