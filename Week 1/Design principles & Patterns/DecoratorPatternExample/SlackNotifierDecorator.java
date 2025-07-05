public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public String send() {
        return "Incoming slack!\n" + super.send();
    }
}
