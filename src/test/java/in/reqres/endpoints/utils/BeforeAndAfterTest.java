package in.reqres.endpoints.utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;

public class BeforeAndAfterTest {

    @Before
    public void beforeScenario(Scenario scenario) throws IOException, InterruptedException {
        System.out.println("################## INICIO DE TESTE CENÁRIO: " + scenario.getName() + " ##################");
    }

    @After
    public void afterScenario(Scenario scenario) throws IOException {

        System.out.println("############################  FINALIZADO TESTE  #############################");
    }


}
