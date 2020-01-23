package exercise;

public enum ApiEndPoints {
    CRatesWeb("https://s3.eu-west-2.amazonaws.com/mosaic-test-app/rates/index.html"),
    CRatesApi("https://s3.eu-west-2.amazonaws.com/mosaic-test-app/rates/latest.json");

    private final String url;

    ApiEndPoints(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
