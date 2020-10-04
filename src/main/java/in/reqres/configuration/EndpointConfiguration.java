package in.reqres.configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EndpointConfiguration {
    private static final String PROPERTIES_FILE_PATH = "./src/test/resources/api.properties";
    private static Properties props;

    private static void inicializaProperties() throws IOException {
        props = new Properties();
        props = getProperties();
    }

    public static String getUrlApi(EnderecosEnum endpoint) throws IOException {
        inicializaProperties();
        return props.getProperty(endpoint.toString());
    }

    private static Properties getProperties() throws IOException {
        FileInputStream file = new FileInputStream(PROPERTIES_FILE_PATH);
        props.load(file);
        file.close();
        return props;
    }
}