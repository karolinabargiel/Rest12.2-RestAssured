import enums.Cities;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;


import static io.restassured.RestAssured.given;

public class WeatherTest extends TestBase {

    @ParameterizedTest
    @EnumSource(value = Cities.class)
    public void shouldGetWeatherByCityName(Cities cities) {
        given().
                spec(getWeatherInfoByCityNameWithMetricUnits(cities)).
                when().
                get().
                then().
                spec(expectedCityNameToBe(cities));


    }

}
