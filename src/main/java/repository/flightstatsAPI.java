package repository;

public class flightstatsAPI {

    private String url;
    private String appId;
    private String appKey;

    public flightstatsAPI() {
        this.url = "https://api.flightstats.com/";
        this.appId = "";
        this.appKey = "";
    }

    public String getUrl() {
        return url;
    }

    public String getAppId() {
        return appId;
    }

    public String getAppKey() {
        return appKey;
    }
}
