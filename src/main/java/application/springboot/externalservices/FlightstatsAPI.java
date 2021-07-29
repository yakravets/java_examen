package application.springboot.externalservices;

public class FlightstatsAPI {

    private String url;
    private String appId;
    private String appKey;

    public FlightstatsAPI() {
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

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }
}
