public class test {
    public static void main(String[] args) {
        EmailNotifier emailNotifier = new EmailNotifier("Dear Parents,\nYour wards attendance is below 75%. Please punish him with best of your abilities, so that he won't dream about wasting your money again!\nRegards,\nHis Class Teacher,\nCSE A,\nYCCE");

        System.out.println("Without Decorators:-\n" + emailNotifier.send() + "\n");

        SMSNotifierDecorator smsNotifierDecorator =  new SMSNotifierDecorator(emailNotifier);
        System.out.println("With SMS decorator:-\n" + smsNotifierDecorator.send() + "\n");

        SlackNotifierDecorator slackNotifierDecorator = new SlackNotifierDecorator(emailNotifier);
        System.out.println("With Slack decorator:-\n" + slackNotifierDecorator.send() + "\n");
    }
}
