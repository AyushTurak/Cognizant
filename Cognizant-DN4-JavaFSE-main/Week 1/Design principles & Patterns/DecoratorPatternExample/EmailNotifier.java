public class EmailNotifier implements Notifier {
    private String message;

    public EmailNotifier(String message) {
        this.message = message;
    }

    @Override
    public String send() {
        return message;
    }
}
