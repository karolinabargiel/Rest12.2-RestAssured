package config;

import java.io.InputStream;
import java.util.Properties;

public class Config {
    private Properties properties;

    public Config () {
        properties = getProperties();
    }


    private Properties getProperties() {
        Properties prop = new Properties();
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
            prop.load(inputStream);
        } catch (Exception e) {
            throw new RuntimeException("Cannot load properties file: " + e);
        }
        return prop;
    }

    public String getBaseUri () {
        return properties.getProperty("baseUri");
    }

    public String getPathToWeather () {
        return properties.getProperty("pathToWeather");
    }

    public String getAppId () {
        return properties.getProperty("appId");
    }

    public String getUnits () {
        return properties.getProperty("units");
    }



}
