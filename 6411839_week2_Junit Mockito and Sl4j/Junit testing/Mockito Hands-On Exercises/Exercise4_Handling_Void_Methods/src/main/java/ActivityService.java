public class ActivityService {
    private Logger logger;

    public ActivityService(Logger logger) {
        this.logger = logger;
    }

    public void performAction(String user) {
        // Do some action...
        logger.logAction("Action performed by " + user);
    }
}