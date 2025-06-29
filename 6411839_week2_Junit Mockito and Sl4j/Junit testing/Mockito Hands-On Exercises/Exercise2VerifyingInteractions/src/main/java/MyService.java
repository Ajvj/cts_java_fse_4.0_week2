public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void fetchData() {
        int result = api.getData();
        System.out.println("Received number: " + result);
    }
}