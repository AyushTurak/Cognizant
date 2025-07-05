public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    public String send() {
        return "SMS Alert!\n" + super.send();
    }
}
