public class MyService {
    private final ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public int fetchData() {
        return externalApi.getData();  // returns an int
    }
}

