public class UserService {
    private Notifier notifier;

    public UserService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void registerUser(String username) {
        String message = "Welcome " + username;
        notifier.sendMessage(message);
    }
}
