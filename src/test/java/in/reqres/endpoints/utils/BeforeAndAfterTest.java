package in.reqres.endpoints.utils;

import in.reqres.configuration.EnderecosEnum;
import in.reqres.configuration.EndpointConfiguration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.RestAssured;

import java.io.IOException;

import static in.reqres.configuration.EndpointConfiguration.getUrlApi;

public class BeforeAndAfterTest {

    @Before
    public void beforeScenario(Scenario scenario) throws IOException, InterruptedException {
        System.out.println("################## INICIO DE TESTE CENÁRIO: " + scenario.getName() + " ##################");

        new EndpointConfiguration();
        RestAssured.reset();
        RestAssured.baseURI = getUrlApi(EnderecosEnum.BASEURI);
    }

    @After
    public void afterScenario(Scenario scenario) throws IOException {

        System.out.println("############################  FINALIZADO TESTE  #############################");
    }


}
