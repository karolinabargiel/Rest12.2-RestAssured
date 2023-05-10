package enums;

public enum Cities {
    LONDON("London", ",uk", "2643743", -0.1257F, 51.5085F),
    OXFORD("Oxford", ",uk", "2640729", -1.256F, 51.7522F),
    GDANSK("Gdańsk", ",pl", "3099434", 18.6464F, 54.3521F),
    KATOWICE("Katowice", "PL", "2020678", 50.213F, 19.0058F),
    PRAHA("Prague", "CZK", "2020173", 50.059F, 14.4464F),
    REYKJAVIK("Reykjavik", "IS", "91", 64.1459F, -21.9422F);


    private final String cityName;
    private final String country;
    private final String cityId;
    private final Float lat;
    private final Float lon;

    Cities(String cityName, String country, String cityId, Float lat, Float lon) {
        this.cityName = cityName;
        this.country = country;
        this.cityId = cityId;
        this.lat = lat;
        this.lon = lon;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountry() {
        return country;
    }

    public String getCityId() {
        return cityId;
    }

}
