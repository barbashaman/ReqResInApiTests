package in.reqres.endpoints.actions;

import com.fasterxml.jackson.databind.ObjectMapper;
import in.reqres.configuration.TipoConexaoEnum;
import in.reqres.domain.User;
import in.reqres.endpoints.utils.RestStep;

import java.io.IOException;

import static in.reqres.configuration.EndpointConfiguration.getUrlApi;
import static io.restassured.RestAssured.given;

public class UserAction {

    RestStep restStep;
    User user;

    public UserAction() {
        restStep = new RestStep();
        user = new User();
    }

    public void setUserId(Integer id) {
        user.setId(id.toString());
    }

    public void buscaUsuario() {
        try {
            restStep.setResponse(given().log().all().when().get(getUrlApi(TipoConexaoEnum.USERS) + "/" + user.getId()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void validaBuscaUsuario() {
        User userFromApi = restStep.getResponse().getBody().jsonPath().getObject("data", User.class);
        assert(restStep.getResponse().statusCode()==200
                &&
                user.getId()==user.getId());
    }
}
