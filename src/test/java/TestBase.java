import config.Config;
import enums.Cities;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.equalTo;


public class TestBase {

    static Config config = new Config();
    static String APP_ID = "appId";
    static String NAME = "q";
    static String PATH_NAME = "name";
    static String UNITS = "units";


    public static RequestSpecification getWeatherInfoByCityNameWithMetricUnits(Cities city) {
        return new RequestSpecBuilder().
                setBaseUri(config.getBaseUri()).setBasePath(config.getPathToWeather())
                .addParam(APP_ID, config.getAppId())
                .addParam(NAME, city.getCityName(), city.getCountry(), city.getCityId())
                .addParam(UNITS, config.getUnits())
                .build().filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

    }

    public static ResponseSpecification expectedCityNameToBe(Cities city) {
        return new ResponseSpecBuilder()
                .expectBody(PATH_NAME, equalTo(city.getCityName()))
                .expectStatusCode(200)
                .build();

    }
}
