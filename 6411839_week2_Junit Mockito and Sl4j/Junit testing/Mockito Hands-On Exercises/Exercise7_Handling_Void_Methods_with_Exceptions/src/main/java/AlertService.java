public class AlertService {
    private final Notifier notifier;

    public AlertService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void triggerAlert(String msg) {
        try {
            notifier.send(msg);
        } catch (RuntimeException e) {
            System.out.println(" Exception occurred: " + e.getMessage());
        }
    }
}